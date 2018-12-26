package cn.xyzs.common.pojo;

import lombok.Data;

import javax.persistence.Column;

@Data
public class XyCwbCapitalYytx {

    //预约提现id
     @Column(name = "APPOINTMENT_WITHDRAW_ID")
     private String appointmentDithdrawId;

     //用户id
     @Column(name = "USER_ID")
     private String userId;

	//预约时间
     @Column(name = "APPOINTMENT_DATE")
     private String appointmentDate;

     //预约金额
     @Column(name = "APPOINTMENT_MONEY")
     private String appointmentMoney;

	//备注
     @Column(name = "REMARK")
     private String remark;
}
