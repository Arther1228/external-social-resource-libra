package com.suncreate.bigdata.washout.task;

import com.suncreate.bigdata.washout.service.SyncStaticDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class OnAppStart implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(OnAppStart.class);

    @Autowired
    private SyncStaticDataService syncStaticDataService;

    @Override
    public void run(String... args) throws Exception {
        log.debug("app start runner ...");
        syncStaticDataService.updateCommunityTables();
        //syncDynamicDataService.updateCommunityTablesToES();
    }
}
