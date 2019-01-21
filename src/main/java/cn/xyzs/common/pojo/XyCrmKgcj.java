package cn.xyzs.common.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "XY_CRM_KGCJ")
public class XyCrmKgcj {

    //主键
    @Column(name = "ROW_ID")
    private String rowId;

    //信息id
    @Column(name = "CUST_ID")
    private String custId;

    //操作人
    @Column(name = "OP_USER")
    private String opUser;

    //操作时间
    @Column(name = "OP_DATE")
    private String opDate;

    //备注
    @Column(name = "MARK")
    private String mark;

}
