package cn.xyzs.common.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "XY_SYS_DISTRICT")
public class XySysDistrict {

    //区域id
    @Column(name = "DISTRICT_ID")
    private String districtId;

    //区域名称
    @Column(name = "DISTRICT_NAME")
    private String districtName;

    //上级区域id
    @Column(name = "PREV_DISTRICT_ID")
    private String prevDistrictId;

    //区域等级
    @Column(name = "DISTRICT_LEVEL")
    private String districtLevel;
}
