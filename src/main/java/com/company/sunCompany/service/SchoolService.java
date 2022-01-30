package com.company.sunCompany.service;

import com.company.sunCompany.dao.SchoolDao;
import com.company.sunCompany.dto.SchoolDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolDao schoolDao;

    public List<SchoolDto> getSchoolList(){
        return schoolDao.getSchoolList();
    }

}
