package ru.netology;

public class Movie {

    private String name;
    private double releaseDate;
    private String filmGenre;

    public Movie(String name, double releaseDate, String filmGenre) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.filmGenre = filmGenre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(double releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }
}
