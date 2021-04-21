package top.liekai.mall.api.controller.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author admin
 * @date 2021/4/21
 * @description 用户VO类
 */
@Data
public class MallUserVO implements Serializable {
    @ApiModelProperty("用户昵称")
    private String nickName;
    @ApiModelProperty("用户登录名")
    private String loginName;
    @ApiModelProperty("个性签名")
    private String introduceSign;
}