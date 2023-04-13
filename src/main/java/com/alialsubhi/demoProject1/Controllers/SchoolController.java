package com.alialsubhi.demoProject1.Controllers;

import com.alialsubhi.demoProject1.Models.School;
import com.alialsubhi.demoProject1.Services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value = "school")
public class SchoolController {
    @Autowired
    SchoolService schoolService;

    // http://localhost:8080/school/getAll
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<School> getListSchools(){
        return schoolService.getListSchools();
    }
}
