package cn.xyzs.common.pojo;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "XY_INFOMANAGE_REVISIT")
public class XyInfoManageRevisit {
    //流水号
    @Column(name = "ROW_ID")
    private String rowId;

    //档案号
    @Column(name = "CTR_CODE")
    private String ctrCode;

    //回访内容
    @Column(name = "CONTENT")
    private String content;

    //回访人
    @Column(name = "OP_USER")
    private String opUser;

    //回访日期
    @Column(name = "OP_DATE")
    private String opDate;

    //序号
    @Column(name = "XH")
    private String xh;
}
