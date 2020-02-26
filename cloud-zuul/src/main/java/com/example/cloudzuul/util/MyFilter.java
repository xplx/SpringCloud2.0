//package com.example.cloudzuul.util;
//
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.context.RequestContext;
//import com.netflix.zuul.exception.ZuulException;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.http.HttpServletRequest;
//
///**
// * @Description:zuul服务过滤
// * @author:wuxiaopeng
// * @create: 2019-06-05 10:31
// **/
////@Component
//public class MyFilter extends ZuulFilter {
//    private static Logger log = LoggerFactory.getLogger(MyFilter.class);
//
//    /**
//     * pre：路由之前
//     * routing：路由之时
//     * post： 路由之后
//     * error：发送错误调用
//     * @return
//     */
//    @Override
//    public String filterType() {
//        return "post";
//    }
//
//    /**
//     * 过滤的顺序
//     * @return
//     */
//    @Override
//    public int filterOrder() {
//        return 0;
//    }
//
//    /**
//     * 这里可以写逻辑判断，是否要过滤，本文true,永远过滤。
//     * @return
//     */
//    @Override
//    public boolean shouldFilter() {
//        return true;
//    }
//
//    /**
//     * 过滤器的具体逻辑。
//     * @return
//     * @throws ZuulException
//     */
//    @Override
//    public Object run() throws ZuulException {
//        RequestContext ctx = RequestContext.getCurrentContext();
//        HttpServletRequest request = ctx.getRequest();
//        log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
//        //获取token值
//        Object accessToken = request.getParameter("token");
//        if(accessToken == null) {
//            log.warn("token is empty");
//            ctx.setSendZuulResponse(false);
//            ctx.setResponseStatusCode(401);
//            try {
//                ctx.getResponse().getWriter().write("token is empty");
//            }catch (Exception e){}
//
//            return null;
//        }
//        log.info("ok");
//        return null;
//    }
//}
