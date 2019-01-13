package cn.xyzs.common.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "XY_SHOP_POSITION_INFO")
public class XyShopPositionInfo {

    //店铺定位信息id
    @Column(name = "SHOP_POSITION_INFO_ID")
    private String shopPositionInfoId;

    //店铺经度
    @Column(name = "SHOP_LONGITUDE")
    private String shopLongitude;

    //店铺纬度
    @Column(name = "SHOP_LATITUDE")
    private String shopLatitude;

    //店铺名称
    @Column(name = "SHOP_NAME")
    private String shopName;

    //店铺地址详情
    @Column(name = "SHOP_ADDRESS")
    private String shopAddress;

    //是否启用(0：启用    1：停用)
    @Column(name = "IS_USED")
    private String isUsed;
}
