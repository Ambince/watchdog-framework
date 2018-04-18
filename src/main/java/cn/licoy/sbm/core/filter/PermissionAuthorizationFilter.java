package cn.licoy.sbm.core.filter;

import cn.licoy.sbm.common.bean.RequestResult;
import cn.licoy.sbm.common.bean.StatusEnum;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Licoy
 * @version 2018/4/18/16:15
 */
@Slf4j
public class PermissionAuthorizationFilter extends AccessControlFilter {

    @Override
    protected boolean isAccessAllowed(ServletRequest servletRequest, ServletResponse servletResponse, Object mappedValue) throws Exception {
        log.info("PermissionAuthorizationFilter执行");
        Subject subject = getSubject(servletRequest, servletResponse);
        if(null != mappedValue){
            String[] arra = (String[])mappedValue;
            for (String permission : arra) {
                if(subject.isPermitted(permission)){
                    System.out.println("有权限");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws IOException {
        Subject subject = getSubject(request, response);
        System.out.println(SecurityUtils.getSubject().getPrincipal());
        if (null == subject.getPrincipal()) {//表示没有登录，重定向到登录页面
            saveRequest(request);
            HttpServletResponse res = WebUtils.toHttp(response);
            res.setHeader("Content-Type", "application/json;charset=utf-8");
            res.getWriter().write(JSON.toJSONString(RequestResult.e(StatusEnum.NOT_SING_IN)));
            return false;
        }
        return true;
    }
}