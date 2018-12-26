package cn.xyzs.common.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "XY_INFOMANAGE_CONSTR")
public class XyInfoManageConstr {
    //流水号
    @Column(name = "ROW_ID")
    private String rowId;

    //档案号
    @Column(name = "CTR_CODE")
    private String ctrCode;

    //工程类型（1:水电,2:瓦工,3:木工,4:油漆,5:安装）
    @Column(name = "CONSTRUCTION_TYPE")
    private String constructionType;

    //所属人
    @Column(name = "BELONG_USER")
    private String belongUser;

    //执行总监记录
    @Column(name = "ED_RECODE")
    private String edRecode;

    //工程老总记录
    @Column(name = "RB_RECODE")
    private String rbRecode;

    //所属人类型 1：执行总监，2：工程总监
    @Column(name = "BELONG_USER_TYPE")
    private String belongUserType;

    //操作日期
    @Column(name = "OP_DATE")
    private String opDate;

    //序号
    @Column(name = "XH")
    private String XH;
}
