package com.example.netflixapi.ShowRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.netflixapi.model.Show;

public interface ShowRepository extends JpaRepository<Show, Long> {
    List<Show> findByGenre(String genre);
    List<Show> findByTitleContainingIgnoreCase(String title);
}
