package ru.project.reservstion_system_db_app.dto;

import lombok.*;
import ru.project.reservstion_system_db_app.entity.City;

import java.util.List;

@Getter
@Setter
@Builder
public class HotelRequest {

    private Long id;
    private String name;
    private String description;
    private String address;
    private Double distance;
    private List<City> cityList;
}
