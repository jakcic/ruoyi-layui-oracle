package com.ruoyi.system.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 岗位角色关联对象 sys_role_post
 *
 * @author ruoyi
 * @date 2021-01-18
 */
public class SysRolePost extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 岗位角色关系表主键 */
    private Long id;

    /** 角色id */
    private Long roleId;

    /** 岗位id */
    private Long postId;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setRoleId(Long roleId)
    {
        this.roleId = roleId;
    }

    public Long getRoleId()
    {
        return roleId;
    }
    public void setPostId(Long postId)
    {
        this.postId = postId;
    }

    public Long getPostId()
    {
        return postId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("roleId", getRoleId())
            .append("postId", getPostId())
            .toString();
    }
}
