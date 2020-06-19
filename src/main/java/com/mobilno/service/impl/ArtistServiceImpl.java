package com.mobilno.service.impl;

import com.mobilno.dao.ArtistDao;
import com.mobilno.domain.Artist;
import com.mobilno.service.ArtistService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Log4j2
@Service
public class ArtistServiceImpl implements ArtistService {

    @Autowired
    private ArtistDao artistDao;

    @Override
    public Optional<Artist> get(Integer id) {
        return artistDao.findById(id);
    }

    @Override
    public Iterable<Artist> findAll() {
        return artistDao.findAll();
    }

    @Override
    public Artist update(Artist artist, Integer id) {
        artist.setId(id);
        return artistDao.save(artist);
    }

    @Override
    public void delete(Integer id) {
        artistDao.deleteById(id);
    }

    @Override
    public Artist insert(Artist artist) {
        return artistDao.save(artist);
    }
}
