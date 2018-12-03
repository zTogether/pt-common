package cn.xyzs.common.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "XY_EFFECTIVE_INFO")
public class XyEffectiveInfo {

    //提交人id
    @Column(name = "SUBMIT_USER_ID")
    private String submitUserId;

	//有效信息姓名
    @Column(name = "EFFECTIVE_INFO_NAME")
    private String effectiveInfoName;

	//有效信息电话
    @Column(name = "EFFECTIVE_INFO_TEL")
    private String effectiveInfoTel;

	//有效信息地址
    @Column(name = "EFFECTIVE_INFO_ADDRESS")
    private String effectiveInfoAddress;

	//提交时间
    @Column(name = "SUBMIT_DATE")
    private String submitDate;

	//有效信息状态（0：待核实   1：有效    2：无效）
    @Column(name = "EFFECTIVE_INFO_STATUS")
    private String effectiveInfoStatus;

	//备注
    @Column(name = "REMARK")
    private String remark;
}
