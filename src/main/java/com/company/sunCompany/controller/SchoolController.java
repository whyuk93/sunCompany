package com.company.sunCompany.controller;

import com.company.sunCompany.dto.SchoolDto;
import com.company.sunCompany.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class SchoolController {

    private final SchoolService schoolService;

    @GetMapping("/school")
    public String schoolList(Model model){

        List<SchoolDto> schoolList = schoolService.getSchoolList();
        System.out.println(schoolList);

        model.addAttribute("schoolList",schoolList);
        return "school";
    }
}
