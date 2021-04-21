package top.liekai.mall.api.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.liekai.mall.api.controller.param.MallUserUpdateParam;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class MallUserServiceTest {
    @Resource
    private MallUserService mallUserService;

    @Test
    void register() {
        String register = mallUserService.register("110120111", "102331");
        log.info(register);
        assertEquals("success", register);
    }

    @Test
    void login() {
        String login = mallUserService.login("13218572781", "102331");
        //返回了登录用户的token，会在tb_mall_user_token表生成一条token记录
        log.info(login);
    }

    @Test
    void updateUserInfo() {
        //修改10号用户信息,可修改的字段为MallUserUpdateParam的属性
        MallUserUpdateParam mup = new MallUserUpdateParam();
        mup.setNickName("。。。。");
        mup.setPasswordMd5("e10adc3949ba59abbe56e057f20f883e");
        mup.setIntroduceSign("百鬼夜行");
        Boolean result = mallUserService.updateUserInfo(mup, 10L);
        log.info(result.toString());
        assertTrue(result);
    }

    @Test
    void logout() {
        //会在tb_mall_user_token表中删掉10号用户的一条token数据
        Boolean logout = mallUserService.logout(10L );
        log.info(logout.toString());
        assertTrue(logout);
    }
}