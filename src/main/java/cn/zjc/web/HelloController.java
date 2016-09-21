package cn.zjc.web;

import cn.zjc.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author zhangjinci
 * @version 2016/9/19 16:04
 * @function
 */
@RestController
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public Object hello() {
        User u = new User(1, "zjcscut",new Date(),"163#");
        logger.debug("u---->  " + u.toString());
        return u;
    }
}
