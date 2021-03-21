package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.SysDeptPost;

import java.util.List;

/**
 * 部门与岗位关联Mapper接口
 *
 * @author ruoyi
 * @date 2021-01-19
 */
public interface SysDeptPostMapper
{
    /**
     * 查询部门与岗位关联
     *
     * @param upId 部门与岗位关联ID
     * @return 部门与岗位关联
     */
    public SysDeptPost selectSysDeptPostById(Long upId);

    /**
     * 查询部门与岗位关联列表
     *
     * @param sysDeptPost 部门与岗位关联
     * @return 部门与岗位关联集合
     */
    public List<SysDeptPost> selectSysDeptPostList(SysDeptPost sysDeptPost);

    /**
     * 新增部门与岗位关联
     *
     * @param sysDeptPost 部门与岗位关联
     * @return 结果
     */
    public int insertSysDeptPost(SysDeptPost sysDeptPost);

    /**
     * 修改部门与岗位关联
     *
     * @param sysDeptPost 部门与岗位关联
     * @return 结果
     */
    public int updateSysDeptPost(SysDeptPost sysDeptPost);

    /**
     * 删除部门与岗位关联
     *
     * @param upId 部门与岗位关联ID
     * @return 结果
     */
    public int deleteSysDeptPostById(Long upId);

    /**
     * 批量删除部门与岗位关联
     *
     * @param upIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysDeptPostByIds(String[] upIds);

    /**
     * 根据upId查询postId
     * @param up
     * @return
     */
    Long findpostIdByupId(Long up);

    /**
     * 根据postId查询roleID
     * @param postId
     * @return
     */
    List<Long> findroleIdBypostId(Long postId);
}
