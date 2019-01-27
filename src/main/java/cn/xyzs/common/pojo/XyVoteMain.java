package cn.xyzs.common.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "")
public class XyVoteMain {

    //
    @Column(name = "VOTE_ID")
    private String voteId;

    //
    @Column(name = "VOTE_NAME")
    private String voteName;

    //
    @Column(name = "VOTE_NUM")
    private String voteNum;

    //
    @Column(name = "OP_USER")
    private String opUser;

    //
    @Column(name = "OP_DATE")
    private String opDate;

    //
    @Column(name = "VOTE_TYPE")
    private String voteType;

    //
    @Column(name = "VOTE_SCORE")
    private String voteScore;

}
