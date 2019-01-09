package cn.xyzs.common.pojo;

import lombok.Data;

import javax.persistence.Column;

@Data
public class XyCwbCoupon {

    //优惠券编号
     @Column(name = "COUPON_CODE")
     private String couponCode;

    //优惠券状态
     @Column(name = "COUPON_STATUS")
     private String couponStatus;

    //优惠券类型
     @Column(name = "COUPON_TYPE")
     private String couponType;

    //优惠券发放人
     @Column(name = "COUPON_ISSUE_PERSONS")
     private String couponIssuePersons;

    //优惠券发放时间
     @Column(name = "COUPON_ISSUE_DATE")
     private String couponIssueDate;

    //优惠券名称
     @Column(name = "COUPON_NAME")
     private String couponName;

    //优惠券使用须知
     @Column(name = "COUPON_NOTES")
     private String couponNotes;

    //优惠券金额
     @Column(name = "COUPON_MONEY")
     private String couponMoney;

    //优惠券使用开始如期
     @Column(name = "COUPON_START_DATE")
     private String couponStartDate;

    //优惠券使用截至日期
     @Column(name = "COUPON_END_DATE")
     private String couponEndDate;

    //优惠券使用人
     @Column(name = "COUPON_USER")
     private String couponUser;

    //优惠券使用操作人
     @Column(name = "COUPON_USE_OP")
     private String couponUseOp;

    //优惠券使用日期
     @Column(name = "COUPON_USE_DATE")
     private String couponUseDate;

    //优惠券使用备注
     @Column(name = "COUPON_USE_REMARK")
     private String couponUseRemark;

    //优惠券序列号
     @Column(name = "COUPON_SERIAL")
     private String couponSerial;
}
