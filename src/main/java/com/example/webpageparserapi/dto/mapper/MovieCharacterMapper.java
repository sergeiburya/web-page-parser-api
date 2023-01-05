package com.example.webpageparserapi.dto.mapper;

import com.example.webpageparserapi.dto.CharacterResponseDto;
import com.example.webpageparserapi.dto.external.ApiCharacterDto;
import com.example.webpageparserapi.model.Gender;
import com.example.webpageparserapi.model.MovieCharacter;
import com.example.webpageparserapi.model.Status;
import org.springframework.stereotype.Component;

@Component
public class MovieCharacterMapper {

    public MovieCharacter parseApiCharacterResponseDto(ApiCharacterDto apiCharacterDto) {
        MovieCharacter movieCharacter = new MovieCharacter();
        movieCharacter.setName(apiCharacterDto.getName());
        movieCharacter.setStatus(Status.valueOf(apiCharacterDto.getStatus().toUpperCase()));
        movieCharacter.setGender(Gender.valueOf(apiCharacterDto.getGender().toUpperCase()));
        movieCharacter.setExternalId(apiCharacterDto.getId());
        return movieCharacter;
    }

    public CharacterResponseDto toResponseDto(MovieCharacter movieCharacter) {
        CharacterResponseDto dto = new CharacterResponseDto();
        dto.setId(movieCharacter.getId());
        dto.setExternalId(movieCharacter.getExternalId());
        dto.setName(movieCharacter.getName());
        dto.setStatus(movieCharacter.getStatus());
        dto.setGender(movieCharacter.getGender());
        return dto;
    }
}
