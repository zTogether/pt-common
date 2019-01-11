package cn.xyzs.common.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "XY_OA_TODO_LIST")
public class XyOaTodoList {
    //任务ID
    @Column(name = "ID")
    private String id;

    //流水
    @Column(name = "ROW_ID")
    private String rowId;

    //时间
    @Column(name = "OP_DATE")
    private Date opDate;

    //记录人
    @Column(name = "OP_USER")
    private String opUser;

    //日志内容
    @Column(name = "MARK")
    private String mark;

    //附件
    @Column(name = "FILE_L")
    private String fileL;

    //发布人状态
    @Column(name = "OP_U_STATU")
    private String opUStatu;

    //接收人状态
    @Column(name = "TODO_U_STATU")
    private String todoUStatu;
}
