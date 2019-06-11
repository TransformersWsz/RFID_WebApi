package com.bosch.nfc.mapper;

import com.bosch.nfc.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> findAll();

    @Select("select * from user where date = #{date}")
    List<User> testDate(@Param("date") String date);
}
