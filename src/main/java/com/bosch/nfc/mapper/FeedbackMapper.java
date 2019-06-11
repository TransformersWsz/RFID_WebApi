package com.bosch.nfc.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FeedbackMapper {
    @Insert("insert into feedback values(#{rq}, #{comment})")
    Integer insertFeedbackRqAndComment(@Param("rq") String rq, @Param("comment") String comment);
}
