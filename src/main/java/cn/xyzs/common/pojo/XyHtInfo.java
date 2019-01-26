package cn.xyzs.common.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "XY_HT_INFO")
public class XyHtInfo {

    //
    @Column(name = "CTR_CODE")
    private String ctrCode;

    //
    @Column(name = "ADDR_LIVE")
    private String addrLive;

    //
    @Column(name = "WT_YN")
    private String wtYn;

    //
    @Column(name = "WT_NAME")
    private String wtName;

    //
    @Column(name = "WT_TEL")
    private String wtTel;

    //
    @Column(name = "WT_CARDID")
    private String wtCardid;

    //
    @Column(name = "HT_KGRQ")
    private String htKgrq;

    //
    @Column(name = "HT_MARK")
    private String htMark;

    //
    @Column(name = "FWF_MARK")
    private String fwfMark;

    //
    @Column(name = "HT_STATU")
    private String htStatu;

    //
    @Column(name = "HT_PRINT_DATE")
    private String htPrintDate;

    //
    @Column(name = "HT_FILE")
    private String htFile;

    //
    @Column(name = "FWF_FILE")
    private String fwfFile;
}
