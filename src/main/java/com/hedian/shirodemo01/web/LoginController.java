package com.hedian.shirodemo01.web;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.hedian.shirodemo01.entity.ResultMap;
import com.hedian.shirodemo01.entity.User;
import com.hedian.shirodemo01.service.IUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Yanghu
 * @since 2018-11-24
 */
@RestController
public class LoginController {

    private IUserService iUserService;

    @RequestMapping(value = "/notLogin", method = RequestMethod.GET)
    public ResultMap notLogin() {
        return new ResultMap().success().message("您尚未登陆！");
    }

    @RequestMapping(value = "/notRole", method = RequestMethod.GET)
    public ResultMap notRole() {
        return new ResultMap().success().message("您没有权限！");
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public ResultMap logout() {
        Subject subject = SecurityUtils.getSubject();
        //注销
        subject.logout();
        return new ResultMap().success().message("成功注销！");
    }

    /**
     * 登陆
     *
     * @param username 用户名
     * @param password 密码
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResultMap login(String username, String password) {
        // 从SecurityUtils里边创建一个 subject
        Subject subject = SecurityUtils.getSubject();
        // 在认证提交前准备 token（令牌）
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        // 执行认证登陆
        subject.login(token);
        //根据权限，指定返回数据
        User user = iUserService.selectOne(new EntityWrapper<User>().eq("usernmae", username));
        String role = user.getRole();
        if ("user".equals(role)) {
            return new ResultMap().success().message("欢迎登陆");
        }
        if ("admin".equals(role)) {
            return new ResultMap().success().message("欢迎来到管理员页面");
        }
        return new ResultMap().success().message("权限错误！");
    }

}
