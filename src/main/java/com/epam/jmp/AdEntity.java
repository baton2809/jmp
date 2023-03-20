package com.epam.jmp;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Table(name = "ads")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AdEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private Double price;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp creationDate;
}