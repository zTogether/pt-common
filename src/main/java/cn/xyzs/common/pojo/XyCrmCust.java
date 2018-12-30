package cn.xyzs.common.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "XY_CRM_CUST")
public class XyCrmCust {

    //主键
     @Column(name = "CUST_ID")
     private String custId;

    //客户姓名
     @Column(name = "CUST_NAME")
     private String custName;

    //地址
     @Column(name = "CUST_ADDRESS")
     private String custAddress;

    //地址详情
     @Column(name = "CUST_ADDRESS_DETAIL")
     private String custAddressDetail;

    //装修类型(1.新房|2.再装修)
     @Column(name = "DECOR_TYPE")
     private String decorType;

    //联系方式
     @Column(name = "CUST_MOBILE")
     private String custMobile;

    //上次装修时间
     @Column(name = "PRIV_TIME")
     private String privTime;

    //上次装修公司
     @Column(name = "PRIV_COMPANY")
     private String privCompany;

    //上次装修评价，计分0-100
     @Column(name = "PRIV_ASSESS")
     private String privAssess;

    //最近联系时间
     @Column(name = "NEW_CONTIME")
     private String newContime;

    //最近联系人
     @Column(name = "NEW_CONACT")
     private String newConact;

    //信息状态（0意向信息|1关注信息|2有效信息|3二次意向信息）
     @Column(name = "CUST_STATE")
     private String custState;

    //信息提供时间
     @Column(name = "CREATE_TIME")
     private String createTime;

    //信息提供者
     @Column(name = "CUST_PROVIDER")
     private String custProvider;

    //客户档案号(）
     @Column(name = "CTR_CODE")
     private String ctrCode;

    //延期状态（0:未延期 1:攻关，2:品推，3:流单）
     @Column(name = "CUST_DELAY")
     private String custDelay;

    //1:可用，0:不可用
     @Column(name = "IS_VAILD")
     private String isVaild;

    //当前对接人
     @Column(name = "JOIN_USERID")
     private String joinUserid;
}
