package top.liekai.mall.api.controller.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author admin
 * @date 2021/4/21
 * @description 首页轮播图VO类
 */
@Data
public class MallIndexCarouselVO {
    @ApiModelProperty("轮播图图片地址")
    private String carouselUrl;
    @ApiModelProperty("轮播图点击后的跳转路径")
    private String redirectUrl;
}