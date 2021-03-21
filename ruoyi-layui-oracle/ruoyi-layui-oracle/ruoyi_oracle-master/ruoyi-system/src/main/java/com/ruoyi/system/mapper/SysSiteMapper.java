package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysSite;

/**
 * 站点管理Mapper接口
 * 
 * @author ruoyi
 * @date 2021-01-17
 */
public interface SysSiteMapper 
{
    /**
     * 查询站点管理
     * 
     * @param siteId 站点管理ID
     * @return 站点管理
     */
    public SysSite selectSysSiteById(Long siteId);

    /**
     * 查询站点管理列表
     * 
     * @param sysSite 站点管理
     * @return 站点管理集合
     */
    public List<SysSite> selectSysSiteList(SysSite sysSite);

    /**
     * 新增站点管理
     * 
     * @param sysSite 站点管理
     * @return 结果
     */
    public int insertSysSite(SysSite sysSite);

    /**
     * 修改站点管理
     * 
     * @param sysSite 站点管理
     * @return 结果
     */
    public int updateSysSite(SysSite sysSite);

    /**
     * 删除站点管理
     * 
     * @param siteId 站点管理ID
     * @return 结果
     */
    public int deleteSysSiteById(Long siteId);

    /**
     * 批量删除站点管理
     * 
     * @param siteIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysSiteByIds(String[] siteIds);
}
