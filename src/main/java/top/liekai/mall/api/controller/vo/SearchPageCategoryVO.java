package top.liekai.mall.api.controller.vo;

import lombok.Data;
import top.liekai.mall.api.entity.MallGoodsCategory;

import java.io.Serializable;
import java.util.List;

/**
 * @author admin
 * @date 2021/4/21
 * @description 搜索页面分类VO
 */
@Data
public class SearchPageCategoryVO implements Serializable {
    private String firstLevelCategoryName;
    private List<MallGoodsCategory> secondLevelCategoryList;
    private String secondLevelCategoryName;
    private List<MallGoodsCategory> thirdLevelCategoryList;
    private String currentCategoryName;
}