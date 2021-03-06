package com.hedian.shirodemo01.web;


import com.hedian.shirodemo01.entity.ResultMap;
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
@RequestMapping("/guest")
public class GuestController {

    @RequestMapping(value = "/getMessage", method = RequestMethod.GET)
    public ResultMap getMessage() {
        return new ResultMap().success().message("您拥有用户权限，可以获得该接口的信息！");
    }
}
