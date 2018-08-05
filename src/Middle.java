import java.util.ArrayList;
import java.util.List;

/**
 * @author 王扶摇
 * @Title: Middle
 * @ProjectName test
 * @date 2018/8/2 14:36
 */

public class Middle {
    public static void main(String[] args) {
        List<result> list = new ArrayList<>();
        list.add(new result(1,"2"));
        list.add(new result(2,"3"));
        list.add(new result(4,"4"));
        list.add(null);

        result result = new result(2,"3");

        System.out.println(list.indexOf(null));
    }
}
