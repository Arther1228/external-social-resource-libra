package com.suncreate.bigdata.washout;

import com.suncreate.bigdata.washout.model.mysql.ComDictMysql;
import com.suncreate.bigdata.washout.repository.mysql.ComDictMysqlRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class SpringDataJpaDemoApplicationTests {

    @Autowired
    private ComDictMysqlRepository comDictMysqlRepository;

    @Test
    public void saveTest(){

        ComDictMysql build = ComDictMysql.builder().id("10000")
                .dictCode("1")
                .dictClass("1")
                .dictTypeName("1")
                .dictTypeValue("1")
                .dictSource("x")
                .project("x")
                .addTime(new Date()).build();

        comDictMysqlRepository.save(build);
        System.out.println("save");
    }

}
