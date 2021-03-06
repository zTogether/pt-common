package cn.xyzs.common.pojo.sys;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: zhouchao
 * @Date: 2018/12/29 0029 12:55
 */
@Data
@Table(name = "XY_WORK_ACTIVE")
public class XyWorkActive {
    @Id
    private String actId;
    @Column(name = "ACT_NAME")
    private String actName;
    @Column(name = "ACT_DESCRIBE")
    private String actDescribe;
    @Column(name = "ACT_ISDEL")
    private Integer actIsdel;
    @Column(name = "ACT_ADDTIME")
    private Long actAddtime;
}
