package com.mobilno.service;

import com.mobilno.domain.Song;

import java.util.Optional;

public interface SongService {
    Optional<Song> get(Integer id);

    Iterable<Song> findAll();

    Song update(Song song, Integer id);

    void delete(Integer id);
}
