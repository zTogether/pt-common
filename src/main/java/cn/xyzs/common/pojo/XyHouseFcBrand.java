package cn.xyzs.common.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "XY_HOUSE_FC_BRAND")
public class XyHouseFcBrand {

    //
    @Column(name = "S_NAME")
    private String sName;

    //
    @Column(name = "S_VAL")
    private String sVal;

    //
    @Column(name = "HOUSE_ID")
    private String houseId;
}
