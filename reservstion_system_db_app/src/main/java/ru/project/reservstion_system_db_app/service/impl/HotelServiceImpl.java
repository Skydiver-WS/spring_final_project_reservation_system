package ru.project.reservstion_system_db_app.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.project.reservstion_system_db_app.dto.HotelRequest;
import ru.project.reservstion_system_db_app.dto.HotelResponse;
import ru.project.reservstion_system_db_app.entity.Hotel;
import ru.project.reservstion_system_db_app.mapper.HotelMapper;
import ru.project.reservstion_system_db_app.repository.HotelRepository;
import ru.project.reservstion_system_db_app.service.HotelService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class HotelServiceImpl implements HotelService {

    private final HotelRepository hotelRepository;
    private final HotelMapper hotelMapper;

    @Override
    @SneakyThrows
    public List<HotelResponse> getAllHotels() {
        log.info("Get all hotels");
        return hotelMapper.mappingHotelListToHotelResponseList(hotelRepository.findAll());
    }

    @Override
    @SneakyThrows
    public List<HotelResponse>  getAllHotelsByParam(HotelRequest hotelRequest) {
        log.info("Get all hotels by request");

        return null;
    }

    @Override
    @SneakyThrows
    public Hotel createHotel(HotelRequest hotelRequest) {
        log.info("Create hotel");
        return hotelRepository.save(hotelMapper.mappingHotelRequestToHotel(hotelRequest));
    }

    @Override
    public Hotel updateHotel(HotelRequest hotelRequest) {
        log.info("Update hotel");
        Optional<Hotel> hotel = hotelRepository.findById(hotelRequest.getId());
        if (hotel.isEmpty()){
            return  null;
        }
        hotelMapper.updateHotelByHotelRequest(hotel.get(), hotelRequest);
        return hotelRepository.save(hotel.get());
    }

    @Override
    public void deleteHotel(HotelRequest hotelRequest) {
        log.info("Delete hotel");
        hotelRepository.deleteById(hotelRequest.getId());

    }
}
