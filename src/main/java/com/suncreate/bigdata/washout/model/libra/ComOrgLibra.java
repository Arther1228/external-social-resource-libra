package com.suncreate.bigdata.washout.model.libra;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "com_org", schema = "vision_if", catalog = "shiny")
public class ComOrgLibra {
    @Id
/*    @GeneratedValue(generator = "orgGenerator")
    @GenericGenerator(name = "orgGenerator", strategy = "uuid")*/
    private Integer id;
    private String ssqxzqhdm;
    private String xqbm;
    private String xqmc;
    private String ldbm;
    private String ldh;
}

