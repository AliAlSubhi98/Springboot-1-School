package com.alialsubhi.demoProject1.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
public class School extends BaseEntity{


    @Id // persistence
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "school_name")
    String name;
}
