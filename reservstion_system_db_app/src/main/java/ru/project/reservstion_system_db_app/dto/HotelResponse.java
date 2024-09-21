package ru.project.reservstion_system_db_app.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import ru.project.reservstion_system_db_app.entity.City;

import java.util.List;

@Getter
@Setter
@Builder
public class HotelResponse {
    private String name;
    private String description;
    private String address;
    private Double distance;
    private String rating;
    private Integer freeApart;
    private Integer countApart;

    private List<City> cityList;
}
