package cn.xyzs.common.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "XY_ATTENDANCE")
public class XyAttendance {

    //考勤id
    @Column(name = "ATTENDANCE_ID")
    private String attendanceId;

    //用户id
    @Column(name = "USER_ID")
    private String userId;

    //考勤时间
    @Column(name = "ATTENDANCE_DATE")
    private String attendanceDate;

    //设备号
    @Column(name = "DEVICE_NUMBER")
    private String deviceNumber;

    //距离
    @Column(name = "DISTANCE")
    private String distance;

    //经度
    @Column(name = "LONGITUDE")
    private String longitude;

    //纬度
    @Column(name = "LATITUDE")
    private String latitude;

    //隶属单位
    @Column(name = "SUBORDINATE_UNIT")
    private String subordinateUnit;

    //考勤地址
    @Column(name = "ATTENDANCE_ADDRESS")
    private String attendanceAddress;

    //考勤类型
    @Column(name = "ATTENDANCE_TYPE")
    private String attendanceType;

    //考勤图片
    @Column(name = "ATTENDANCE_IMG")
    private String attendanceImg;

    //是否可用
    @Column(name = "IS_USED")
    private String isUsed;
}
