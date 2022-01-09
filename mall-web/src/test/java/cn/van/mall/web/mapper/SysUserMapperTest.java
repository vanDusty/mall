package cn.van.mall.web.mapper;

import cn.van.mall.system.atom.SystemUserAtom;
import cn.van.mall.system.entity.SysUserDO;
import cn.van.mall.system.param.SysUserParam;
import cn.van.mall.web.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Copyright (C), 2015-2022, 风尘博客
 * 公众号 : 风尘博客
 * Author:   Van
 * Date:     2022/1/5 11:28 下午
 * Description: 系统用户增删改查测试
 * Version： V1.0
 */
@Slf4j
public class SysUserMapperTest extends BaseTest{

    @Resource
    private SystemUserAtom systemUserAtom;

    @Test
    public void insertUser() {
        SysUserDO userDO = new SysUserDO();
        userDO.setUserId(4l);
        userDO.setDeptId(103l);
        userDO.setUserName("van");
        userDO.setNickName("vanfan");
        userDO.setUserType("00");
        userDO.setEmail("mail");
        userDO.setPhonenumber("110");
        userDO.setSex("2");
        userDO.setAvatar("url");
        userDO.setAvatar("url");
        userDO.setPassword("password");
        userDO.setLoginIp("127.0.0.1");
        userDO.setLoginDate(LocalDateTime.now());
        userDO.setRemark("remark");
        systemUserAtom.insertUser(userDO);
    }

    @Test
    public void selectUserList() {
        SysUserParam param = new SysUserParam();
        param.setUserName("admin");
        List<SysUserDO> list = systemUserAtom.selectUserList(param);
        log.info("selectUserList {}", list);
    }

    @Test
    public void selectUserByRole() {
        SysUserParam param = new SysUserParam();
        param.setRoleId(1L);
        List<SysUserDO> list = systemUserAtom.selectAllocatedUserList(param);
        log.info("selectAllocatedUserList {}", list);
        list = systemUserAtom.selectUnassignedUserList(param);
        log.info("selectUnassignedUserList {}", list);
    }

    @Test
    public void getUser() {
        SysUserDO sysUserDO = systemUserAtom.selectUserByUserId(2L);
        log.info("selectUserByUserId {}", sysUserDO);
        sysUserDO = systemUserAtom.selectUserByUserName("vanfan");
        log.info("selectUserByUserName {}", sysUserDO);
    }

    @Test
    public void checkUnique() {
        String userName = "VanFan";
        int num = systemUserAtom.checkUserNameUnique(userName);
        log.info("checkUserNameUnique {}", num);
        String phoneNum = "119";
        num = systemUserAtom.checkPhoneUnique(phoneNum);
        log.info("checkPhoneUnique {}", num);
        String email = "mail";
        num = systemUserAtom.checkEmailUnique(email);
        log.info("checkEmailUnique {}", num);
    }

    @Test
    public void update() {
        SysUserDO param = new SysUserDO();
        param.setUserId(3L);
        param.setRemark("----");
        int num = systemUserAtom.updateUser(param);
        log.info("updateUser {}", num);
        String userName = "van";
        String avator = "avator";
        num = systemUserAtom.updateUserAvatar(userName, avator);
        log.info("updateUserAvatar {}", num);
        String password = "word";
        num = systemUserAtom.resetUserPwd(userName, password);
        log.info("resetUserPwd {}", num);
    }

    @Test
    public void delete() {
        int num = systemUserAtom.deleteUserById(1l);
        log.info("deleteUserById {}", num);
        List<Long> userIds = Stream.of(2L,3L).collect(Collectors.toList());
        num = systemUserAtom.deleteUserByIds(userIds);
        log.info("deleteUserByIds {}", num);
    }
}