package cn.xyzs.common.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "XY_HOUSE_DISPLAY")
public class XyHouseDisplay {

    //房间区域名称
    @Column(name = "ROOM_NAME")
    private String roomName;

    //空间陈设
    @Column(name = "DISPLAY_REMARK")
    private String displayRemark;

    //地面材质
    @Column(name = "GROUND_MATERIAL")
    private String groundMaterial;

    //墙面材质
    @Column(name = "WALL_MATERIAL")
    private String wallMaterial;

    //顶面材质
    @Column(name = "TOP_MATERIAL")
    private String topMaterial;

    //户型id
    @Column(name = "HOUSE_ID")
    private String houseId;

    //其他
    @Column(name = "OTHER_MATERIAL")
    private String otherMaterial;
}
