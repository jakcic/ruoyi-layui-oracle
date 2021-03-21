package com.ruoyi.web.utils;

import com.ruoyi.common.utils.spring.SpringUtils;
//import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.common.utils.ShiroUtils;
//import com.ruoyi.system.domain.SysMenu;
import com.ruoyi.common.core.domain.entity.SysMenu;
//import com.ruoyi.system.domain.SysUser;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.system.domain.SysSite;
import com.ruoyi.system.service.ISysMenuService;
import com.ruoyi.system.service.ISysPostService;
import com.ruoyi.system.service.ISysSiteService;
import com.ruoyi.system.service.ISysUserService;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Title UserUtils
 * @Description
 * @Date 2020/7/24  15:09
 */
public class UserUtils {

    /*获取用户菜单*/
    public static List<SysMenu> listUserMenu(){
//        SysUser user = ShiroUtils.getSysUser();
//        List<SysMenu> menus= SpringUtils.getBean(ISysMenuService.class).selectMenusByUser(user);
//        return menus;
        SysUser user = ShiroUtils.getSysUser();
//        List<SysMenu> menus= SpringUtils.getBean(ISysMenuService.class).selectMenusByUser(user);
        // 根据userId查询upId
        List<Long> ups = SpringUtils.getBean(ISysUserService.class).findupIdByUserId(user.getUserId());

        // 根据upId查询postId
        List<Long> posts = new ArrayList<>();
        for (Long up : ups) {
            Long post = SpringUtils.getBean(ISysPostService.class).findpostIdByupId(up);
            posts.add(post);
        }
        Set<Long> postSet = new HashSet<>(posts);
        List<Long> postList = new ArrayList<>(postSet);

        List<List<Long>> roles = new ArrayList<>();
        // 根据postID查询roleID
        for (Long postId : postList) {
            List<Long> role = SpringUtils.getBean(ISysPostService.class).findroleIdBypostId(postId);
            roles.add(role);
        }

        List<SysMenu> menus = new ArrayList<>();
        for (List<Long> role : roles) {
            for (Long roleId : role) {
                if (roleId == 1L) {
                    menus = SpringUtils.getBean(ISysMenuService.class).selectMenusByUser(user);
                    break;
                }
                else {
                    menus = SpringUtils.getBean(ISysMenuService.class).findMenusByRoleId(roleId);
                }
            }
        }
        return menus;
    }
    /*获取当前用户*/
    public static SysUser getUser(){
        SysUser user = ShiroUtils.getSysUser();
        return user;
    }
    public static List<SysSite> findSiteList(SysSite sysSite)
    {
        List<SysSite> list =SpringUtils.getBean(ISysSiteService.class).selectSysSiteList(sysSite);
        return list;
    }
}
