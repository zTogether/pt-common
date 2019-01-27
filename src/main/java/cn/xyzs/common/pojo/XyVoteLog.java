package cn.xyzs.common.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "XY_VOTE_LOG")
public class XyVoteLog {

    //
    @Column(name = "VOTE_ID")
    private String voteId;

    //
    @Column(name = "OP_DATE")
    private String opDate;

    //
    @Column(name = "SELECT_ID")
    private String selectId;

    //
    @Column(name = "OP_USER")
    private String opUser;
}
