package cn.van.mall.web.mapper;

import cn.van.mall.system.atom.SysDeptAtom;
import cn.van.mall.system.model.SysDeptDTO;
import cn.van.mall.system.param.SysDeptParam;
import cn.van.mall.web.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import javax.annotation.Resource;
import java.util.List;

/**
 * Copyright (C), 2015-2022, 风尘博客
 * 公众号 : 风尘博客
 *
 * @Author: VanFan
 * Date:     2022/1/16 7:08 下午
 * Description: 系统部门测试
 * Version： V1.0
 */
@Slf4j
public class SystemDeptMapperTest extends BaseTest {

    @Resource
    private SysDeptAtom sysDeptAtom;

    @Test
    public void selectData() {
        SysDeptParam deptParam = new SysDeptParam();
        deptParam.setDeptName("部门");
        List<SysDeptDTO> list = sysDeptAtom.selectDeptList(deptParam);
        log.info("list:{}", list);
        List<Long> idList = sysDeptAtom.selectDeptListByRoleId(2L, Boolean.TRUE);
        log.info("idList:{}", idList);
        idList = sysDeptAtom.selectDeptListByRoleId(2L, Boolean.FALSE);
        log.info("idList:{}", idList);
        SysDeptDTO deptDTO = sysDeptAtom.selectDeptById(100l);
        log.info("dept:{}", deptDTO);
        List<SysDeptDTO> deptDTOList = sysDeptAtom.selectChildrenDeptById(101l);
        log.info("list:{}", deptDTOList);
    }

    @Test
    public void count() {
        int num = sysDeptAtom.hasChildByDeptId(109l);
        log.info("num:{}", num);
        num = sysDeptAtom.hasChildByDeptId(101l);
        log.info("num:{}", num);

        int number = sysDeptAtom.checkDeptExistUser(100l);
        log.info("number:{}", number);

        int index = sysDeptAtom.checkDeptNameUnique("深圳总公司", 100l);
        log.info("index:{}", index);
    }

    @Test
    public void insertDept() {
        SysDeptParam deptParam = new SysDeptParam();
        deptParam.setParentId(100l);
        deptParam.setAncestors("0,100");
        deptParam.setDeptName("name");
        deptParam.setOrderNum(1);
        deptParam.setLeader("van");
        deptParam.setPhone("12580");
        deptParam.setStatus("0");
        deptParam.setEmail("mail");
        deptParam.setCreateBy("admin");
        int num = sysDeptAtom.insertDept(deptParam);
        log.info("num:{}", num);
    }

    @Test
    public void updateDept() {
        SysDeptParam deptParam = new SysDeptParam();
        deptParam.setDeptId(110l);
        deptParam.setUpdateBy("admin");
        int num = sysDeptAtom.updateDept(deptParam);
        log.info("num:{}", num);
        Long[] deptIds = {109L, 110L};
        sysDeptAtom.updateDeptStatusNormal(deptIds);

        int number = sysDeptAtom.deleteDeptById(100l);
        log.info("number:{}", number);
    }

}