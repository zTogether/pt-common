package cn.xyzs.common.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "XY_MAIN_AREA")
public class XyMainArea {

    //小区id
    @Column(name = "AREA_ID")
    private String areaId;

    //小区名称
    @Column(name = "AREA_NAME")
    private String areaName;

    //小区地址
    @Column(name = "AREA_ADDRESS")
    private String areaAddress;

    //地址详情
    @Column(name = "AREA_ADDRESS_DETAIL")
    private String areaAddressDetail;

    //小区户数
    @Column(name = "AREA_NUMBER")
    private String areaNumber;

    //均价
    @Column(name = "AREA_AVG_PRICE")
    private String areaAvgPrice;

    //交通配套
    @Column(name = "TRAFFIC_REMARK")
    private String trafficRemark;

    //医疗配套
    @Column(name = "HOSPITAL_REMARK")
    private String hospitalRemark;

    //商业配套
    @Column(name = "BUSINESS_REMARK")
    private String businessRemark;

    //教育配套
    @Column(name = "EDUCATION_REMARK")
    private String educationRemark;

    //其他配套
    @Column(name = "OTHER_REMARK")
    private String otherRemark;

    //小区垃圾堆放(0：无，1：有)
    @Column(name = "AREA_RUBBISH")
    private String areaRubbish;

    //区域id
    @Column(name = "DISTRICT_ID")
    private String districtId;
}
