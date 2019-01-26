package cn.xyzs.common.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "XY_CLB_ZCPB_MAIN")
public class XyClbZcpbMain {

    //
    @Column(name = "CTR_CODE")
    private String ctrCode;

    //
    @Column(name = "OP_DATE")
    private String opDate;

    //
    @Column(name = "OP_USERID")
    private String opUserid;

    //
    @Column(name = "ZCPB_STATU")
    private String zcpbStatu;

    //
    @Column(name = "ZCPB_HJ")
    private String zcpbHj;

    //
    @Column(name = "ZCPB_LX")
    private String zcpbLx;

    //
    @Column(name = "ZCPB_BL")
    private String zcpbBl;
}
