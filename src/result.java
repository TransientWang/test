/**
 * @author 王扶摇
 * @Title: result
 * @ProjectName test
 * @date 2018/7/28 16:01
 */
public class result {
    volatile Integer a ;

    volatile String b;

    public result(Integer a, String b) {
        this.a = a;
        this.b = b;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}
