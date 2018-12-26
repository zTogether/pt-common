package cn.xyzs.common.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "XY_INFOMANAGE_COMP")
public class XyInfoManageComp {
    //流水号
    @Column(name = "ROW_ID")
    private String rowId;

    //客户档案号
    @Column(name = "CTR_CODE")
    private String ctrCode;

    //投诉内容
    @Column(name = "COMPLAIN")
    private String complain;

    //投诉类型(1:回访事项,2:电话投诉,3:上门投诉,4:总经办投诉,5：限期整改)
    @Column(name = "COM_TYPE")
    private String comType;

    //处理限期
    @Column(name = "SOVLE_DATE")
    private String solveDate;

    //责任人
    @Column(name = "LIABLE_USER")
    private String liableUser;

    //责任人回复
    @Column(name = "LIABLE_RES")
    private String liableRes;

    //登记人
    @Column(name = "OP_USER")
    private String opUser;

    //登记日期
    @Column(name = "OPDATE")
    private String opDate;

    //责任人回复日期
    @Column(name = "RES_DATE")
    private String resDate;
}
