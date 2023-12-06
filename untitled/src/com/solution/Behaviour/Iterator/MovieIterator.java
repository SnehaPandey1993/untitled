package com.solution.Behaviour.Iterator;

import java.util.List;

public class MovieIterator implements Iterator{
    private List<Movies> movies;
    private  int index=0;

    public MovieIterator(List<Movies> movies) {
        this.movies = movies;
        this.index = index;
    }

    @Override
    public boolean hasNext() {
        return index< movies.size();
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return movies.get(index++);
        }
        return null;
    }
}
