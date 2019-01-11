package cn.xyzs.common.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "XY_OA_TODO_MAIN")
public class XyOaTodoMain {
    //任务Id
    @Column(name = "ID")
    private String id;

    //发布时间
    @Column(name = "OP_DATE")
    private Date opDate;

    //发布人
    @Column(name = "OP_USER")
    private String opUser;

    //标题
    @Column(name = "TITLE")
    private String title;

    //描述
    @Column(name = "CONTENT")
    private String content;

    //处理限期
    @Column(name = "LIMIT_DATE")
    private Date limitDate;

    //接收人
    @Column(name = "TODO_USER")
    private  String todoUser;

    //任务类型
    @Column(name = "TYPE")
    private String type;

    //任务状态
    @Column(name = "STATU")
    private  String statu;

    //附件
    @Column(name = "FILE_M")
    private String fileM;
}
