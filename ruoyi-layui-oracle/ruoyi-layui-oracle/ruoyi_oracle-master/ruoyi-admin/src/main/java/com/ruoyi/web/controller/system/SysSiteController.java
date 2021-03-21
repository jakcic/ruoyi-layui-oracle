package com.ruoyi.web.controller.system;

import java.util.List;

import com.ruoyi.common.utils.ShiroUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SysSite;
import com.ruoyi.system.service.ISysSiteService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 站点管理Controller
 * 
 * @author ruoyi
 * @date 2021-01-17
 */
@Controller
@RequestMapping("/system/site")
public class SysSiteController extends BaseController
{
    private String prefix = "system/site";

    @Autowired
    private ISysSiteService sysSiteService;

    @RequiresPermissions("system:site:view")
    @GetMapping()
    public String site()
    {
        return prefix + "/site";
    }

    /**
     * 查询站点管理列表
     */
    @RequiresPermissions("system:site:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysSite sysSite)
    {
        startPage();
        List<SysSite> list = sysSiteService.selectSysSiteList(sysSite);
        return getDataTable(list);
    }

    /**
     * 导出站点管理列表
     */
    @RequiresPermissions("system:site:export")
    @Log(title = "站点管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysSite sysSite)
    {
        List<SysSite> list = sysSiteService.selectSysSiteList(sysSite);
        ExcelUtil<SysSite> util = new ExcelUtil<SysSite>(SysSite.class);
        return util.exportExcel(list, "site");
    }

    /**
     * 新增站点管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存站点管理
     */
    @RequiresPermissions("system:site:add")
    @Log(title = "站点管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysSite sysSite)
    {
        return toAjax(sysSiteService.insertSysSite(sysSite));
    }

    /**
     * 修改站点管理
     */
    @GetMapping("/edit/{siteId}")
    public String edit(@PathVariable("siteId") Long siteId, ModelMap mmap)
    {
        SysSite sysSite = sysSiteService.selectSysSiteById(siteId);
        mmap.put("sysSite", sysSite);
        return prefix + "/edit";
    }

    /**
     * 修改保存站点管理
     */
    @RequiresPermissions("system:site:edit")
    @Log(title = "站点管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysSite sysSite)
    {
        sysSite.setUpdateBy(ShiroUtils.getLoginName());
        return toAjax(sysSiteService.updateSysSite(sysSite));
    }

    /**
     * 删除站点管理
     */
    @RequiresPermissions("system:site:remove")
    @Log(title = "站点管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sysSiteService.deleteSysSiteByIds(ids));
    }
    /**
     * 自定义查询站点管理列表
     */
//    @RequiresPermissions("system:site:list")
    @CrossOrigin
    @RequestMapping("/listSite")
    @ResponseBody
    public List<SysSite> findSiteList(SysSite sysSite)
    {
        startPage();
        List<SysSite> list = sysSiteService.selectSysSiteList(sysSite);
        return list;
    }
}
