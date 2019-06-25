package org.heqingfu;

import org.heqingfu.controller.UserController;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * 测试用例
 * Created by heqingfu on 2019/6/25.
 */
public class UserControllerTest extends SpringBootDemoTests {

    @Autowired
    UserController userController;

    @Test
    public void sayHelloWorld(){
        Assert.assertSame(userController.sayHelloWorld(),"hello, world!");
    }

}
