package com.suncreate.bigdata.washout.model.oracle;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "V_JJZD_WP_JDCJBXX", schema = "HFSJZX_DB", catalog = "")
public class VJjzdWpJdcjbxxOracle {
    private Long objectid;
    private String xh;
    private String hpzl;
    private String hphm;
    private String clpp1;
    private String clxh;
    private String clpp2;
    private String gcjk;
    private String zzg;
    private String zzcmc;
    private String clsbdh;
    private String fdjh;
    private String cllx;
    private String csys;
    private String syxz;
    private String sfzmhm;
    private String sfzmmc;
    private String syr;
    private String syq;
    private Date ccdjrq;
    private Date djrq;
    private Date yxqz;
    private Date qzbfqz;
    private String fzjg;
    private String glbm;
    private Date fprq;
    private Date fzrq;
    private Date fdjrq;
    private Date fhgzrq;
    private Date bxzzrq;
    private Long bpcs;
    private Long bzcs;
    private Long bdjcs;
    private String djzsbh;
    private Long zdjzshs;
    private String dabh;
    private String xzqh;
    private String zt;
    private String dybj;
    private String jbr;
    private String clly;
    private String lsh;
    private String fdjxh;
    private String rlzl;
    private Long pl;
    private Long gl;
    private String zxxs;
    private Long cwkc;
    private Long cwkk;
    private Long cwkg;
    private Long hxnbcd;
    private Long hxnbkd;
    private Long hxnbgd;
    private Long gbthps;
    private Long zs;
    private Long zj;
    private Long qlj;
    private Long hlj;
    private String ltgg;
    private Long lts;
    private Long zzl;
    private Long zbzl;
    private Long hdzzl;
    private Long hdzk;
    private Long zqyzl;
    private Long qpzk;
    private Long hpzk;
    private String hbdbqk;
    private Date ccrq;
    private String hdfs;
    private String llpz1;
    private String pzbh1;
    private String llpz2;
    private String pzbh2;
    private String xsdw;
    private Long xsjg;
    private Date xsrq;
    private String jkpz;
    private String jkpzhm;
    private String hgzbh;
    private String nszm;
    private String nszmbh;
    private Date gxrq;
    private String xgzl;
    private String qmbh;
    private String hmbh;
    private String bz;
    private String jyw;
    private String zsxzqh;
    private String zsxxdz;
    private String yzbm1;
    private String lxdh;
    private String zzz;
    private String zzxzqh;
    private String zzxxdz;
    private String yzbm2;
    private String zdyzt;
    private String yxh;
    private String cyry;
    private String dphgzbh;
    private String sqdm;
    private String clyt;
    private String ytsx;
    private String dzyx;
    private String xszbh;
    private String sjhm;
    private String jyhgbzbh;
    private String dwbh;
    private Date syqsrq;
    private Date yqjyqzbfqz;
    private Date yqjyqz2;
    private Long fdjgs;
    private String sfyzhgn;
    private String zzjglx;
    private String wxmbc;
    private String ncdqsy;
    private String createdate;
    private String etldate;
    private String md5;
    private String flag1;
    private String flag2;
    private String flag3;

    @Id
    @Column(name = "OBJECTID")
    public Long getObjectid() {
        return objectid;
    }

    public void setObjectid(Long objectid) {
        this.objectid = objectid;
    }

    @Basic
    @Column(name = "XH")
    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    @Basic
    @Column(name = "HPZL")
    public String getHpzl() {
        return hpzl;
    }

    public void setHpzl(String hpzl) {
        this.hpzl = hpzl;
    }

    @Basic
    @Column(name = "HPHM")
    public String getHphm() {
        return hphm;
    }

    public void setHphm(String hphm) {
        this.hphm = hphm;
    }

    @Basic
    @Column(name = "CLPP1")
    public String getClpp1() {
        return clpp1;
    }

    public void setClpp1(String clpp1) {
        this.clpp1 = clpp1;
    }

    @Basic
    @Column(name = "CLXH")
    public String getClxh() {
        return clxh;
    }

    public void setClxh(String clxh) {
        this.clxh = clxh;
    }

    @Basic
    @Column(name = "CLPP2")
    public String getClpp2() {
        return clpp2;
    }

    public void setClpp2(String clpp2) {
        this.clpp2 = clpp2;
    }

    @Basic
    @Column(name = "GCJK")
    public String getGcjk() {
        return gcjk;
    }

