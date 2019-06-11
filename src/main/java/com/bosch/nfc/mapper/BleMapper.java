package com.bosch.nfc.mapper;

import com.bosch.nfc.pojo.Ble;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BleMapper {
    @Select("select * from ble where rq = #{rq}")
    List<Ble> selectBleByRq(@Param("rq") String rq);

    @Update("update ble set count = count+1 where rq = #{rq}")
    Integer updateBleCount(@Param("rq") String rq);

    @Insert("insert into ble values(#{rq}, 1)")
    Integer insertBleRqAndCount(@Param("rq") String rq);

    @Select("select * from ble limit #{limit}, 7")
    List<Ble> selectBleCountByWeek(@Param("limit") Integer limit);
}
