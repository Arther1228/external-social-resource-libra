package com.suncreate.bigdata.washout.task;

import com.suncreate.bigdata.washout.service.VmoOracle2LibraService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class OnAppStart implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(OnAppStart.class);

    @Autowired
    private VmoOracle2LibraService vmoOracle2LibraService;

    // 读取环境变量
    @Value("${pageskip}")
    private int pageSkip;

    @Override
    public void run(String... args) throws Exception {
        log.debug("app start runner ...");
        if (pageSkip > 0) {
            log.info("page skip got " + pageSkip + ", setting to service...");
            vmoOracle2LibraService.setPageSkip(pageSkip);
            vmoOracle2LibraService.start(false);
        } else {
            vmoOracle2LibraService.start(true);
        }
    }

}
