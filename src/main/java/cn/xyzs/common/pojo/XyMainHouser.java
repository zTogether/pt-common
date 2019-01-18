package cn.xyzs.common.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "XY_MAIN_HOUSER")
public class XyMainHouser {

    //户型id
    @Column(name = "HOUSE_ID")
    private String houseId;

    //小区id
    @Column(name = "AREA_ID")
    private String areaId;

    //CAD图纸地址
    @Column(name = "CAD_COMMON_URL")
    private String cadCommonUrl;

    //户型名称
    @Column(name = "HOUSE_STYLE")
    private String houseStyle;

    //软装效果图路径
    @Column(name = "AREA_ID")
    private String effectsUrl;

    //VR效果图路径
    @Column(name = "VR_URL")
    private String vrUrl;

    //设计师
    @Column(name = "HOUSE_AUTHOR")
    private String houseAuthor;

    //设计时间
    @Column(name = "CREATE_TIME")
    private String createTime;

    //房型描述
    @Column(name = "HOUSE_DESC")
    private String houseDesc;

    //点赞数
    @Column(name = "LIKE_NUM")
    private String likeNum;

    //精装修CAD图
    @Column(name = "CAD_DECORATION_URL")
    private String cadDecorationUrl;

    //层高（单位：米）
    @Column(name = "FLOOR_HEIGHT")
    private String floorHeight;

    //吊顶后层高
    @Column(name = "FLOOR_FACT_HEIGHT")
    private String floorFactHeight;

    //房型等级
    @Column(name = "HOUSE_LEVEL")
    private String houseLevel;
}
