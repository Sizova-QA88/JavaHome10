package ru.netology.domain;

import ru.netology.Movie;

public class PosterManager {
    private Movie[] posters = new Movie[0];
    private int limitFilms;

    public PosterManager() {
        this.limitFilms = 5;
    }

    public PosterManager(int limitFilms) {
        this.limitFilms = limitFilms;
    }

    public void addMovie(Movie movies) {
        Movie[] tmp = new Movie[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
         }
        tmp[posters.length] = movies;
        posters = tmp;
    }
    public Movie[] getMovie() {
        return posters;
    }

    public Movie[] findAll() {
        for( Movie movie : getMovie() ) {
            System.out.println(movie.getName());
        }
        return getMovie();
    }

    public Movie[] findLast() {
        int lastMovies = Math.min(posters.length, limitFilms);
        Movie[] result = new Movie[lastMovies];

        for (int i = 0; i < lastMovies; i++) {
            result[i] = posters[posters.length -1 - i];
        }
        return result;
    }
}
