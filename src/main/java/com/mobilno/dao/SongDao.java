package com.mobilno.dao;

import com.mobilno.domain.Song;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongDao extends CrudRepository<Song, Integer> {

}
