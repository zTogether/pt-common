package cn.xyzs.common.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "XY_HOUSER_TYPE")
public class HouseTypeId {

    //户型id
    @Column(name = "HOUSE_TYPE_ID")
    private String houseTypeId;

    //户型名称
    @Column(name = "HOUSE_TYPE_NAME")
    private String houseTypeName;

    //小区id
    @Column(name = "AREA_ID")
    private String areaId;

    //户型描述
    @Column(name = "HOUSE_DESC")
    private String houseDesc;
}
