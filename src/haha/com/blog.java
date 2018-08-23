package haha.com;

import com.alibaba.fastjson.JSON;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.SelectorProvider;
import java.util.Date;

/**
 * @author 王扶摇
 * @Title: blog
 * @ProjectName test
 * @date 2018/8/18 14:07
 */

public class blog {
    String name;
    String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static void main(String[] args) throws IOException {
        CtiLinkEnterpriseVoice voice = new CtiLinkEnterpriseVoice();
        voice.setId(599);
        voice.setEnterpriseId(6000001);
        TWatchLeasedLine tWatchLeasedLine = new TWatchLeasedLine();
        tWatchLeasedLine.setId(110);
        tWatchLeasedLine.setName("华夏北京");
        tWatchLeasedLine.setDeviceId(4);
        tWatchLeasedLine.setTargetIp("192.168.1.1");
        tWatchLeasedLine.setPort(9999);
        tWatchLeasedLine.setVrf("xxx");
        tWatchLeasedLine.setComment("暂无");
        tWatchLeasedLine.setCreateTime(new Date());
        System.out.println(JSON.toJSONString(voice));

    }
}
