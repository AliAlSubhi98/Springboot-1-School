package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.School;
import com.alialsubhi.demoProject1.Repositories.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    @Autowired
    SchoolRepository schoolRepository; // reference not an object.

    public List<School> getListSchools(){
        return schoolRepository.findAll();
    }
}
