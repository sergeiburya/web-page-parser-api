package com.example.webpageparserapi.service;

import com.example.webpageparserapi.model.MovieCharacter;

import java.util.List;

public interface MovieCharacterService {
    void syncExternalCharacters();

    MovieCharacter getRandomCharacter();

    List<MovieCharacter> findAllByNameContains(String namePart);
}
