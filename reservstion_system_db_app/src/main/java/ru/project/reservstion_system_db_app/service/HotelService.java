package ru.project.reservstion_system_db_app.service;

import ru.project.reservstion_system_db_app.dto.HotelRequest;
import ru.project.reservstion_system_db_app.dto.HotelResponse;
import ru.project.reservstion_system_db_app.entity.Hotel;

import java.util.List;

public interface HotelService {
    List<HotelResponse> getAllHotels();
    List<HotelResponse> getAllHotelsByParam(HotelRequest hotelRequest);
    Hotel createHotel(HotelRequest hotelRequest);
    Hotel updateHotel(HotelRequest hotelRequest);
    void deleteHotel(HotelRequest hotelRequest);

}
