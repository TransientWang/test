package haha.com;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

/**
 * @author 王扶摇
 * @Title: AIOtest
 * @ProjectName test
 * @date 2018/8/23 9:36
 */

public class AIOtest {
    public static void d() throws IOException {
        AsynchronousServerSocketChannel serverSocketChannel = AsynchronousServerSocketChannel
                .open()
                .bind(new InetSocketAddress(9999));
          serverSocketChannel.accept(null, new CompletionHandler<AsynchronousSocketChannel, Object>() {
              @Override
              public void completed(AsynchronousSocketChannel result, Object attachment) {
                  System.out.println("接受到请求");
                  serverSocketChannel.accept(null,this);
              }

              @Override
              public void failed(Throwable exc, Object attachment) {

              }
          });


    }


}
