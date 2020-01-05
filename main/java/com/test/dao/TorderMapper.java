package com.test.dao;

import com.test.pojo.Torder;
import com.test.pojo.TorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TorderMapper {
    long countByExample(TorderExample example);

    int deleteByExample(TorderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Torder record);

    int insertSelective(Torder record);

    List<Torder> selectByExample(TorderExample example);

    Torder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Torder record, @Param("example") TorderExample example);

    int updateByExample(@Param("record") Torder record, @Param("example") TorderExample example);

    int updateByPrimaryKeySelective(Torder record);

    int updateByPrimaryKey(Torder record);
}