package com.test;

import com.test.service.OrderService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author lg
 * @version 1.0
 * @since 1.8
 */
@Controller
public class test {

    @Autowired
    OrderService orderService;
    @Test
    public void testGetList(){
        orderService.getList();
    }

}
