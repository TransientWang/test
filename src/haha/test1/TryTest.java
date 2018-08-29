package haha.test1;

/**
 * @author 王扶摇
 * @Title: TryTest
 * @ProjectName test
 * @date 2018/8/29 10:51
 */

public class TryTest {
    public static void main(String[] args) {

        try {
            System.out.println("测试");
            int i = 1;
            i/=0;
        } catch (Exception e) {
            System.out.println("捕获到异常");
            e.printStackTrace();
        } finally {
            System.out.println("进入finally处理");
            int i= 1;
            i/=0;
            System.out.println("finally结束");
        }
    }
}
