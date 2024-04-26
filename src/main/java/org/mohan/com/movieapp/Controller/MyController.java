package org.mohan.com.movieapp.Controller;

import org.mohan.com.movieapp.service.Movies;
import org.mohan.com.movieapp.implementation.MoviesImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    MoviesImpl movieImp = new MoviesImpl();

    @GetMapping("/home")
       public List<Movies> getMovie(){
           return movieImp.getMovie();
       }
    @PostMapping("/home")
    public void setMovieImp(@RequestBody Movies movie){
        movieImp.addMovie(movie);
    }

    @PutMapping("/home/{id}/{name}")
    public String updateMovieName(@PathVariable ("id") int id,@PathVariable("name") String name){
        if(movieImp.updateMovieName(id,name)){
           return "Successfully updated Movie name";
        }
        else{
            return "movie not found";
        }
    }
    @PutMapping("/home/{id}")
    public String updateMovie(@PathVariable ("id") int id,@RequestBody Movies movie){
        if(movieImp.updateMovie(id,movie)){
            return "Successfully updated movie details";
        }
        else{
            return "movie not found";
        }
    }
    @DeleteMapping("home/{id}")
    public String deleteMovie(@PathVariable ("id") int id){
        if(movieImp.deleteMovie(id)){
            return "Successfully movie deleted";
        }else {
            return "Movie not found";
        }
    }







}
