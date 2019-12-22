package cn.wmxyyy.dao;

import cn.wmxyyy.domain.User;

import java.util.List;
import java.util.Map;

/**
 * @author wmxyyy
 * @date 2019/12/9 19:42
 * @state
 */
public interface UserDao {
    public List<User> findAll();

    User findUserByUsernameAndPassword(String username, String password);

    void add(User user);

    void delete(int id);

    User findById(int i);

    void update(User user);

    /**
     * 查询总记录数
     * @param condition
     * @return
     */
    int findTotalCount(Map<String, String[]> condition);

    /**
     * 分页查询每页记录
     * @param start
     * @param rows
     * @param condition
     * @return
     */
    List<User> findByPage(int start, int rows, Map<String, String[]> condition);
}
