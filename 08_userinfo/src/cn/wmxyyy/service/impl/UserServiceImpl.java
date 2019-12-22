package cn.wmxyyy.service.impl;

import cn.wmxyyy.dao.UserDao;
import cn.wmxyyy.dao.impl.UserDaoImpl;
import cn.wmxyyy.domain.PageBean;
import cn.wmxyyy.domain.User;
import cn.wmxyyy.service.UserService;

import java.util.List;
import java.util.Map;

/**
 * @author wmxyyy
 * @date 2019/12/9 20:01
 * @state 用户管理业务接口的具体实现
 */
public class UserServiceImpl implements UserService {
    private UserDao dao = new UserDaoImpl();

    @Override
    public List<User> findAll() {
        return dao.findAll();
    }

    @Override
    public User login(User user) {
        return dao.findUserByUsernameAndPassword(user.getUsername(), user.getPassword());
    }

    @Override
    public void addUser(User user) {
        dao.add(user);
    }

    @Override
    public void deleteUser(String id) {

        dao.delete(Integer.parseInt(id));
    }

    @Override
    public User findUserById(String id) {
        return null;
    }

    @Override
    public void updateUser(User user) {
        dao.update(user);
    }

    @Override
    public void delSelectedUser(String[] ids) {

    }

    @Override
    public PageBean<User> findUserByPage(String _currentPage, String _rows, Map<String, String[]> condition) {

        int currentPage = Integer.parseInt(_currentPage);
        int rows = Integer.parseInt(_rows);

        if (currentPage <= 0){
            currentPage = 1;
        }
        //1.创建空的PageBean对象
        PageBean<User> pb = new PageBean<User>();
        //2.设置参数
        pb.setCurrentPage(currentPage);
        pb.setRows(rows);

        //3.调用dao查询总记录数
        int totalCount = dao.findTotalCount(condition);
        pb.setTotalCount(totalCount);
        //4.调用dao查询List集合
        //计算开始的记录索引
        int start = (currentPage -1) * rows;
        List<User> list = dao.findByPage(start, rows, condition);
        pb.setList(list);

        //5.计算总页码
        int totalPage = (totalCount % rows) == 0 ? totalCount/rows : (totalCount/rows) + 1;
        pb.setTotalPage(totalPage);

        return pb;

    }
}
