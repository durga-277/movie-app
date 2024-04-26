package org.mohan.com.movieapp.implementation;
import org.mohan.com.movieapp.service.Movies;
import java.util.ArrayList;
import java.util.List;

public class MoviesImpl implements moviesFun{

    List<Movies> movies = new ArrayList<>();
    private long movieId = 1L;

    @Override
    public List<Movies> getMovie() {
        return movies;
    }

    @Override
    public void addMovie(Movies movie) {
        movie.setId((int)movieId++);
        movies.add(movie);
    }

    @Override
    public boolean updateMovie(int id, Movies movie) {
        for(Movies movies1 : movies){
            if(movies1.getId() == id ){
                movies1.setName(movie.getName());
                movies1.setRating(movie.getRating());
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean updateMovieName(int id, String name) {
        for(Movies movies1 : movies) {
            if (movies1.getId() == id) {
                movies1.setName(name);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteMovie(int id) {
        for(Movies movies1 : movies){
            if(movies1.getId() == id){
                movies.remove(movies1);
                return true;
            }
        }
        return false;
    }


}
