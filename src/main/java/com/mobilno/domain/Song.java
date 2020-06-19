package com.mobilno.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "songs")
public class Song implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @JsonProperty("_id")
    private Integer id;

    @Column(name = "name")
    @JsonProperty("name")
    private String name;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    @Column(name = "release_date")
    @JsonProperty("release_date")
    private LocalDate releaseDate;

    @Column(name = "album_name")
    @JsonProperty("album_name")
    private String albumName;

    @Column(name = "lyrics")
    @JsonProperty("lyrics")
    private String lyrics;

    @ManyToOne
    @JsonProperty("artist")
    @JoinColumn(name = "artist_id")
    private Artist artist;

}
