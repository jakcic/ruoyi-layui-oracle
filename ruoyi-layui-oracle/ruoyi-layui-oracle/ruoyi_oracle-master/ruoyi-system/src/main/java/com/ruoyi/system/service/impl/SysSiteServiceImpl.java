package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysSiteMapper;
import com.ruoyi.system.domain.SysSite;
import com.ruoyi.system.service.ISysSiteService;
import com.ruoyi.common.core.text.Convert;

/**
 * 站点管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-01-17
 */
@Service
public class SysSiteServiceImpl implements ISysSiteService 
{
    @Autowired
    private SysSiteMapper sysSiteMapper;

    /**
     * 查询站点管理
     * 
     * @param siteId 站点管理ID
     * @return 站点管理
     */
    @Override
    public SysSite selectSysSiteById(Long siteId)
    {
        return sysSiteMapper.selectSysSiteById(siteId);
    }

    /**
     * 查询站点管理列表
     * 
     * @param sysSite 站点管理
     * @return 站点管理
     */
    @Override
    public List<SysSite> selectSysSiteList(SysSite sysSite)
    {
        return sysSiteMapper.selectSysSiteList(sysSite);
    }

    /**
     * 新增站点管理
     * 
     * @param sysSite 站点管理
     * @return 结果
     */
    @Override
    public int insertSysSite(SysSite sysSite)
    {
        sysSite.setCreateTime(DateUtils.getNowDate());
        return sysSiteMapper.insertSysSite(sysSite);
    }

    /**
     * 修改站点管理
     * 
     * @param sysSite 站点管理
     * @return 结果
     */
    @Override
    public int updateSysSite(SysSite sysSite)
    {
        sysSite.setUpdateTime(DateUtils.getNowDate());
        return sysSiteMapper.updateSysSite(sysSite);
    }

    /**
     * 删除站点管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSysSiteByIds(String ids)
    {
        return sysSiteMapper.deleteSysSiteByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除站点管理信息
     * 
     * @param siteId 站点管理ID
     * @return 结果
     */
    @Override
    public int deleteSysSiteById(Long siteId)
    {
        return sysSiteMapper.deleteSysSiteById(siteId);
    }
}
