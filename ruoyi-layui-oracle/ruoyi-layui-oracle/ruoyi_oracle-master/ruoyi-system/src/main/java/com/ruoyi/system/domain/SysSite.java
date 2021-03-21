package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 站点管理对象 sys_site
 * 
 * @author ruoyi
 * @date 2021-01-17
 */
public class SysSite extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long siteId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String siteName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String siteDesc;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String siteUrl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String siteImg;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long siteSort;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String siteType;

    public void setSiteId(Long siteId) 
    {
        this.siteId = siteId;
    }

    public Long getSiteId() 
    {
        return siteId;
    }
    public void setSiteName(String siteName) 
    {
        this.siteName = siteName;
    }

    public String getSiteName() 
    {
        return siteName;
    }
    public void setSiteDesc(String siteDesc) 
    {
        this.siteDesc = siteDesc;
    }

    public String getSiteDesc() 
    {
        return siteDesc;
    }
    public void setSiteUrl(String siteUrl) 
    {
        this.siteUrl = siteUrl;
    }

    public String getSiteUrl() 
    {
        return siteUrl;
    }
    public void setSiteImg(String siteImg) 
    {
        this.siteImg = siteImg;
    }

    public String getSiteImg() 
    {
        return siteImg;
    }
    public void setSiteSort(Long siteSort) 
    {
        this.siteSort = siteSort;
    }

    public Long getSiteSort() 
    {
        return siteSort;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setSiteType(String siteType) 
    {
        this.siteType = siteType;
    }

    public String getSiteType() 
    {
        return siteType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("siteId", getSiteId())
            .append("siteName", getSiteName())
            .append("siteDesc", getSiteDesc())
            .append("siteUrl", getSiteUrl())
            .append("siteImg", getSiteImg())
            .append("siteSort", getSiteSort())
            .append("status", getStatus())
            .append("siteType", getSiteType())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
