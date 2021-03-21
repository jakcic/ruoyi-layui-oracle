package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.SysRolePost;

import java.util.List;

/**
 * 岗位角色关联Mapper接口
 *
 * @author ruoyi
 * @date 2021-01-18
 */
public interface SysRolePostMapper
{
    /**
     * 查询岗位角色关联
     *
     * @param id 岗位角色关联ID
     * @return 岗位角色关联
     */
    public SysRolePost selectSysRolePostById(Long id);

    /**
     * 查询岗位角色关联列表
     *
     * @param sysRolePost 岗位角色关联
     * @return 岗位角色关联集合
     */
    public List<SysRolePost> selectSysRolePostList(SysRolePost sysRolePost);

    /**
     * 新增岗位角色关联
     *
     * @param sysRolePost 岗位角色关联
     * @return 结果
     */
    public int insertSysRolePost(SysRolePost sysRolePost);

    /**
     * 修改岗位角色关联
     *
     * @param sysRolePost 岗位角色关联
     * @return 结果
     */
    public int updateSysRolePost(SysRolePost sysRolePost);

    /**
     * 删除岗位角色关联
     *
     * @param id 岗位角色关联ID
     * @return 结果
     */
    public int deleteSysRolePostById(Long id);

    /**
     * 批量删除岗位角色关联
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysRolePostByIds(String[] ids);
}
