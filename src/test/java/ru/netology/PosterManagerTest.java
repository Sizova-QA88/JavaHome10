package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterManager;

public class PosterManagerTest {
    Movie poster1 = new Movie("Бладшот", 12.08, "жанр: боевик");
    Movie poster2 = new Movie("Вперед", 01.08, "жанр: мультфмильм");
    Movie poster3 = new Movie("Отель Белград", 05.04, "жанр: комедия");
    Movie poster4 = new Movie("Джентельмены", 13.07, "жанр: боевик");
    Movie poster5 = new Movie("Человек-невидимка", 26.07, "жанр: ужасы");
    Movie poster6 = new Movie("Тролли. Мировой тур", 19.06, "жанр: мультфильм");
    Movie poster7 = new Movie("Номер один", 07.08, "жанр: комедия");



    @Test
    public void addAllMovie() {
        PosterManager poster = new PosterManager(7);
        poster.addMovie(poster1);
        poster.addMovie(poster2);
        poster.addMovie(poster3);
        poster.addMovie(poster4);
        poster.addMovie(poster5);
        poster.addMovie(poster6);
        poster.addMovie(poster7);
        poster.findAll();

        Movie[] expected = {poster1, poster2, poster3, poster4, poster5, poster6, poster7};
        Movie[] actual = poster.getMovie();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addOneNewFilm() {
        PosterManager poster = new PosterManager();
        poster.addMovie(poster6);

        Movie[] expected = {poster6};
        Movie[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void moviesLessLimit() {
        PosterManager poster = new PosterManager();
        poster.addMovie(poster7);
        poster.addMovie(poster6);
        poster.addMovie(poster5);

        Movie[] expected = {poster5, poster6, poster7};
        Movie[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void moviesReversedLast() {
        PosterManager poster = new PosterManager();
        poster.addMovie(poster7);
        poster.addMovie(poster6);
        poster.addMovie(poster5);
        poster.addMovie(poster4);
        poster.addMovie(poster3);

        Movie[] expected = {poster3, poster4, poster5, poster6, poster7};
        Movie[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void moviesReversed() {
        PosterManager poster = new PosterManager();
        poster.addMovie(poster1);
        poster.addMovie(poster2);
        poster.addMovie(poster3);

        Movie[] expected = {poster3, poster2, poster1};
        Movie[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void moviesAddingWithLimit() {
        PosterManager poster = new PosterManager(5);
        poster.addMovie(poster1);
        poster.addMovie(poster2);
        poster.addMovie(poster3);
        poster.addMovie(poster4);
        poster.addMovie(poster5);
        poster.addMovie(poster6);
        poster.addMovie(poster7);
        poster.findLast();

        Movie[] expected = {poster7, poster6, poster5, poster4, poster3};
        Movie[] actual = poster.findLast();
    }
}