package cn.xyzs.common.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "XY_VOTE_LIST")
public class XyVoteList {

    //
    @Column(name = "VOTE_ID")
    private String voteId;
	//
    @Column(name = "VOTE_XH")
    private String voteXh;
	//
    @Column(name = "SELECT_ID")
    private String selectId;
	//
    @Column(name = "SELECT_NAME")
    private String selectName;
}
