package com.ruoyi.system.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 部门与岗位关联对象 sys_dept_post
 *
 * @author ruoyi
 * @date 2021-01-19
 */
public class SysDeptPost extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 部门岗位关系表主键 */
    private Long upId;

    /** 岗位id */
    private Long postId;

    /** 部门id */
    private Long deptId;

    public void setUpId(Long upId)
    {
        this.upId = upId;
    }

    public Long getUpId()
    {
        return upId;
    }
    public void setPostId(Long postId)
    {
        this.postId = postId;
    }

    public Long getPostId()
    {
        return postId;
    }
    public void setDeptId(Long deptId)
    {
        this.deptId = deptId;
    }

    public Long getDeptId()
    {
        return deptId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("upId", getUpId())
            .append("postId", getPostId())
            .append("deptId", getDeptId())
            .toString();
    }
}
