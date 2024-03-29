package cn.wmxyyy.service;

import cn.wmxyyy.domain.PageBean;
import cn.wmxyyy.domain.User;

import java.util.List;
import java.util.Map;

/**
 * @author wmxyyy
 * @date 2019/12/9 19:42
 * @state 用户管理的业务接口
 */
public interface UserService {

    /**
     * 查询所有用户信息
     * @return
     */
    public List<User> findAll();

    /**
     * 登录方法
     * @param user
     * @return
     */
    User login(User user);


    /**
     * 添加用户
     * @param user
     */
    void addUser(User user);

    /**
     * 根据id删除用户
     * @param id
     */
    void deleteUser(String id);

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User findUserById(String id);

    /**
     * 修改用户信息
     * @param user
     */
    void updateUser(User user);

    /**
     * 批量删除用户
     * @param ids
     */
    void delSelectedUser(String[] ids);

    /**
     * 分页条件查询
     * @param currentPage
     * @param rows
     * @param condition
     */
    PageBean<User> findUserByPage(String currentPage, String rows, Map<String, String[]> condition);
}
