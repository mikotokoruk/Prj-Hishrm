package com.example.authority.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.authority.entity.Menu;

import java.util.List;

/**
 * @program: hishrm
 * @ClassName 菜单表 service
 * @description:
 * @author: glb
 * @create: 2023-02-01
 * @Version 2.0
 **/
public interface MenuService extends IService<Menu> {

    List<Menu> getmenuTrees(Long id);

    List<Menu> getmenuTrees();

    List<Menu> getRouterByUsername(String name);
}
