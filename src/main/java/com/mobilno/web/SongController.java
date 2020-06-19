package com.mobilno.web;

import com.mobilno.domain.Song;
import com.mobilno.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/songs"    )
public class SongController {
    @Autowired
    private SongService songService;

    @GetMapping("/{id}")
    public Optional<Song> getSong(@PathVariable Integer id){
        return songService.get(id);
    }

    @GetMapping("")
    public Iterable<Song> findSongs(){
        return songService.findAll();
    }

    @PostMapping("/insert")
    public Song insertSong(@RequestBody Song song){
        return songService.insert(song);
    }

    @PutMapping("/{id}")
    public Song updateSong(@RequestBody Song song, @PathVariable Integer id){
        return songService.update(song, id);
    }

    @DeleteMapping("/{id}")
    public void deleteSong(@PathVariable Integer id){
        songService.delete(id);
    }
}
