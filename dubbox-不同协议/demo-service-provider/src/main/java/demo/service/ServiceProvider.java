package demo.service;


import demo.service.api.utils.ApplicationContextUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;


/**
 * Created by yangjunming on 3/4/16.
 * author: yangjunming@huijiame.com
 */
public class ServiceProvider {

    public static void main(String[] args) throws IOException {
        ApplicationContextUtil.getInstance().getContext();
        Logger log = LoggerFactory.getLogger(ServiceProvider.class);
        log.info("服务已启动!");
        System.out.println("servicve has been started ...");
        System.in.read();
    }
}
