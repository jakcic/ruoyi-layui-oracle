package com.ruoyi.system.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 人员部门关联对象 sys_user_up
 *
 * @author ruoyi
 * @date 2021-01-19
 */
public class SysUserUp extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 人员部门关系表 */
    private Long id;

    /** 用户ID */
    private Long userId;

    /** 部门岗位关系表ID */
    private Long upId;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public Long getUserId()
    {
        return userId;
    }
    public void setUpId(Long upId)
    {
        this.upId = upId;
    }

    public Long getUpId()
    {
        return upId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("upId", getUpId())
            .toString();
    }
}
