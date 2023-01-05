package com.example.webpageparserapi.dto.external;

import lombok.Data;

@Data
public class ApiInfoDto {
    private int count;
    private int page;
    private String next;
    private String prev;
}
