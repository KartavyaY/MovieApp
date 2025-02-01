package org.ncu.MovieApp.Service;

import org.ncu.MovieApp.Model.Movie;

import java.util.List;

public interface MovieService {

    public void setMovie(Movie movie);
    public Movie getMovieById(int Id);
    public List<Movie> getMoviesAll();
    public void deleteMovieById(int Id);
}
