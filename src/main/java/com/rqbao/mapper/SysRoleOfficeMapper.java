package com.rqbao.mapper;

import com.rqbao.entity.SysRoleOfficeExample;
import com.rqbao.entity.SysRoleOfficeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleOfficeMapper {
    int countByExample(SysRoleOfficeExample example);

    int deleteByExample(SysRoleOfficeExample example);

    int deleteByPrimaryKey(SysRoleOfficeKey key);

    int insert(SysRoleOfficeKey record);

    int insertSelective(SysRoleOfficeKey record);

    List<SysRoleOfficeKey> selectByExample(SysRoleOfficeExample example);

    int updateByExampleSelective(@Param("record") SysRoleOfficeKey record, @Param("example") SysRoleOfficeExample example);

    int updateByExample(@Param("record") SysRoleOfficeKey record, @Param("example") SysRoleOfficeExample example);
}