    public void setGcjk(String gcjk) {
        this.gcjk = gcjk;
    }

    @Basic
    @Column(name = "ZZG")
    public String getZzg() {
        return zzg;
    }

    public void setZzg(String zzg) {
        this.zzg = zzg;
    }

    @Basic
    @Column(name = "ZZCMC")
    public String getZzcmc() {
        return zzcmc;
    }

    public void setZzcmc(String zzcmc) {
        this.zzcmc = zzcmc;
    }

    @Basic
    @Column(name = "CLSBDH")
    public String getClsbdh() {
        return clsbdh;
    }

    public void setClsbdh(String clsbdh) {
        this.clsbdh = clsbdh;
    }

    @Basic
    @Column(name = "FDJH")
    public String getFdjh() {
        return fdjh;
    }

    public void setFdjh(String fdjh) {
        this.fdjh = fdjh;
    }

    @Basic
    @Column(name = "CLLX")
    public String getCllx() {
        return cllx;
    }

    public void setCllx(String cllx) {
        this.cllx = cllx;
    }

    @Basic
    @Column(name = "CSYS")
    public String getCsys() {
        return csys;
    }

    public void setCsys(String csys) {
        this.csys = csys;
    }

    @Basic
    @Column(name = "SYXZ")
    public String getSyxz() {
        return syxz;
    }

    public void setSyxz(String syxz) {
        this.syxz = syxz;
    }

    @Basic
    @Column(name = "SFZMHM")
    public String getSfzmhm() {
        return sfzmhm;
    }

    public void setSfzmhm(String sfzmhm) {
        this.sfzmhm = sfzmhm;
    }

    @Basic
    @Column(name = "SFZMMC")
    public String getSfzmmc() {
        return sfzmmc;
    }

    public void setSfzmmc(String sfzmmc) {
        this.sfzmmc = sfzmmc;
    }

    @Basic
    @Column(name = "SYR")
    public String getSyr() {
        return syr;
    }

    public void setSyr(String syr) {
        this.syr = syr;
    }

    @Basic
    @Column(name = "SYQ")
    public String getSyq() {
        return syq;
    }

    public void setSyq(String syq) {
        this.syq = syq;
    }

    @Basic
    @Column(name = "CCDJRQ")
    public Date getCcdjrq() {
        return ccdjrq;
    }

    public void setCcdjrq(Date ccdjrq) {
        this.ccdjrq = ccdjrq;
    }

    @Basic
    @Column(name = "DJRQ")
    public Date getDjrq() {
        return djrq;
    }

    public void setDjrq(Date djrq) {
        this.djrq = djrq;
    }

    @Basic
    @Column(name = "YXQZ")
    public Date getYxqz() {
        return yxqz;
    }

    public void setYxqz(Date yxqz) {
        this.yxqz = yxqz;
    }

    @Basic
    @Column(name = "QZBFQZ")
    public Date getQzbfqz() {
        return qzbfqz;
    }

    public void setQzbfqz(Date qzbfqz) {
        this.qzbfqz = qzbfqz;
    }

    @Basic
    @Column(name = "FZJG")
    public String getFzjg() {
        return fzjg;
    }

    public void setFzjg(String fzjg) {
        this.fzjg = fzjg;
    }

    @Basic
    @Column(name = "GLBM")
    public String getGlbm() {
        return glbm;
    }

    public void setGlbm(String glbm) {
        this.glbm = glbm;
    }

    @Basic
    @Column(name = "FPRQ")
    public Date getFprq() {
        return fprq;
    }

    public void setFprq(Date fprq) {
        this.fprq = fprq;
    }

    @Basic
    @Column(name = "FZRQ")
    public Date getFzrq() {
        return fzrq;
    }

    public void setFzrq(Date fzrq) {
        this.fzrq = fzrq;
    }

    @Basic
    @Column(name = "FDJRQ")
    public Date getFdjrq() {
        return fdjrq;
    }

    public void setFdjrq(Date fdjrq) {
        this.fdjrq = fdjrq;
    }

    @Basic
    @Column(name = "FHGZRQ")
    public Date getFhgzrq() {
        return fhgzrq;
    }

    public void setFhgzrq(Date fhgzrq) {
        this.fhgzrq = fhgzrq;
    }

    @Basic
    @Column(name = "BXZZRQ")
    public Date getBxzzrq() {
        return bxzzrq;
    }

    public void setBxzzrq(Date bxzzrq) {
        this.bxzzrq = bxzzrq;
    }

