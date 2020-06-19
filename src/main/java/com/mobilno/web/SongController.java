package com.mobilno.web;

import com.mobilno.domain.Song;
import com.mobilno.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/song")
public class SongController {
    @Autowired
    private SongService songService;

    @GetMapping("/{id}")
    public Optional<Song> getSong(@PathVariable Integer id){
        return songService.get(id);
    }
}
