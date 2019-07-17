package club.sulinxx.method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Title: TgTest
 *
 * @author sulin
 * @date 2019-07-17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-aop.xml"})
public class TgTest {
    @Autowired
    private Tg tg;

    //前置测试
    @Test
    public void t1() {
        tg.t1();
    }

    // 有参 前置测试
    @Test
    public void t11() {
        tg.t1(1);
    }

    // 有返回值 前置测试
    @Test
    public void t12() {
        tg.t1(1,"呀");
    }

    //后置测试 after
    @Test
    public void t2() {
//        tg.t2();
    }

    //正常返回测试  afterReturn
    @Test
    public void t5() {
        tg.t5();
    }

    //环绕测试 around
    @Test
    public void t3() {
        String status = tg.t3("sulin", 151515);
        System.out.println("正常:"+status);
    }

    //异常测试 afterThrowing
    @Test
    public void t4() {
        tg.t4();
    }


}