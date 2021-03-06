package cn.xyzs.common.pojo.sys;

import lombok.Data;

import javax.persistence.*;

/**
 * @Author: zhouchao
 * @Date: 2018/12/29 0029 13:04
 */
@Data
@Table(name = "XY_WORK_NODE")
public class XyWorkNode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "select sys_guid() from dual")
    private String nodeId;
    @Column(name = "FLOW_ID")
    private String flowId;
    @Column(name = "NODE_NAME")
    private String nodeName;
    @Column(name = "CANCENODE_ID")
    private String cancenodeId;
    @Column(name = "CONFIRMNODE_ID")
    private String confirmnodeId;
    @Column(name = "NODE_TYPE")
    private String nodeType;
    @Column(name = "NODE_ISDEL")
    private String nodeIsdel;
    @Column(name = "NODE_ADDTIME")
    private Long nodeAddtime;
    @Column(name = "CONFIRMNODE_BUTTON")
    private String confirmnodeButton;
    @Column(name = "CANCENODE_BUTTON")
    private String cancenodeButton;
    @Column(name = "NODE_OPERATION_USER")
    private String nodeOperationUser;
    @Column(name = "NODE_OPERATION_GROUP")
    private String nodeOperationGroup;
    @Column(name = "NODE_POSITION")
    private String nodePosition;
    @Column(name = "IS_COPY")
    private String isCopy;
}
