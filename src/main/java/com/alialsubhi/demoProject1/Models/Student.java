package com.alialsubhi.demoProject1.Models;


import javax.persistence.*;

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "student_name")
    String name;

    Integer age;

    @ManyToOne // many student one school
    @JoinColumn(name = "school_id" , referencedColumnName = "id")
    School school;

}
