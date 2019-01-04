package cn.xyzs.common.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "XY_CRM_RELATION")
public class XyCrmRelation {

    //用户id
     @Column(name = "USER_ID")
     private String userId;

    //下级id
     @Column(name = "LOWER_USER_ID")
     private String lowerUserId;

    //角色
     @Column(name = "EXPRESS")
     private String express;
}
