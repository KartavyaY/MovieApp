package org.ncu.MovieApp.Service;

import org.ncu.MovieApp.Model.Movie;
import org.ncu.MovieApp.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    MovieRepository repo;

    public void setMovie(Movie movie){
        repo.save(movie);
    }

    public Movie getMovieById(int movieId) {
        return repo.findById(movieId).orElse(new Movie());
    }

    public List<Movie> getMoviesAll() {
        return repo.findAll();
    }

    public void deleteMovieById(int Id){
        repo.deleteById(Id);
    }

}