    @Basic
    @Column(name = "BPCS")
    public Long getBpcs() {
        return bpcs;
    }

    public void setBpcs(Long bpcs) {
        this.bpcs = bpcs;
    }

    @Basic
    @Column(name = "BZCS")
    public Long getBzcs() {
        return bzcs;
    }

    public void setBzcs(Long bzcs) {
        this.bzcs = bzcs;
    }

    @Basic
    @Column(name = "BDJCS")
    public Long getBdjcs() {
        return bdjcs;
    }

    public void setBdjcs(Long bdjcs) {
        this.bdjcs = bdjcs;
    }

    @Basic
    @Column(name = "DJZSBH")
    public String getDjzsbh() {
        return djzsbh;
    }

    public void setDjzsbh(String djzsbh) {
        this.djzsbh = djzsbh;
    }

    @Basic
    @Column(name = "ZDJZSHS")
    public Long getZdjzshs() {
        return zdjzshs;
    }

    public void setZdjzshs(Long zdjzshs) {
        this.zdjzshs = zdjzshs;
    }

    @Basic
    @Column(name = "DABH")
    public String getDabh() {
        return dabh;
    }

    public void setDabh(String dabh) {
        this.dabh = dabh;
    }

    @Basic
    @Column(name = "XZQH")
    public String getXzqh() {
        return xzqh;
    }

    public void setXzqh(String xzqh) {
        this.xzqh = xzqh;
    }

