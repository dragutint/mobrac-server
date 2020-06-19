package com.mobilno.service.impl;

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

    @Override
    public Optional<Song> get(Integer id) {
        return songDao.findById(id);
    }
}
