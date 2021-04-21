package top.liekai.mall.api.controller.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author admin
 * @date 2021/4/21
 * @description 首页商品详情VO类
 */
@Data
public class MallGoodsDetailVO implements Serializable {
    @ApiModelProperty("商品id")
    private Long goodsId;
    @ApiModelProperty("商品名称")
    private String goodsName;
    @ApiModelProperty("商品简介")
    private String goodsIntro;
    @ApiModelProperty("商品图片地址")
    private String goodsCoverImg;
    @ApiModelProperty("商品价格")
    private Integer sellingPrice;
    @ApiModelProperty("商品标签")
    private String tag;
    @ApiModelProperty("商品图片")
    private String[] goodsCarouselList;
    @ApiModelProperty("商品原价")
    private Integer originalPrice;
    @ApiModelProperty("商品详情字段")
    private String goodsDetailContent;
}