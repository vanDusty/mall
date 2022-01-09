package cn.van.mall.system.atom;

import cn.van.mall.system.convert.SysUserInfoConvert;
import cn.van.mall.system.entity.SysUserDO;
import cn.van.mall.system.mapper.SysUserMapper;
import cn.van.mall.system.model.SysUserInfoDTO;
import cn.van.mall.system.param.SysUserParam;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * Copyright (C), 2015-2022, 风尘博客
 * 公众号 : 风尘博客
 * @Author:   Van
 * Date:     2022/1/9 2:18 下午
 * Description: 系统用户原子层，封装增删改查接口
 * Version： V1.0
 */
@Component
public class SystemUserAtom {

    @Resource
    private SysUserMapper sysUserMapper;

    @Resource
    private SysUserInfoConvert userInfoConvert;

    /**
     * 新增用户信息
     * @param param
     * @return
     */
    public int insertUser(SysUserDO param){
        return sysUserMapper.insert(param);
    }

    /**
     * 根据条件查询用户列表（分页也可调用该方法）
     *
     * @param param 用户信息
     * @return 用户信息集合信息
     */
    public List<SysUserInfoDTO> selectUserList(SysUserParam param) {
        return userInfoConvert.doSToDtoS(sysUserMapper.selectUserList(param));
    }

    /**
     * 根据条件查询已分配某一角色的用户列表
     *
     * @param param 用户信息 + roleId(必填项)
     * @return 用户信息集合信息
     */
    public List<SysUserInfoDTO> selectAllocatedUserList(SysUserParam param){
        return userInfoConvert.doSToDtoS(sysUserMapper.selectAllocatedUserList(param));
    }

    /**
     * 未分配该角色的其他用户列表
     *
     * @param param 用户信息 + roleId(非填项)
     * @return 用户信息集合信息
     */
    public List<SysUserInfoDTO> selectUnassignedUserList(SysUserParam param){
        return userInfoConvert.doSToDtoS(sysUserMapper.selectUnassignedUserList(param));
    }

    /**
     * 通过用户名查询用户
     * @param userName
     * @return
     */
    public SysUserInfoDTO selectUserByUserName(String userName) {
        SysUserDO userDO = sysUserMapper.selectUserByParam(new HashMap<String, Object>(8){
            {
                put("userName", userName);
            }
        });
        return userInfoConvert.doToDTO(userDO);
    }

    /**
     * 通过用户ID查询用户
     * @param userId
     * @return
     */
    public SysUserInfoDTO selectUserByUserId(Long userId) {
        SysUserDO userDO = sysUserMapper.selectUserByParam(new HashMap<String, Object>(8){
            {
                put("userId", userId);
            }
        });
        return userInfoConvert.doToDTO(userDO);
    }

    /**
     * 校验用户名称是否唯一
     * @param userName
     * @return
     */
    public int checkUserNameUnique(String userName){
        QueryWrapper<SysUserDO> queryWrapper = new QueryWrapper();
        queryWrapper.lambda().eq(SysUserDO::getUserName, userName);
        return selectCount(queryWrapper);
    }

    /**
     * 校验手机号码是否唯一
     * @param phoneNum
     * @return
     */
    public int checkPhoneUnique(String phoneNum){
        QueryWrapper<SysUserDO> queryWrapper = new QueryWrapper();
        queryWrapper.lambda().eq(SysUserDO::getPhonenumber, phoneNum);
        return selectCount(queryWrapper);
    }

    /**
     * 校验email是否唯一
     * @param email
     * @return
     */
    public int checkEmailUnique(String email){
        QueryWrapper<SysUserDO> queryWrapper = new QueryWrapper();
        queryWrapper.lambda().eq(SysUserDO::getEmail, email);
        return selectCount(queryWrapper);
    }

    /**
     * 根据用户ID修改用户信息
     * @param param
     * @return
     */
    public int updateUser(SysUserDO param){
        return sysUserMapper.updateById(param);
    }

    /**
     * 根据用户名修改用户头像
     * @param userName
     * @param avatar
     * @return
     */
    public int updateUserAvatar(String userName,String avatar){
        SysUserDO sysUserDO = new SysUserDO(userName);
        sysUserDO.setAvatar(avatar);
        return updateUserByUserName(sysUserDO);
    }

    /**
     * 根据用户名 重置用户密码
     * @param userName
     * @param password
     * @return
     */
    public int resetUserPwd(String userName, String password){
        SysUserDO sysUserDO = new SysUserDO(userName);
        sysUserDO.setPassword(password);
        return updateUserByUserName(sysUserDO);
    }

    /**
     * 通过用户ID删除用户
     * @param userId
     * @return
     */
    public int deleteUserById(Long userId){
        SysUserDO sysUserDO = new SysUserDO(userId);
        sysUserDO.setDelFlag("2");
        return sysUserMapper.updateById(sysUserDO);
    }

    /**
     * 批量删除用户信息
     * @param userIds
     * @return
     */
    public int deleteUserByIds(List<Long> userIds) {
        SysUserDO sysUserDO = new SysUserDO();
        sysUserDO.setDelFlag("2");
        return sysUserMapper.update(sysUserDO, new UpdateWrapper<SysUserDO>().lambda().in(SysUserDO::getUserId, userIds));
    }


    private int selectCount(QueryWrapper<SysUserDO> wrapper) {
        return sysUserMapper.selectCount(wrapper).intValue();
    }

    private int updateUserByUserName(SysUserDO userDO) {
        return sysUserMapper.update(userDO, new UpdateWrapper<SysUserDO>().lambda().eq(SysUserDO::getUserName, userDO.getUserName()));
    }
}