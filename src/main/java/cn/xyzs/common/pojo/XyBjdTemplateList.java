package cn.xyzs.common.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "XY_BJD_TEMPLATE_LIST")
public class XyBjdTemplateList  {

    //
    @Column(name = "TEMPLATE_ID")
    private String templateId;

    //
    @Column(name = "TEMPLATE_ROWID")
    private String templateRowid;

    //
    @Column(name = "RG_STAGE")
    private String rgStage;

    //
    @Column(name = "TEMPLATE_NO")
    private String templateNo;

    //
    @Column(name = "RG_ID")
    private String rgId;

    //
    @Column(name = "RG_NAME")
    private String rgName;

    //
    @Column(name = "RG_UNIT")
    private String rgUnit;

    //
    @Column(name = "RG_PRICE")
    private String rgPrice;

    //
    @Column(name = "RG_DES")
    private String rgDes;

    //
    @Column(name = "RG_QTY")
    private String rgQty;
}
