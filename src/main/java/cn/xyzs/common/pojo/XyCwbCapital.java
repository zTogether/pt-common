package cn.xyzs.common.pojo;

import lombok.Data;

import javax.persistence.Column;

@Data
public class XyCwbCapital {
    //资金id
    @Column(name = "CAPITAL_ID")
    private String capitalId;

    //用户id
    @Column(name = "USER_ID")
    private String userId;

    //可提现金额
    @Column(name = "ALLOW_WITHDRAW_DEPOSIT_MONEY")
    private String allowWithdrawDepositMoney;

    //不可提现金额
    @Column(name = "NOTA_WITHDRAW_DEPOSIT_MONEY")
    private String notaWithdrawDepositMoney;

    //交易密码
    @Column(name = "TRANSACTION_PASSWORD")
    private String transactionPassword;

    //证书
    @Column(name = "TRANSACTION_CERTIFICATE")
    private String transactionCertificate;
}
