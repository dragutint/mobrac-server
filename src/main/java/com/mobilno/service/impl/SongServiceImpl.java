package com.mobilno.service.impl;

import com.mobilno.dao.ArtistDao;
import com.mobilno.dao.SongDao;
import com.mobilno.domain.Song;
import com.mobilno.service.SongService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Log4j2
@Service
public class SongServiceImpl implements SongService {

    @Autowired
    private SongDao songDao;
    @Autowired
    private ArtistDao artistDao;

    @Override
    public Optional<Song> get(Integer id) {
        return songDao.findById(id);
    }

    @Override
    public Iterable<Song> findAll() {
        return songDao.findAll();
    }

    @Override
    public Song update(Song song, Integer id) {
        song.setId(id);
        Song actualSong = get(id).get();
        song.setArtist(actualSong.getArtist());
        return songDao.save(song);
    }

    @Override
    public void delete(Integer id) {
        songDao.deleteById(id);
    }

    @Override
    public Song insert(Song song) {
        return songDao.save(song);
    }
}
