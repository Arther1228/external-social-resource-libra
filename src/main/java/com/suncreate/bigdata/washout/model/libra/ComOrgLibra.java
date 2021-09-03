package com.suncreate.bigdata.washout.model.libra;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@Table(name = "com_org", schema = "vision_if", catalog = "shiny")
public class ComOrgLibra {
    @Id
    @GeneratedValue(generator = "orgGenerator")
    @GenericGenerator(name = "orgGenerator", strategy = "uuid")
    private String id;
    private String ssqxzqhdm;
    private String xqbm;
    private String xqmc;
    private String ldbm;
    private String ldh;
}

