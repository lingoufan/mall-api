package top.liekai.mall.api.controller.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author admin
 * @date 2021/4/21
 * @description 修改购物项Param
 */
@Data
public class UpdateCartItemParam implements Serializable {
    @ApiModelProperty("购物项id")
    private Long cartItemId;
    @ApiModelProperty("商品数量")
    private Integer goodsCount;
}