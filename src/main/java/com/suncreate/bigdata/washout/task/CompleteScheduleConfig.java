package com.suncreate.bigdata.washout.task;

import com.suncreate.bigdata.washout.service.VmoOracle2LibraService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;

@Configuration
@EnableScheduling
public class CompleteScheduleConfig implements SchedulingConfigurer {

    private static final Logger log = LoggerFactory.getLogger(CompleteScheduleConfig.class);

    // 晚十点
    @Value("${cronDaily}")
    private String cronDaily;

    // 每15分钟
    @Value("${cronQuarter}")
    private String cronQuarter;

    @Autowired
    private VmoOracle2LibraService vmoOracle2LibraService;

    /**
     * 执行定时任务.
     */
    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        // 每天全量更新
        taskRegistrar.addTriggerTask(() -> vmoOracle2LibraService.start(true),
                triggerContext -> new CronTrigger(cronDaily).nextExecutionTime(triggerContext));

        // 每15分钟检测续传与执行存储
        taskRegistrar.addTriggerTask(() -> vmoOracle2LibraService.start(false),
                triggerContext -> new CronTrigger(cronQuarter).nextExecutionTime(triggerContext));
        taskRegistrar.addTriggerTask(() -> vmoOracle2LibraService.saveCarInfo(),
                triggerContext -> new CronTrigger(cronQuarter).nextExecutionTime(triggerContext));
    }

}
