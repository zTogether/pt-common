package cn.xyzs.common.pojo;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "XY_LOG")
public class XyLog {

    //
    @Column(name = "LOG_ID")
    private String logId;

    //
    @Column(name = "USER_ID")
    private String userId;

    //
    @Column(name = "LOG_TIME")
    private String logTime;

    //
    @Column(name = "COMPO_ID")
    private String compoId;

    //
    @Column(name = "OP_ID")
    private String opId;

    //
    @Column(name = "LOG_IP")
    private String logIp;

    //
    @Column(name = "LOG_RESULT")
    private String logResult;

    //
    @Column(name = "LOG_DATAID")
    private String logDataid;
}
