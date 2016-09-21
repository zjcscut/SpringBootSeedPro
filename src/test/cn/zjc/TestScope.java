package cn.zjc;

import cn.zjc.dao.UserDAO;
import cn.zjc.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zhangjinci
 * @version 2016/9/21 17:12
 * @function
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@Transactional
@SpringApplicationConfiguration(Application.class)
public class TestScope {

    @Autowired
    private UserDAO userDAO;

    @Test
    public void TestSelect() {
        User u = userDAO.selectById(1);
        System.out.println(u);
    }
}
