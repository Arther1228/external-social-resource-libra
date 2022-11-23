package com.suncreate.bigdata.washout;

import com.suncreate.bigdata.washout.model.libra.ComOrgLibra;
import com.suncreate.bigdata.washout.model.libra.ComldxxLibra;
import com.suncreate.bigdata.washout.model.mysql.ComDictMysql;
import com.suncreate.bigdata.washout.repository.libra.LibraBaseRepository;
import com.suncreate.bigdata.washout.repository.mysql.MysqlBaseRepository;
import com.suncreate.bigdata.washout.utils.Params;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
public class SpringDataJpaDemoApplicationTests {

    @Autowired
    private MysqlBaseRepository mysqlBaseRepository;

    @Autowired
    private LibraBaseRepository libraBaseRepository;

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

        Boolean mysqlSave = mysqlBaseRepository.save(build);
        System.out.println(mysqlSave);

        Boolean libraSave = libraBaseRepository.save(ComOrgLibra.builder().id(111111).ldbm("1").ldh("2").ssqxzqhdm("1").xqbm("2").xqmc("x").build());
        System.out.println(libraSave);
    }

    @Test
    public void saveAllTest(){

        List<ComDictMysql> comDictMysqlList = new ArrayList<>();
        ComDictMysql build = ComDictMysql.builder().id("10000")
                .dictCode("1")
                .dictClass("1")
                .dictTypeName("1")
                .dictTypeValue("1")
                .dictSource("x")
                .project("x")
                .addTime(new Date()).build();

        ComDictMysql build2 = ComDictMysql.builder().id("10000")
                .dictCode("1")
                .dictClass("1")
                .dictTypeName("1")
                .dictTypeValue("1")
                .dictSource("x")
                .project("x")
                .addTime(new Date()).build();
        comDictMysqlList.add(build);
        comDictMysqlList.add(build2);
        mysqlBaseRepository.saveAll(comDictMysqlList);

/*        List<ComOrgLibra> devUserList = new ArrayList<>();
        devUserList.add(ComOrgLibra.builder().id("111111").ldbm("1").ldh("2").ssqxzqhdm("1").xqbm("2").xqmc("x").build());
        devUserList.add(ComOrgLibra.builder().id("111112").ldbm("1").ldh("2").ssqxzqhdm("1").xqbm("2").xqmc("x").build());
        libraBaseRepository.saveAll(devUserList);*/
    }

    @Test
    public void findByIdTest(){

        Object object1 = mysqlBaseRepository.findByid(ComDictMysql.class, "1");
        System.out.println(object1);

        Object object2 = libraBaseRepository.findByid(ComOrgLibra.class, "111111");
        System.out.println(object2);

    }

    @Test
    public void findMaxTimeTest(){

        Timestamp addTime = mysqlBaseRepository.findMaxTime(ComDictMysql.class, "addTime");
        System.out.println(addTime);

        Timestamp addtime = libraBaseRepository.findMaxTime(ComldxxLibra.class, "addTime");
        System.out.println(addtime);

    }

    @Test
    public void selectPageTest() {
        Params params = Params.builder().Limit(2, 1).build();

        List<ComDictMysql> comDictMysqlList = mysqlBaseRepository.findByParams(ComDictMysql.class, params);
        System.out.println(comDictMysqlList);

        List<ComOrgLibra> devUserList = libraBaseRepository.findByParams(ComOrgLibra.class, params);
        System.out.println(devUserList);

    }
}
