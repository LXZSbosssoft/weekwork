package cn.test.dao;

import cn.test.entity.Myuser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MyuserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Myuser record);

    int insertSelective(Myuser record);

    Myuser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Myuser record);

    int updateByPrimaryKey(Myuser record);

    Myuser findByUsername(String username );

    List<Myuser> findAllUser();
}