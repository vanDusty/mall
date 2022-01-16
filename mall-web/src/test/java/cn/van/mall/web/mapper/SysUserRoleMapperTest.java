package cn.van.mall.web.mapper;

import cn.van.mall.system.atom.SysUserRoleAtom;
import cn.van.mall.system.param.SysUserRoleParam;
import cn.van.mall.web.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Copyright (C), 2015-2022, 风尘博客
 * 公众号 : 风尘博客
 *
 * @Author: VanFan
 * Date:     2022/1/16 3:13 下午
 * Description:
 * Version： V1.0
 */
@Slf4j
public class SysUserRoleMapperTest extends BaseTest {

    @Resource
    private SysUserRoleAtom userRoleAtom;

    @Test
    public void insertBatch() {
        SysUserRoleParam userRoleParam1 = new SysUserRoleParam(11L, 12L);
        SysUserRoleParam userRoleParam2 = new SysUserRoleParam(12L, 12L);
        SysUserRoleParam userRoleParam3 = new SysUserRoleParam(11L, 13L);
        SysUserRoleParam userRoleParam4 = new SysUserRoleParam(13L, 13L);
        SysUserRoleParam userRoleParam5 = new SysUserRoleParam(13L, 14L);
        List<SysUserRoleParam> list = Stream.of(userRoleParam1, userRoleParam2, userRoleParam3, userRoleParam4, userRoleParam5).collect(Collectors.toList());
        int num = userRoleAtom.insertBatch(list);
        log.info("insertBatch:{}", num);
        int number = userRoleAtom.countUserRoleByRoleId(13l);
        log.info("countUserRoleByRoleId:{}", number);
    }

    @Test
    public void delete() {
        int num = userRoleAtom.deleteUserRoleByUserId(11l);
        log.info("insertBatch:{}", num);

        int number = userRoleAtom.deleteUserRoleByUserIdAndRoleId(12l, 12l);
        log.info("insertBatch:{}", number);
    }

    @Test
    public void delete2() {
        Long[] userIds = {11l, 13l};
        int num = userRoleAtom.deleteUserRoleByUserIds(userIds);
        log.info("insertBatch:{}", num);
    }

}