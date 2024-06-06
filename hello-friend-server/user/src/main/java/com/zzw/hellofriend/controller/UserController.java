package com.zzw.hellofriend.controller;

import com.zzw.hellofriend.dto.ret.R;
import com.zzw.hellofriend.dto.user.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequestMapping("/user")
@RestController
public class UserController {

    @GetMapping("list")
    public R<List<UserDto>> getUserDto(@RequestParam(name = "userName",required = true) String userName) {
        log.info("通过用户名查询用户列表，查询条件：{}",userName);
        return R.success(null);
    }
}
