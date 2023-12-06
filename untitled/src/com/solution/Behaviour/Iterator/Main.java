package com.solution.Behaviour.Iterator;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Main {
    public static void main(String args[]){
        ArrayList ae= new ArrayList();
        Collection col=new HashSet<>();
       // Iterator itr=ae.iterator();

        List<Movies> mov=Arrays.asList(new Movies(10,"Kabhi Ha Kabhi Na"),
                                       new Movies(20,"Kabhi Khushi Kabhi Gum"),
                                       new Movies(30,"Waqt"));
        Netflix net = new Netflix(mov);
        Iterator itr= net.createIterator();
        while (itr.hasNext()){
            Movies movies = (Movies) itr.next();
            System.out.println("select the movie::::"+movies.moviename+":::price::::;"+movies.price);
        }

//https://gitlab.com/snehalathap/interview-prep
    }
}
