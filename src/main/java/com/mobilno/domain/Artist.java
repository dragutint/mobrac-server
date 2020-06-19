package com.mobilno.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "artist")
public class Artist implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @JsonProperty("_id")
    private Integer id;

    @Column(name = "name")
    @JsonProperty("name")
    private String name;

    @Column(name = "country")
    @JsonProperty("country")
    private String country;

    @Column(name = "birth_date")
    @JsonProperty("birth_date")
    private LocalDate birthDate;

    @JsonIgnore
    @OneToMany(mappedBy="artist", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("artist")
    private Set<Song> songs = new HashSet<>();
}
