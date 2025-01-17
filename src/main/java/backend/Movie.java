package backend;

import java.util.ArrayList;

public class Movie {

    private String name;
    private String score;
    private int year;
    private String director;
    private int id;
    private double popularity;
    private String description;

    private ArrayList<Tag> genres;

    public Movie(){
        this.id = 0;
        this.score = "";
        this.director = "";
        this.name = "";
        this.year = 0;
        this.popularity = 0.0;
        this.description = "";
        genres = new ArrayList<>();
    }

    public Movie(int id, String name, String score, int year, double popularity, String director, String description){
        this.id = id;
        this.name = name;
        this.score = score;
        this.year = year;
        this.popularity = popularity;
        this.director = director;
        this.genres = new ArrayList<>();
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Tag> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<Tag> genres) {
        this.genres = genres;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", score='" + score + '\'' +
                ", year=" + year +
                ", popularity=" + popularity +
                ", description=" + description +
                '}';
    }
}
