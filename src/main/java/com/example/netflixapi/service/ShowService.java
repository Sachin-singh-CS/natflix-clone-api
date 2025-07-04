package com.example.netflixapi.service;

import com.example.netflixapi.model.Show;
import com.example.netflixapi.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShowService {

    private final ShowRepository showRepository;

    public ShowService(ShowRepository showRepository) {
        this.showRepository = showRepository;
    }

    public List<Show> getAllShows() {
        return showRepository.findAll();
    }

    public Optional<Show> getShowById(Long id) {
        return showRepository.findById(id);
    }

    public Show createShow(Show show) {
        return showRepository.save(show);
    }

    public void deleteShow(Long id) {
        showRepository.deleteById(id);
    }

    public List<Show> searchByGenre(String genre) {
        return showRepository.findByGenre(genre);
    }

    public List<Show> searchByTitle(String title) {
        return showRepository.findByTitleContainingIgnoreCase(title);
    }
}
