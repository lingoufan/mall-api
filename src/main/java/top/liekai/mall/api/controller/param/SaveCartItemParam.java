package top.liekai.mall.api.controller.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author admin
 * @date 2021/4/21
 * @description 添加购物项Param
 */
@Data
public class SaveCartItemParam implements Serializable {
    @ApiModelProperty("商品数量")
    private Integer goodsCount;
    @ApiModelProperty("商品id")
    private Long goodsId;
}