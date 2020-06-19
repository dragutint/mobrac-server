package com.mobilno.web;

import com.mobilno.domain.Artist;
import com.mobilno.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/artists")
public class ArtistController {
    @Autowired
    private ArtistService artistService;

    @GetMapping("/{id}")
    public Optional<Artist> getArtist(@PathVariable Integer id){
        return artistService.get(id);
    }

    @GetMapping("")
    public Iterable<Artist> findArtists(){
        return artistService.findAll();
    }

    @PostMapping("/insert")
    public Artist insertArtist(@RequestBody Artist song){
        return artistService.insert(song);
    }

    @PutMapping("/{id}")
    public Artist updateArtist(@RequestBody Artist artist, @PathVariable Integer id){
        return artistService.update(artist, id);
    }

    @DeleteMapping("/{id}")
    public void deleteArtist(@PathVariable Integer id){
        artistService.delete(id);
    }
}
