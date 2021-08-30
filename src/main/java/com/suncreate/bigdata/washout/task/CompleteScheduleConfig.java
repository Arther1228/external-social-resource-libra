package com.suncreate.bigdata.washout.task;

import com.suncreate.bigdata.washout.service.SocialResourceMysql2LibraService;

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

    // 每5分钟
    @Value("${cronQuarter}")
    private String cronQuarter;

    @Autowired
    private SocialResourceMysql2LibraService socialResourceMysql2LibraService;

    /**
     * 执行定时任务.
     */
    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        // 每5分钟更新
        taskRegistrar.addTriggerTask(() -> socialResourceMysql2LibraService.updateCommunityTables(), triggerContext -> new CronTrigger(cronQuarter).nextExecutionTime(triggerContext));
    }

}
