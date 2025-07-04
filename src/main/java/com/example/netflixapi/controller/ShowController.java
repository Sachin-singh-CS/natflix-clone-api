package com.example.netflixapi.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.netflixapi.model.Show;
import com.example.netflixapi.service.ShowService;

@RestController
@RequestMapping("/api/shows")
public class ShowController {

    private final ShowService showService;

    public ShowController(ShowService showService) {
        this.showService = showService;
    }

    @GetMapping
    public List<Show> getAllShows() {
        return showService.getAllShows();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Show> getShowById(@PathVariable Long id) {
        return showService.getShowById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Show createShow(@RequestBody Show show) {
        return showService.createShow(show);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteShow(@PathVariable Long id) {
        showService.deleteShow(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/search")
    public List<Show> searchShows(@RequestParam(required = false) String genre,
                                  @RequestParam(required = false) String title) {
        if (genre != null) {
            return showService.searchByGenre(genre);
        } else if (title != null) {
            return showService.searchByTitle(title);
        } else {
            return showService.getAllShows();
        }
    }
}
