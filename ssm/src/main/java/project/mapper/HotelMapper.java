package project.mapper;

import org.apache.ibatis.annotations.Mapper;
import project.entity.Hotel;

@Mapper
public interface HotelMapper {

    Hotel selectByCityId(int cityId);

}