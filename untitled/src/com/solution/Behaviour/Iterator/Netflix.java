package com.solution.Behaviour.Iterator;

import java.util.List;

public class Netflix {
    private List<Movies> movies;

    public Netflix(List<Movies> movies) {
        this.movies = movies;
    }

    public Iterator createIterator(){
       return new MovieIterator(movies);
    }
}
