package cn.xyzs.common.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "XY_LOTTERY")
public class XyLottery {
    @Column(name = "ROW_ID")
    private String rowId;

    @Column(name = "ROTTERY_STATU")
    private String RotteryStatu;

    @Column(name = "ROTTERY_BNUM")
    private String RotteryBnum;

    @Column(name = "ROTTERY_NAME")
    private String RotteryName;

    @Column(name = "PRIZE_LIST")
    private String PrizeList;
}
