package cn.wmxyyy.test;

import cn.wmxyyy.dao.UserDao;
import cn.wmxyyy.dao.impl.UserDaoImpl;
import cn.wmxyyy.domain.User;
import org.junit.Test;

/**
 * @author wmxyyy
 * @date 2019/12/10 12:13
 * @state
 */
public class UserDaoTest {

    @Test
    public void testAdd(){
        User addUser = new User();
        addUser.setName("cc");
        addUser.setGender("1");
        addUser.setAge(23);
        addUser.setAddress("guangdong");
        addUser.setQq("3424");
        addUser.setEmail("sadfdaffa");

        UserDao dao = new UserDaoImpl();
        dao.add(addUser);
    }
}
