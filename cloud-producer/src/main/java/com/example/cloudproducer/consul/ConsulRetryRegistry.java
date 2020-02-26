//package com.example.cloudproducer.consul;
//
//
//import cn.hutool.core.thread.ThreadUtil;
//import com.ecwid.consul.v1.agent.model.NewService;
//import org.apache.http.impl.execchain.RetryExec;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.cloud.client.ServiceInstance;
//import org.springframework.cloud.client.discovery.DiscoveryClient;
//import org.springframework.cloud.consul.serviceregistry.ConsulAutoRegistration;
//import org.springframework.cloud.consul.serviceregistry.ConsulServiceRegistry;
//import java.util.Iterator;
//import java.util.List;
//
///**
// * @author wuxiaopeng
// * @description:
// * @date 2020/1/9 14:03
// */
//public class ConsulRetryRegistry  implements CommandLineRunner{
//    private static final Logger log = LoggerFactory.getLogger(ConsulRetryRegistry.class);
//    private ConsulAutoRegistration consulAutoRegistration;
//    private ConsulServiceRegistry consulServiceRegistry;
//    private DiscoveryClient discoveryClient;
//    private ConsulRetryProperties properties;
//
//    public ConsulRetryRegistry(ConsulAutoRegistration consulAutoRegistration, ConsulServiceRegistry consulServiceRegistry, DiscoveryClient discoveryClient, ConsulRetryProperties properties) {
//        this.consulAutoRegistration = consulAutoRegistration;
//        this.consulServiceRegistry = consulServiceRegistry;
//        this.discoveryClient = discoveryClient;
//        this.properties = properties;
//    }
//
//    @Override
//    public void run(String... args) {
//        NewService service = this.consulAutoRegistration.getService();
//        ThreadUtil.newSingleExecutor().execute(() -> {
//            log.info("consul服务监测已启动【{}】", service);
//
//            while (true) {
//                try {
//                    Thread.sleep(this.properties.getInitialInterval());
//                } catch (InterruptedException var4) {
//                    log.error("consul服务已停止重新注册【{}】", service);
//                    return;
//                }
//
//                if (!this.checkStatus(service)) {
//                    try {
//                        this.registry();
//                        log.info("consul服务重新注册成功【{}】", service);
//                    } catch (Exception var3) {
//                        log.warn("consul服务当前注册失败，准备下一次注册【{}】", service);
//                    }
//                }
//            }
//        });
//    }
//
//    private void registry() {
//        this.consulServiceRegistry.register(this.consulAutoRegistration);
//    }
//
//    private boolean checkStatus(NewService service) {
//        boolean flag = false;
//
//        try {
//            List<ServiceInstance> instances = this.discoveryClient.getInstances(service.getName());
//            Iterator var4 = instances.iterator();
//
//            while (var4.hasNext()) {
//                ServiceInstance instance = (ServiceInstance) var4.next();
//                if (instance.getServiceId().equals(service.getName())) {
//                    flag = true;
//                    break;
//                }
//            }
//        } catch (Exception var6) {
//        }
//
//        log.info("consul服务心跳检测结束，检测结果为：{}", flag ? "正常" : "异常");
//        return flag;
//    }
//}
