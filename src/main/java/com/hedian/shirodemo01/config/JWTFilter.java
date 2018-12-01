package com.hedian.shirodemo01.config;

import org.apache.shiro.web.filter.authc.AuthenticationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 和电科技 on 2018/11/29 9:59
 */
public class JWTFilter extends AuthenticationFilter {
    @Override
    protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        if (httpServletRequest.getHeader("Authorization") != null) {
            return true;
        }
        if (NotVerify(httpServletRequest)) {
            return true;
        }
        return super.preHandle(request, response);
    }

    private boolean NotVerify(HttpServletRequest httpServletRequest) {
        String requestURI = httpServletRequest.getRequestURI();
        if (requestURI.equals("/login")) {
            return true;
        }
        return false;
    }

    @Override
    protected boolean onAccessDenied(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
        return false;
    }
}
