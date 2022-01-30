package com.company.sunCompany.dao;

import com.company.sunCompany.dto.SchoolDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SchoolDao {

    List<SchoolDto> getSchoolList();

}
