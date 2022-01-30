package com.company.sunCompany.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.websocket.server.ServerEndpoint;

@Getter
@Setter
@ToString
public class SchoolDto {

    private String name;

    private int age;
}
