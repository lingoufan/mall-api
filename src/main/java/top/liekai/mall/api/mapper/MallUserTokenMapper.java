package top.liekai.mall.api.mapper;

import top.liekai.mall.api.entity.MallUserToken;

/**
 * @author admin
 * @Entity top.liekai.mall.api.entity.MallUserToken
 */
public interface MallUserTokenMapper {

    int deleteByPrimaryKey(Long id);

    int insert(MallUserToken record);

    int insertSelective(MallUserToken record);

    MallUserToken selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallUserToken record);

    int updateByPrimaryKey(MallUserToken record);

    MallUserToken selectByToken(String token);
}




