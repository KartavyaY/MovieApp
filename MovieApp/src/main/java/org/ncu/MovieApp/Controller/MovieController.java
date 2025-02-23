package org.ncu.MovieApp.Controller;

import org.ncu.MovieApp.Model.Movie;
import org.ncu.MovieApp.Service.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieServiceImpl movieService;

    @GetMapping("/get/{Id}")
    public Movie getMovie(@PathVariable int Id){
        return movieService.getMovieById(Id);
    }
    @GetMapping("/get")
    public List<Movie> getMovies(){
        return movieService.getMoviesAll();
    }
    @PostMapping("/add")
    public void addMovie(@RequestBody Movie movie){
        movieService.setMovie(movie);
    }
    @PostMapping("/batch")
    public void batchAddMovie(@RequestBody List<Movie> movies){
        movieService.batchSetMovie(movies);
    }
    @DeleteMapping("/delete/{Id}")
    public void deleteMovie(@PathVariable int Id){
        movieService.deleteMovieById(Id);
    }

}
