package cn.xyzs.common.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "XY_WORK_ACTIVE")
public class XyWorkActive {

    //主键
    @Column(name = "ACT_ID")
    private String actId;

    //类型
    @Column(name = "ACT_NAME")
    private String actName;

    //描述
    @Column(name = "ACT_DESCRIBE")
    private String actDescribe;

    //是否完结（1：完结 0：未完结）
    @Column(name = "ACT_ISDEL")
    private String actIsdel;

    //添加时间
    @Column(name = "ACT_ADDTIME")
    private String actAddtime;
}
