package com.hmdp.utils;


import com.hmdp.dto.UserDTO;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * ProjectName: hm-dianping
 * Package: com.hmdp.utils
 * ClassName: LoginInterceptor
 *
 * @Author 姚昭丞
 * @Create 2025/8/5 下午4:42
 * @Version 1.0
 * Description:
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HttpSession session = request.getSession();

        Object user = session.getAttribute("user");

        if (user == null) {
            response.setStatus(401);
            return false;
        }

        UserHolder.saveUser((UserDTO) user);

        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        UserHolder.removeUser();
    }
}
