package com.wayne.wayneBlog.iptx;

import com.wayne.wayneBlog.config.websocket.MessageSocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class IptxTask {
    @Autowired
    MessageSocket messageSocket;

    @Scheduled(cron = "* * */3 * * *")
    public void doSomething() throws IOException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        messageSocket.sendInfo(simpleDateFormat.format(new Date()), null);
    }
}
