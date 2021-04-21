package top.liekai.mall.api.mapper;

import top.liekai.mall.api.entity.MallUser;

import java.util.List;

/**
 * @Entity top.liekai.mall.api.entity.MallUserVO
 */
public interface MallUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MallUser record);

    int insertSelective(MallUser record);

    MallUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallUser record);

    int updateByPrimaryKey(MallUser record);

    List<MallUser> selectAll();
}




