package com.example.webpageparserapi.dto;

import com.example.webpageparserapi.model.Gender;
import com.example.webpageparserapi.model.Status;
import lombok.Data;

@Data
public class CharacterResponseDto {
    private Long id;
    private Long externalId;
    private String name;
    private Status status;
    private Gender gender;
}
