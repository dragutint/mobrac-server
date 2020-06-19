package com.mobilno.dao;

import com.mobilno.domain.Artist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistDao extends CrudRepository<Artist, Integer> {

}
