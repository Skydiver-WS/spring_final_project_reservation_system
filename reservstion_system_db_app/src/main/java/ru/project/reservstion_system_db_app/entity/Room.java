package ru.project.reservstion_system_db_app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import ru.project.reservstion_system_db_app.dto.ClassRoom;
import ru.project.reservstion_system_db_app.dto.Status;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Room {
    @Id
    private Long numberApart;

    private String description;

    private String photo;

    private Status status;

    private ClassRoom classRoom;

}
