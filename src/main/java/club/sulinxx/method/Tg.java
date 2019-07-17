package club.sulinxx.method;

/**
 * Title: Tg
 *
 * @author sulin
 * @date 2019-07-17
 */
public class Tg {

    //desc 前置对象--before
    public void t1() {
        System.out.println("**********内部方法1**********");
        System.out.println("**********内部方法1**********");
        System.out.println("**********内部方法1**********");

    }
    public void t1(int a) {
        System.out.println("**********内部方法1**********");
        System.out.println("**********"+a+a+a+a+a+"******");
        System.out.println("**********内部方法1**********");
        System.out.println("**********内部方法1**********");

    }

    public Integer t1(int a,String b) {
        System.out.println("**********内部方法1**********");
        System.out.println("**********"+a+a+a+a+a+"******");
        System.out.println("**********"+b+b+b+b+b+"******");
        System.out.println("**********内部方法1**********");
        System.out.println("**********内部方法1**********");
        return a;

    }
    //desc 后置对象--after/finally
    public void t2() {
//        System.out.println(10/0);
        System.out.println("**********内部方法2**********");
        System.out.println("**********内部方法2**********");
        System.out.println("**********内部方法2**********");
    }

    //desc 环绕对象--around
    public String t3(String name,long pwd){
        System.out.println("**********内部方法3**********");
        System.out.println("---"+name+"---"+pwd+"---");
        System.out.println("**********内部方法3**********");
        System.out.println("**********内部方法3**********");
        return "success!!";
    }

    //desc 异常对象--AfterThrowing
    public void t4(){
        System.out.println("**********内部方法4**********");
        System.out.println("**********内部方法4**********");
        System.out.println("**********内部方法4**********");
    }

    //desc 返回对象--afterReturn
    public void t5(){
//        System.out.println(10/0);
        System.out.println("**********内部方法5**********");
        System.out.println("**********内部方法5**********");
        System.out.println("**********内部方法5**********");
    }
}
