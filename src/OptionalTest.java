import com.alibaba.fastjson.JSON;
import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.xml.internal.bind.v2.model.core.ID;

import javax.swing.*;
import javax.swing.text.html.Option;
import java.io.UncheckedIOException;
import java.util.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author 密码123456
 * @Title: OptionalTest
 * @ProjectName test
 * @Description: TODO
 * @date 2018/7/16 18:51
 */
public class OptionalTest {

    public static void main(String[] args) {

        String line = "哇个Fu11211-";
        String pattern = "^([0-9A-Za-z-_]|[\\u4e00-\\u9fa5])*$";
        System.out.println(Pattern.matches("^([0-9A-Za-z-_]|[\\u4e00-\\u9fa5])*$", line));
    }


}