    @Basic
    @Column(name = "ZT")
    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }

    @Basic
    @Column(name = "DYBJ")
    public String getDybj() {
        return dybj;
    }

    public void setDybj(String dybj) {
        this.dybj = dybj;
    }

    @Basic
    @Column(name = "JBR")
    public String getJbr() {
        return jbr;
    }

    public void setJbr(String jbr) {
        this.jbr = jbr;
    }

    @Basic
    @Column(name = "CLLY")
    public String getClly() {
        return clly;
    }

    public void setClly(String clly) {
        this.clly = clly;
    }

    @Basic
    @Column(name = "LSH")
    public String getLsh() {
        return lsh;
    }

    public void setLsh(String lsh) {
        this.lsh = lsh;
    }

    @Basic
    @Column(name = "FDJXH")
    public String getFdjxh() {
        return fdjxh;
    }

    public void setFdjxh(String fdjxh) {
        this.fdjxh = fdjxh;
    }

    @Basic
    @Column(name = "RLZL")
    public String getRlzl() {
        return rlzl;
    }

    public void setRlzl(String rlzl) {
        this.rlzl = rlzl;
    }

    @Basic
    @Column(name = "PL")
    public Long getPl() {
        return pl;
    }

    public void setPl(Long pl) {
        this.pl = pl;
    }

    @Basic
    @Column(name = "GL")
    public Long getGl() {
        return gl;
    }

    public void setGl(Long gl) {
        this.gl = gl;
    }

    @Basic
    @Column(name = "ZXXS")
    public String getZxxs() {
        return zxxs;
    }

    public void setZxxs(String zxxs) {
        this.zxxs = zxxs;
    }

    @Basic
    @Column(name = "CWKC")
    public Long getCwkc() {
        return cwkc;
    }

    public void setCwkc(Long cwkc) {
        this.cwkc = cwkc;
    }

    @Basic
    @Column(name = "CWKK")
    public Long getCwkk() {
        return cwkk;
    }

    public void setCwkk(Long cwkk) {
        this.cwkk = cwkk;
    }

    @Basic
    @Column(name = "CWKG")
    public Long getCwkg() {
        return cwkg;
    }

    public void setCwkg(Long cwkg) {
        this.cwkg = cwkg;
    }

    @Basic
    @Column(name = "HXNBCD")
    public Long getHxnbcd() {
        return hxnbcd;
    }

    public void setHxnbcd(Long hxnbcd) {
        this.hxnbcd = hxnbcd;
    }

    @Basic
    @Column(name = "HXNBKD")
    public Long getHxnbkd() {
        return hxnbkd;
    }

    public void setHxnbkd(Long hxnbkd) {
        this.hxnbkd = hxnbkd;
    }

    @Basic
    @Column(name = "HXNBGD")
    public Long getHxnbgd() {
        return hxnbgd;
    }

    public void setHxnbgd(Long hxnbgd) {
        this.hxnbgd = hxnbgd;
    }

    @Basic
    @Column(name = "GBTHPS")
    public Long getGbthps() {
        return gbthps;
    }

    public void setGbthps(Long gbthps) {
        this.gbthps = gbthps;
    }

    @Basic
    @Column(name = "ZS")
    public Long isZs() {
        return zs;
    }

    public void setZs(Long zs) {
        this.zs = zs;
    }

    @Basic
    @Column(name = "ZJ")
    public Long getZj() {
        return zj;
    }

    public void setZj(Long zj) {
        this.zj = zj;
    }

    @Basic
    @Column(name = "QLJ")
    public Long getQlj() {
        return qlj;
    }

    public void setQlj(Long qlj) {
        this.qlj = qlj;
    }

    @Basic
    @Column(name = "HLJ")
    public Long getHlj() {
        return hlj;
    }

    public void setHlj(Long hlj) {
        this.hlj = hlj;
    }

    @Basic
    @Column(name = "LTGG")
    public String getLtgg() {
        return ltgg;
    }

    public void setLtgg(String ltgg) {
        this.ltgg = ltgg;
    }

    @Basic
    @Column(name = "LTS")
    public Long getLts() {
        return lts;
    }

    public void setLts(Long lts) {
        this.lts = lts;
    }

    @Basic
    @Column(name = "ZZL")
    public Long getZzl() {
        return zzl;
    }

    public void setZzl(Long zzl) {
        this.zzl = zzl;
    }

    @Basic
    @Column(name = "ZBZL")
    public Long getZbzl() {
        return zbzl;
    }

    public void setZbzl(Long zbzl) {
        this.zbzl = zbzl;
    }

    @Basic
    @Column(name = "HDZZL")
    public Long getHdzzl() {
        return hdzzl;
    }

    public void setHdzzl(Long hdzzl) {
        this.hdzzl = hdzzl;
    }

    @Basic
    @Column(name = "HDZK")
    public Long getHdzk() {
        return hdzk;
    }

    public void setHdzk(Long hdzk) {
        this.hdzk = hdzk;
    }

    @Basic
    @Column(name = "ZQYZL")
    public Long getZqyzl() {
        return zqyzl;
    }

    public void setZqyzl(Long zqyzl) {
        this.zqyzl = zqyzl;
    }

    @Basic
    @Column(name = "QPZK")
    public Long getQpzk() {
        return qpzk;
    }

    public void setQpzk(Long qpzk) {
        this.qpzk = qpzk;
    }

    @Basic
    @Column(name = "HPZK")
    public Long getHpzk() {
        return hpzk;
    }

    public void setHpzk(Long hpzk) {
        this.hpzk = hpzk;
    }

    @Basic
    @Column(name = "HBDBQK")
    public String getHbdbqk() {
        return hbdbqk;
    }

    public void setHbdbqk(String hbdbqk) {
        this.hbdbqk = hbdbqk;
    }

    @Basic
    @Column(name = "CCRQ")
    public Date getCcrq() {
        return ccrq;
    }

    public void setCcrq(Date ccrq) {
        this.ccrq = ccrq;
    }

    @Basic
    @Column(name = "HDFS")
    public String getHdfs() {
        return hdfs;
    }

    public void setHdfs(String hdfs) {
        this.hdfs = hdfs;
    }

    @Basic
    @Column(name = "LLPZ1")
    public String getLlpz1() {
        return llpz1;
    }

    public void setLlpz1(String llpz1) {
        this.llpz1 = llpz1;
    }

    @Basic
    @Column(name = "PZBH1")
    public String getPzbh1() {
        return pzbh1;
    }

    public void setPzbh1(String pzbh1) {
        this.pzbh1 = pzbh1;
    }

    @Basic
    @Column(name = "LLPZ2")
    public String getLlpz2() {
        return llpz2;
    }

    public void setLlpz2(String llpz2) {
        this.llpz2 = llpz2;
    }

    @Basic
    @Column(name = "PZBH2")
    public String getPzbh2() {
        return pzbh2;
    }

    public void setPzbh2(String pzbh2) {
        this.pzbh2 = pzbh2;
    }

    @Basic
    @Column(name = "XSDW")
    public String getXsdw() {
        return xsdw;
    }

    public void setXsdw(String xsdw) {
        this.xsdw = xsdw;
    }

    @Basic
    @Column(name = "XSJG")
    public Long getXsjg() {
        return xsjg;
    }

    public void setXsjg(Long xsjg) {
        this.xsjg = xsjg;
    }

    @Basic
    @Column(name = "XSRQ")
    public Date getXsrq() {
        return xsrq;
    }

    public void setXsrq(Date xsrq) {
        this.xsrq = xsrq;
    }

    @Basic
    @Column(name = "JKPZ")
    public String getJkpz() {
        return jkpz;
    }

    public void setJkpz(String jkpz) {
        this.jkpz = jkpz;
    }

    @Basic
    @Column(name = "JKPZHM")
    public String getJkpzhm() {
        return jkpzhm;
    }

    public void setJkpzhm(String jkpzhm) {
        this.jkpzhm = jkpzhm;
    }

    @Basic
    @Column(name = "HGZBH")
    public String getHgzbh() {
        return hgzbh;
    }

    public void setHgzbh(String hgzbh) {
        this.hgzbh = hgzbh;
    }

    @Basic
    @Column(name = "NSZM")
    public String getNszm() {
        return nszm;
    }

    public void setNszm(String nszm) {
        this.nszm = nszm;
    }

    @Basic
    @Column(name = "NSZMBH")
    public String getNszmbh() {
        return nszmbh;
    }

    public void setNszmbh(String nszmbh) {
        this.nszmbh = nszmbh;
    }

    @Basic
    @Column(name = "GXRQ")
    public Date getGxrq() {
        return gxrq;
    }

    public void setGxrq(Date gxrq) {
        this.gxrq = gxrq;
    }

    @Basic
    @Column(name = "XGZL")
    public String getXgzl() {
        return xgzl;
    }

    public void setXgzl(String xgzl) {
        this.xgzl = xgzl;
    }

    @Basic
    @Column(name = "QMBH")
    public String getQmbh() {
        return qmbh;
    }

    public void setQmbh(String qmbh) {
        this.qmbh = qmbh;
    }

    @Basic
    @Column(name = "HMBH")
    public String getHmbh() {
        return hmbh;
    }

    public void setHmbh(String hmbh) {
        this.hmbh = hmbh;
    }

    @Basic
    @Column(name = "BZ")
    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    @Basic
    @Column(name = "JYW")
    public String getJyw() {
        return jyw;
    }

    public void setJyw(String jyw) {
        this.jyw = jyw;
    }

    @Basic
    @Column(name = "ZSXZQH")
    public String getZsxzqh() {
        return zsxzqh;
    }

    public void setZsxzqh(String zsxzqh) {
        this.zsxzqh = zsxzqh;
    }

    @Basic
    @Column(name = "ZSXXDZ")
    public String getZsxxdz() {
        return zsxxdz;
    }

    public void setZsxxdz(String zsxxdz) {
        this.zsxxdz = zsxxdz;
    }

    @Basic
    @Column(name = "YZBM1")
    public String getYzbm1() {
        return yzbm1;
    }

    public void setYzbm1(String yzbm1) {
        this.yzbm1 = yzbm1;
    }

    @Basic
    @Column(name = "LXDH")
    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    @Basic
    @Column(name = "ZZZ")
    public String getZzz() {
        return zzz;
    }

    public void setZzz(String zzz) {
        this.zzz = zzz;
    }

    @Basic
    @Column(name = "ZZXZQH")
    public String getZzxzqh() {
        return zzxzqh;
    }

    public void setZzxzqh(String zzxzqh) {
        this.zzxzqh = zzxzqh;
    }

    @Basic
    @Column(name = "ZZXXDZ")
    public String getZzxxdz() {
        return zzxxdz;
    }

    public void setZzxxdz(String zzxxdz) {
        this.zzxxdz = zzxxdz;
    }

    @Basic
    @Column(name = "YZBM2")
    public String getYzbm2() {
        return yzbm2;
    }

    public void setYzbm2(String yzbm2) {
        this.yzbm2 = yzbm2;
    }

    @Basic
    @Column(name = "ZDYZT")
    public String getZdyzt() {
        return zdyzt;
    }

    public void setZdyzt(String zdyzt) {
        this.zdyzt = zdyzt;
    }

    @Basic
    @Column(name = "YXH")
    public String getYxh() {
        return yxh;
    }

    public void setYxh(String yxh) {
        this.yxh = yxh;
    }

    @Basic
    @Column(name = "CYRY")
    public String getCyry() {
        return cyry;
    }

    public void setCyry(String cyry) {
        this.cyry = cyry;
    }

    @Basic
    @Column(name = "DPHGZBH")
    public String getDphgzbh() {
        return dphgzbh;
    }

    public void setDphgzbh(String dphgzbh) {
        this.dphgzbh = dphgzbh;
    }

    @Basic
    @Column(name = "SQDM")
    public String getSqdm() {
        return sqdm;
    }

    public void setSqdm(String sqdm) {
        this.sqdm = sqdm;
    }

    @Basic
    @Column(name = "CLYT")
    public String getClyt() {
        return clyt;
    }

    public void setClyt(String clyt) {
        this.clyt = clyt;
    }

    @Basic
    @Column(name = "YTSX")
    public String getYtsx() {
        return ytsx;
    }

    public void setYtsx(String ytsx) {
        this.ytsx = ytsx;
    }

    @Basic
    @Column(name = "DZYX")
    public String getDzyx() {
        return dzyx;
    }

    public void setDzyx(String dzyx) {
        this.dzyx = dzyx;
    }

    @Basic
    @Column(name = "XSZBH")
    public String getXszbh() {
        return xszbh;
    }

    public void setXszbh(String xszbh) {
        this.xszbh = xszbh;
    }

    @Basic
    @Column(name = "SJHM")
    public String getSjhm() {
        return sjhm;
    }

    public void setSjhm(String sjhm) {
        this.sjhm = sjhm;
    }

    @Basic
    @Column(name = "JYHGBZBH")
    public String getJyhgbzbh() {
        return jyhgbzbh;
    }

    public void setJyhgbzbh(String jyhgbzbh) {
        this.jyhgbzbh = jyhgbzbh;
    }

    @Basic
    @Column(name = "DWBH")
    public String getDwbh() {
        return dwbh;
    }

    public void setDwbh(String dwbh) {
        this.dwbh = dwbh;
    }

    @Basic
    @Column(name = "SYQSRQ")
    public Date getSyqsrq() {
        return syqsrq;
    }

    public void setSyqsrq(Date syqsrq) {
        this.syqsrq = syqsrq;
    }

    @Basic
    @Column(name = "YQJYQZBFQZ")
    public Date getYqjyqzbfqz() {
        return yqjyqzbfqz;
    }

    public void setYqjyqzbfqz(Date yqjyqzbfqz) {
        this.yqjyqzbfqz = yqjyqzbfqz;
    }

    @Basic
    @Column(name = "YQJYQZ2")
    public Date getYqjyqz2() {
        return yqjyqz2;
    }

    public void setYqjyqz2(Date yqjyqz2) {
        this.yqjyqz2 = yqjyqz2;
    }

    @Basic
    @Column(name = "FDJGS")
    public Long getFdjgs() {
        return fdjgs;
    }

    public void setFdjgs(Long fdjgs) {
        this.fdjgs = fdjgs;
    }

    @Basic
    @Column(name = "SFYZHGN")
    public String getSfyzhgn() {
        return sfyzhgn;
    }

    public void setSfyzhgn(String sfyzhgn) {
        this.sfyzhgn = sfyzhgn;
    }

    @Basic
    @Column(name = "ZZJGLX")
    public String getZzjglx() {
        return zzjglx;
    }

    public void setZzjglx(String zzjglx) {
        this.zzjglx = zzjglx;
    }

    @Basic
    @Column(name = "WXMBC")
    public String getWxmbc() {
        return wxmbc;
    }

    public void setWxmbc(String wxmbc) {
        this.wxmbc = wxmbc;
    }

    @Basic
    @Column(name = "NCDQSY")
    public String getNcdqsy() {
        return ncdqsy;
    }

    public void setNcdqsy(String ncdqsy) {
        this.ncdqsy = ncdqsy;
    }

    @Basic
    @Column(name = "CREATEDATE")
    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    @Basic
    @Column(name = "ETLDATE")
    public String getEtldate() {
        return etldate;
    }

    public void setEtldate(String etldate) {
        this.etldate = etldate;
    }

    @Basic
    @Column(name = "MD5")
    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    @Basic
    @Column(name = "FLAG1")
    public String getFlag1() {
        return flag1;
    }

    public void setFlag1(String flag1) {
        this.flag1 = flag1;
    }

    @Basic
    @Column(name = "FLAG2")
    public String getFlag2() {
        return flag2;
    }

    public void setFlag2(String flag2) {
        this.flag2 = flag2;
    }

    @Basic
    @Column(name = "FLAG3")
    public String getFlag3() {
        return flag3;
    }

    public void setFlag3(String flag3) {
        this.flag3 = flag3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VJjzdWpJdcjbxxOracle that = (VJjzdWpJdcjbxxOracle) o;
        return zs == that.zs &&
                zj == that.zj &&
                Objects.equals(objectid, that.objectid) &&
                Objects.equals(xh, that.xh) &&
                Objects.equals(hpzl, that.hpzl) &&
                Objects.equals(hphm, that.hphm) &&
                Objects.equals(clpp1, that.clpp1) &&
                Objects.equals(clxh, that.clxh) &&
                Objects.equals(clpp2, that.clpp2) &&
                Objects.equals(gcjk, that.gcjk) &&
                Objects.equals(zzg, that.zzg) &&
                Objects.equals(zzcmc, that.zzcmc) &&
                Objects.equals(clsbdh, that.clsbdh) &&
                Objects.equals(fdjh, that.fdjh) &&
                Objects.equals(cllx, that.cllx) &&
                Objects.equals(csys, that.csys) &&
                Objects.equals(syxz, that.syxz) &&
                Objects.equals(sfzmhm, that.sfzmhm) &&
                Objects.equals(sfzmmc, that.sfzmmc) &&
                Objects.equals(syr, that.syr) &&
                Objects.equals(syq, that.syq) &&
                Objects.equals(ccdjrq, that.ccdjrq) &&
                Objects.equals(djrq, that.djrq) &&
                Objects.equals(yxqz, that.yxqz) &&
                Objects.equals(qzbfqz, that.qzbfqz) &&
                Objects.equals(fzjg, that.fzjg) &&
                Objects.equals(glbm, that.glbm) &&
                Objects.equals(fprq, that.fprq) &&
                Objects.equals(fzrq, that.fzrq) &&
                Objects.equals(fdjrq, that.fdjrq) &&
                Objects.equals(fhgzrq, that.fhgzrq) &&
                Objects.equals(bxzzrq, that.bxzzrq) &&
                Objects.equals(bpcs, that.bpcs) &&
                Objects.equals(bzcs, that.bzcs) &&
                Objects.equals(bdjcs, that.bdjcs) &&
                Objects.equals(djzsbh, that.djzsbh) &&
                Objects.equals(zdjzshs, that.zdjzshs) &&
                Objects.equals(dabh, that.dabh) &&
                Objects.equals(xzqh, that.xzqh) &&
                Objects.equals(zt, that.zt) &&
                Objects.equals(dybj, that.dybj) &&
                Objects.equals(jbr, that.jbr) &&
                Objects.equals(clly, that.clly) &&
                Objects.equals(lsh, that.lsh) &&
                Objects.equals(fdjxh, that.fdjxh) &&
                Objects.equals(rlzl, that.rlzl) &&
                Objects.equals(pl, that.pl) &&
                Objects.equals(gl, that.gl) &&
                Objects.equals(zxxs, that.zxxs) &&
                Objects.equals(cwkc, that.cwkc) &&
                Objects.equals(cwkk, that.cwkk) &&
                Objects.equals(cwkg, that.cwkg) &&
                Objects.equals(hxnbcd, that.hxnbcd) &&
                Objects.equals(hxnbkd, that.hxnbkd) &&
                Objects.equals(hxnbgd, that.hxnbgd) &&
                Objects.equals(gbthps, that.gbthps) &&
                Objects.equals(qlj, that.qlj) &&
                Objects.equals(hlj, that.hlj) &&
                Objects.equals(ltgg, that.ltgg) &&
                Objects.equals(lts, that.lts) &&
                Objects.equals(zzl, that.zzl) &&
                Objects.equals(zbzl, that.zbzl) &&
                Objects.equals(hdzzl, that.hdzzl) &&
                Objects.equals(hdzk, that.hdzk) &&
                Objects.equals(zqyzl, that.zqyzl) &&
                Objects.equals(qpzk, that.qpzk) &&
                Objects.equals(hpzk, that.hpzk) &&
                Objects.equals(hbdbqk, that.hbdbqk) &&
                Objects.equals(ccrq, that.ccrq) &&
                Objects.equals(hdfs, that.hdfs) &&
                Objects.equals(llpz1, that.llpz1) &&
                Objects.equals(pzbh1, that.pzbh1) &&
                Objects.equals(llpz2, that.llpz2) &&
                Objects.equals(pzbh2, that.pzbh2) &&
                Objects.equals(xsdw, that.xsdw) &&
                Objects.equals(xsjg, that.xsjg) &&
                Objects.equals(xsrq, that.xsrq) &&
                Objects.equals(jkpz, that.jkpz) &&
                Objects.equals(jkpzhm, that.jkpzhm) &&
                Objects.equals(hgzbh, that.hgzbh) &&
                Objects.equals(nszm, that.nszm) &&
                Objects.equals(nszmbh, that.nszmbh) &&
                Objects.equals(gxrq, that.gxrq) &&
                Objects.equals(xgzl, that.xgzl) &&
                Objects.equals(qmbh, that.qmbh) &&
                Objects.equals(hmbh, that.hmbh) &&
                Objects.equals(bz, that.bz) &&
                Objects.equals(jyw, that.jyw) &&
                Objects.equals(zsxzqh, that.zsxzqh) &&
                Objects.equals(zsxxdz, that.zsxxdz) &&
                Objects.equals(yzbm1, that.yzbm1) &&
                Objects.equals(lxdh, that.lxdh) &&
                Objects.equals(zzz, that.zzz) &&
                Objects.equals(zzxzqh, that.zzxzqh) &&
                Objects.equals(zzxxdz, that.zzxxdz) &&
                Objects.equals(yzbm2, that.yzbm2) &&
                Objects.equals(zdyzt, that.zdyzt) &&
                Objects.equals(yxh, that.yxh) &&
                Objects.equals(cyry, that.cyry) &&
                Objects.equals(dphgzbh, that.dphgzbh) &&
                Objects.equals(sqdm, that.sqdm) &&
                Objects.equals(clyt, that.clyt) &&
                Objects.equals(ytsx, that.ytsx) &&
                Objects.equals(dzyx, that.dzyx) &&
                Objects.equals(xszbh, that.xszbh) &&
                Objects.equals(sjhm, that.sjhm) &&
                Objects.equals(jyhgbzbh, that.jyhgbzbh) &&
                Objects.equals(dwbh, that.dwbh) &&
                Objects.equals(syqsrq, that.syqsrq) &&
                Objects.equals(yqjyqzbfqz, that.yqjyqzbfqz) &&
                Objects.equals(yqjyqz2, that.yqjyqz2) &&
                Objects.equals(fdjgs, that.fdjgs) &&
                Objects.equals(sfyzhgn, that.sfyzhgn) &&
                Objects.equals(zzjglx, that.zzjglx) &&
                Objects.equals(wxmbc, that.wxmbc) &&
                Objects.equals(ncdqsy, that.ncdqsy) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(etldate, that.etldate) &&
                Objects.equals(md5, that.md5) &&
                Objects.equals(flag1, that.flag1) &&
                Objects.equals(flag2, that.flag2) &&
                Objects.equals(flag3, that.flag3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectid, xh, hpzl, hphm, clpp1, clxh, clpp2, gcjk, zzg, zzcmc, clsbdh, fdjh, cllx, csys, syxz, sfzmhm, sfzmmc, syr, syq, ccdjrq, djrq, yxqz, qzbfqz, fzjg, glbm, fprq, fzrq, fdjrq, fhgzrq, bxzzrq, bpcs, bzcs, bdjcs, djzsbh, zdjzshs, dabh, xzqh, zt, dybj, jbr, clly, lsh, fdjxh, rlzl, pl, gl, zxxs, cwkc, cwkk, cwkg, hxnbcd, hxnbkd, hxnbgd, gbthps, zs, zj, qlj, hlj, ltgg, lts, zzl, zbzl, hdzzl, hdzk, zqyzl, qpzk, hpzk, hbdbqk, ccrq, hdfs, llpz1, pzbh1, llpz2, pzbh2, xsdw, xsjg, xsrq, jkpz, jkpzhm, hgzbh, nszm, nszmbh, gxrq, xgzl, qmbh, hmbh, bz, jyw, zsxzqh, zsxxdz, yzbm1, lxdh, zzz, zzxzqh, zzxxdz, yzbm2, zdyzt, yxh, cyry, dphgzbh, sqdm, clyt, ytsx, dzyx, xszbh, sjhm, jyhgbzbh, dwbh, syqsrq, yqjyqzbfqz, yqjyqz2, fdjgs, sfyzhgn, zzjglx, wxmbc, ncdqsy, createdate, etldate, md5, flag1, flag2, flag3);
    }
}
