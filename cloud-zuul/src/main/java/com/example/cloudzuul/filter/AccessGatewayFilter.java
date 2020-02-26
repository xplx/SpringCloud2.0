package com.example.cloudzuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Mr.Yangxiufeng
 * Date: 2019-05-27
 * Time: 11:11
 */
@Configuration
@Slf4j
public class AccessGatewayFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return FilterConstants.PRE_DECORATION_FILTER_ORDER - 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String requestUrl = request.getRequestURI();
        String authorization = request.getHeader("Authorization");
        log.info("requestUrl is {}",requestUrl);
        log.info("authorization is {}", authorization);
//        if(authorization != null) {
//            System.out.println("authorization: " + authorization);
//            ctx.addZuulRequestHeader("Authorization", authorization);
//            ctx.addZuulRequestHeader("endpointCode", endpointCode);
//            ctx.addZuulRequestHeader("tenantId", tenantId);
//            ctx.addZuulRequestHeader("authorization", authorization);
//            ctx.addZuulRequestHeader("endpointcode", endpointCode);
//            ctx.addZuulRequestHeader("tenantid", tenantId);
//        }
        //TODO 进行权限判断，通过渠道进行权限控制（mall|man|os-pc|os-wx）
//        String channel = request.getHeader("channel");
//        log.info("channel is {}", channel);
//        if (StringUtils.isEmpty(channel)){
//            ctx.setSendZuulResponse(false);//不再进行转发
//            ctx.setResponseStatusCode(HttpStatus.FORBIDDEN.value());//提示403禁止访问。
//            return null;
//        }
//        if ("mall".equals(channel)){
//            //TODO 进行mall的权限判断
//        }else if ("man".equals(channel)){
//            //TODO 进行man的权限判断
//        }else if ("os-pc".equals(channel)){
//            //TODO 进行os pc端的权限判断
//        }else if ("os-wx".equals(channel)){
//            //TODO 进行os的小程序的权限判断
//        }else {
//            ctx.setSendZuulResponse(false);//不再进行转发
//            ctx.setResponseStatusCode(HttpStatus.FORBIDDEN.value());//提示403禁止访问。
//            return null;
//        }
        //自定义修改参数，把当前登陆的用户ID传过去
//        Map<String,List<String>> queryParams = HTTPRequestUtils.getInstance().getQueryParams();
//        if (queryParams == null ){
//            queryParams = new HashMap<>();
//        }
//
//        ArrayList<String> ids = new ArrayList<>();
//        ids.add(String.valueOf(UserUtil.currentUserId()));
//        queryParams.put("currentUserId", ids);
//        ctx.setRequestQueryParams(queryParams);
        return null;
    }
}
