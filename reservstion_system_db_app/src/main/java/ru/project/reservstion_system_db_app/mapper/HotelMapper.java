package ru.project.reservstion_system_db_app.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import ru.project.reservstion_system_db_app.dto.HotelRequest;
import ru.project.reservstion_system_db_app.dto.HotelResponse;
import ru.project.reservstion_system_db_app.entity.Hotel;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HotelMapper {

    Hotel mappingHotelRequestToHotel(HotelRequest hotelRequest);

    List<HotelResponse> mappingHotelListToHotelResponseList(List<Hotel> hotelList);

    HotelResponse mappingHotelToHotelRequest(Hotel hotel);
    void updateHotelByHotelRequest(@MappingTarget Hotel hotel, HotelRequest hotelRequest);
}
