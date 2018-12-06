package cn.xyzs.common.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "XY_STAR_EVA_LIST")
public class XyStarEvaList {
    @Column(name = "EVA_NO")
    private String evaNo;

    @Column(name = "QUALITY")
    private String quality;

    @Column(name = "EVALUATION")
    private String evaluation;

    @Column(name = "EVA_NAME")
    private String evaName;

    @Column(name = "EVA_CODE")
    private String evaCode;

    @Column(name = "EVA_TYPE")
    private String evaType;

    @Column(name = "EVA_DATE")
    private String evaDate;

    @Column(name = "SERVICE")
    private String service;

    @Column(name = "DAYS")
    private String days;

    @Column(name = "HYGIENE")
    private String hygiene;
}
