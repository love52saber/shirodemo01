package com.hedian.shirodemo01.config;

import com.hedian.shirodemo01.entity.ResultMap;
import org.apache.shiro.authc.AccountException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by 和电科技 on 2018/11/26 16:06
 */
@RestControllerAdvice(basePackages = "com.hedian.shirodemo01.web")
public class ExceptionController {

    // 捕捉 CustomRealm 抛出的异常
    @ExceptionHandler(AccountException.class)
    public ResultMap handleShiroException(Exception ex) {
        return new ResultMap().success().message(ex.getMessage());
    }

}
