package com.mobilno.service;

import com.mobilno.domain.Artist;

import java.util.Optional;

public interface ArtistService {
    Optional<Artist> get(Integer id);

    Iterable<Artist> findAll();

    Artist update(Artist artist, Integer id);

    void delete(Integer id);

    Artist insert(Artist artist);
}
