package top.liekai.mall.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import top.liekai.mall.api.common.Constants;
import top.liekai.mall.api.config.handler.TokenToMallUserMethodArgumentResolver;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author admin
 * @date 2021/4/21
 * @description WebMvc配置
 */
@Configuration
public class MallWebMvcConfigurer implements WebMvcConfigurer {
    @Resource
    private TokenToMallUserMethodArgumentResolver tokenToMallUserMethodArgumentResolver;

    /**
     * TokenToMallUser 注解处理方法     *     * @param argumentResolvers 参数解析器
     */
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(tokenToMallUserMethodArgumentResolver);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/upload/**").addResourceLocations("file:" + Constants.FILE_UPLOAD_DIC);
        registry.addResourceHandler("/goods-img/**").addResourceLocations("file:" + Constants.FILE_UPLOAD_DIC);
    }
}