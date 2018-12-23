package cn.xyzs.common.pojo;

import lombok.Data;

import javax.persistence.Column;

@Data
public class XyCwbCapitalDetail {

     //资金明细id
     @Column(name = "CAPITAL_DETAIL_ID")
     private String capitalDetailId;

     //关联资金主表id
     @Column(name = "CAPITAL_ID")
     private String capitalId;

     //资金类型（0：转入，1：转出）
     @Column(name = "CAPITAL_TYPE")
     private String capitalType;

     //金额
     @Column(name = "MENOY")
     private String menoy;

     //操作时间
     @Column(name = "OP_DATE")
     private String opDate;

     //描述
     @Column(name = "CAPITAL_DETAIL_DESCRIPTION")
     private String capitalNetailDescription;

     //操作人设备号
     @Column(name = "OP_DEVICE_NUM")
     private String opDeviceNum;

}
