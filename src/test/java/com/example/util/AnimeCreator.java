package com.example.util;


import com.example.domain.Anime;

public class AnimeCreator {

    public static Anime createAnimeToBeSaved() {
        return Anime.builder()
            .name("Rafsan the chotovai")
            .build();
    }

    public static Anime createValidAnime() {
        return Anime.builder()
            .id(1)
            .name("Rafsan the chotovai")
            .build();
    }

    public static Anime createdValidUpdatedAnime() {
        return Anime.builder()
            .id(1)
            .name("Rafsan the chotovai")
            .build();
    }
}