package com.bosch.nfc.mapper;

import com.bosch.nfc.pojo.Tag;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TagMapper {
    @Select("select * from tag where rq = #{rq}")
    List<Tag> selectTagByRq(@Param("rq") String rq);

    @Update("update tag set count = count+1 where rq = #{rq}")
    Integer updateTagCount(@Param("rq") String rq);

    @Insert("insert into tag values(#{rq}, 1)")
    Integer insertTagRqAndCount(@Param("rq") String rq);

    @Select("select * from tag limit #{limit}, 7")
    List<Tag> selectTagCountByWeek(@Param("limit") Integer limit);
}
