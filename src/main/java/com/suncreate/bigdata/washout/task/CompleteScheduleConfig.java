package com.suncreate.bigdata.washout.task;

import com.suncreate.bigdata.washout.service.SyncDynamicDataService;
import com.suncreate.bigdata.washout.service.SyncStaticDataService;

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
    @Value("${cronStaticQuarter}")
    private String cronStaticQuarter;

    @Value("${cronDynamicQuarter}")
    private String cronDynamicQuarter;

    @Autowired
    private SyncStaticDataService syncStaticDataService;

    @Autowired
    private SyncDynamicDataService syncDynamicDataService;

    /**
     * 执行定时任务.
     */
    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        // 每20分钟更新
        taskRegistrar.addTriggerTask(() -> syncStaticDataService.updateCommunityTables(), triggerContext -> new CronTrigger(cronStaticQuarter).nextExecutionTime(triggerContext));

        // 每10分钟更新
        //taskRegistrar.addTriggerTask(() -> syncDynamicDataService.updateCommunityTablesToES(), triggerContext -> new CronTrigger(cronDynamicQuarter).nextExecutionTime(triggerContext));
    }

}
