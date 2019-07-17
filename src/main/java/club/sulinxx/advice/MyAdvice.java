package club.sulinxx.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Title: MyAdvice
 *
 * @author sulin
 * @date 2019-07-17
 */
public class MyAdvice {

    //desc 前置通知
    public void Advice_before(JoinPoint jp) {
        Object[] args = jp.getArgs();
        int arg1= (Integer) args[0];
        String arg2= (String) args[1];
        System.out.println("before参数获取："+arg1+"--"+arg2);
        System.out.println("------切面通知方法before-----");

    }

    //desc 后置通知
    public void Advice_after() {
        System.out.println("------切面通知方法after------");
    }

    //desc 环绕通知--around
    public String Advice_around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("**********环绕通知-开始-around-start**********");
        Object[] args = pjp.getArgs();
        args[0]="dd";
        args[1]=666;
        //处理可能发生的异常，这里直接抛出，一般也交由调用处理
        String result = (String) pjp.proceed(args);
        System.out.println("通知获取result"+result);
        System.out.println("**********环绕通知-结束-around-start**********");
        return  result;
    }

    //desc 异常通知--AfterThrowing
    public void Advice_afterThrowing(Throwable e){
        //传入异常，但不能处理异常
        //异常在around中处理，上面around直接抛出了，实际还是交给调用方法处理
        e.printStackTrace();
        System.out.println("出现异常才进入");
    }

    //desc 返回通知--afterReturn
    public void Advice_afterReturn(){
        System.out.println("afterReturn");
    }
}
