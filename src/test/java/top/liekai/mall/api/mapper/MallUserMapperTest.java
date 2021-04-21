package top.liekai.mall.api.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.liekai.mall.api.entity.MallUser;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MallUserMapperTest {
    @Resource
    private  MallUserMapper mallUserMapper;

    @Test
    void selectAll() {
        List<MallUser> mallUsers = mallUserMapper.selectAll();
        System.out.println(mallUsers);
    }

}