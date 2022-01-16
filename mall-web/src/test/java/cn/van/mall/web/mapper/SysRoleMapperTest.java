package cn.van.mall.web.mapper;

import cn.van.mall.system.atom.SystemRoleAtom;
import cn.van.mall.system.entity.SysRoleDO;
import cn.van.mall.system.model.SysRoleDTO;
import cn.van.mall.system.param.SysRoleParam;
import cn.van.mall.web.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Copyright (C), 2015-2022, 风尘博客
 * 公众号 : 风尘博客
 * Author:   Van
 * Date:     2022/1/9 9:05 下午
 * Description: 系统角色增删改查测试
 * Version： V1.0
 */
@Slf4j
public class SysRoleMapperTest extends BaseTest {
    @Resource
    private SystemRoleAtom roleAtom;

    @Test
    public void selectRoleList() {
        SysRoleParam param = new SysRoleParam();
//        param.setRoleId(1L);
        param.setParams(new HashMap<String,Object>(){
            {
                put("beginTime", null);
                put("endTime", null);
            }
        });
        List<SysRoleDTO> list = roleAtom.selectRoleList(param);
        log.info("selectUserList {}", list);
    }

    @Test
    public void selectRoleByUserId() {
        List<SysRoleDTO> list = roleAtom.selectRoleByUserId(2L);
        log.info("selectRoleByUserId {}", list);
        list = roleAtom.selectRoleByUserName("超级管理员");
        log.info("selectRoleByUserName {}", list);
    }

    @Test
    public void selectRoleIdByUserId() {
        List<Long> list = roleAtom.selectRoleIdByUserId(1L);
        log.info("selectRoleByUserId {}", list);
        SysRoleDTO roleDTO = roleAtom.selectById(1L);
        log.info("roleDTO {}", roleDTO);
    }

    @Test
    public void checkUnique() {
        int number = roleAtom.checkRoleNameUnique("超级管理员");
        log.info("checkRoleNameUnique {}", number);
        int num = roleAtom.checkRoleKeyUnique("超级管理员");
        log.info("checkRoleKeyUnique {}", num);
    }

    @Test
    public void insert() {
        SysRoleDO roleDO = new SysRoleDO();
//        int number = roleAtom.insertRole(roleDO);
        roleDO.setRoleId(1L);
        roleDO.setUpdateBy("van");
        roleDO.setUpdateTime(LocalDateTime.now());
        int num = roleAtom.updateRole(roleDO);
        log.info("updateRole {}", num);
        int index = roleAtom.deleteRoleById(1L);
        log.info("deleteRoleById {}", index);
        int indexNum = roleAtom.deleteRoleByIds(Stream.of(1L, 2L).collect(Collectors.toList()));
        log.info("deleteRoleByIds {}", indexNum);
    }
}