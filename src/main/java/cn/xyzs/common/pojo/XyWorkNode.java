package cn.xyzs.common.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "XY_WORK_NODE")
public class XyWorkNode {

    //主键
    @Column(name = "NODE_ID")
    private String nodeId;

    //工作流ID
    @Column(name = "FLOW_ID")
    private String flowId;

    //节点名称
    @Column(name = "NODE_NAME")
    private String nodeName;

    //取消后进入节点
    @Column(name = "CANCENODE_ID")
    private String cancenodeId;

    //确认后进入节点id
    @Column(name = "CONFIRMNODE_ID")
    private String confirmnodeId;

    //节点类型（1：开始，2：运行，3：结束）
    @Column(name = "NODE_TYPE")
    private String nodeType;

    //是否删除
    @Column(name = "NODE_ISDEL")
    private String nodeIsdel;

    //节点添加时间
    @Column(name = "NODE_ADDTIME")
    private String nodeAddtime;

    //确认按钮
    @Column(name = "CONFIRMNODE_BUTTON")
    private String confirmnodeButton;

    //取消按钮
    @Column(name = "CANCENODE_BUTTON")
    private String cancenodeButton;

    //节点操作人
    @Column(name = "NODE_OPERATION_USER")
    private String nodeOperationUser;

    //节点操作组织
    @Column(name = "ACT_ADDTIME")
    private String nodeOperationGroup;

    //节点位置(1,3)
    @Column(name = "NODE_POSITION")
    private String nodePosition;

    //是否复制节点（0：不复制 1：复制确认 2：复制取消）
    @Column(name = "IS_COPY")
    private String isCopy;
}
