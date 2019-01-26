package cn.xyzs.common.pojo;

import javax.persistence.Column;

public class XyBjdStage {

    //
    @Column(name = "BJD_CODE")
    private String bjdCode;

    //
    @Column(name = "STAGE_TYPE")
    private String stageType;

    //
    @Column(name = "BJD_STAGE")
    private String bjdStage;

    //
    @Column(name = "STAGE_HJ")
    private String stageHj;

    //
    @Column(name = "STAGE_HJ_Y")
    private String stageHjY;

    //
    @Column(name = "STAGE_HJ_N")
    private String stageHjN;
}
