package com.xtx.aicodegenerator.service;

import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.xtx.aicodegenerator.model.dto.UserQueryRequest;
import com.xtx.aicodegenerator.model.entity.User;
import com.xtx.aicodegenerator.model.vo.LoginUserVO;
import com.xtx.aicodegenerator.model.vo.UserVO;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

/**
 * 用户 服务层。
 *
 * @author <a>xtx</a>
 */
public interface UserService extends IService<User> {
    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用于返回登陆后的用户信息
     *
     * @param user 用户信息
     * @return 脱敏后的用户信息
     */
    LoginUserVO getLoginUserVO(User user);

    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 加密
     *
     * @param userPassword 密码
     * @return 加密后的值
     */
    String getEncryptPassword(String userPassword);

    /**
     * 获取当前登录用户
     *
     * @param request 请求
     * @return 用户信息
     */
    User getLoginUser(HttpServletRequest request);

    UserVO getUserVO(User user);
    List<UserVO> getUserVOList(List<User> userList);

    /**
     * 根据Request转成QueryWrapper
     *
     * @param userQueryRequest 前端条件
     * @return 返回查询对象
     */
    QueryWrapper getQueryWrapper(UserQueryRequest userQueryRequest);

    /**
     * 用户注销
     *
     * @param request 请求
     * @return true 成功，false 失败
     */
    boolean userLogout(HttpServletRequest request);


}
