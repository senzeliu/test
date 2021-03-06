package org.example.spring.aop.xml;

import org.example.spring.aop.annotation.test.Test;
import org.example.spring.common.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liusenze
 * @Description:
 * @since 2021/6/2 10:30 下午
 */
public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Test test = (Test) applicationContext.getBean("test");
        //转成userserviceImpl会报错，因为aop是代理，返回的是接口
        //UserService userService =  applicationContext.getBean("userService", UserServiceImpl.class);
        test.test();

        //UserService userService = (UserService) applicationContext.getBean("userService");
        //转成userserviceImpl会报错，因为aop是代理，返回的是接口
        //UserService userService =  applicationContext.getBean("userService", UserServiceImpl.class);
        //userService.test();
    }
}
