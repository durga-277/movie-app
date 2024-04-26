package org.mohan.com.movieapp.implementation;

import org.mohan.com.movieapp.service.Movies;

import java.util.List;

public interface moviesFun {

    List<Movies> getMovie();

    void addMovie(Movies movie);

    boolean updateMovie(int id,Movies movies);

    boolean updateMovieName(int id, String name);

    boolean deleteMovie(int id);
}
