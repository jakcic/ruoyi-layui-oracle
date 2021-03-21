package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.SysUserUp;

import java.util.List;

/**
 * 人员部门关联Mapper接口
 *
 * @author ruoyi
 * @date 2021-01-19
 */
public interface SysUserUpMapper
{
    /**
     * 查询人员部门关联
     *
     * @param id 人员部门关联ID
     * @return 人员部门关联
     */
    public SysUserUp selectSysUserUpById(Long id);

    /**
     * 查询人员部门关联列表
     *
     * @param sysUserUp 人员部门关联
     * @return 人员部门关联集合
     */
    public List<SysUserUp> selectSysUserUpList(SysUserUp sysUserUp);

    /**
     * 新增人员部门关联
     *
     * @param sysUserUp 人员部门关联
     * @return 结果
     */
    public int insertSysUserUp(SysUserUp sysUserUp);

    /**
     * 修改人员部门关联
     *
     * @param sysUserUp 人员部门关联
     * @return 结果
     */
    public int updateSysUserUp(SysUserUp sysUserUp);

    /**
     * 删除人员部门关联
     *
     * @param id 人员部门关联ID
     * @return 结果
     */
    public int deleteSysUserUpById(Long id);

    /**
     * 批量删除人员部门关联
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysUserUpByIds(String[] ids);

    /**
     * 根据userId 查询ups
     * @param userId
     * @return
     */
    List<Long> findupIdByUserId(Long userId);
}
