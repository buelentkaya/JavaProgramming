package day31Constructer;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    public String country,title,Genre,releaseDate,director;
    public ArrayList<String>casts;

    public Movie(String country, String title, String genre, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        Genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;
        casts = new ArrayList<>();

    }

   public void addCast(String name){
        casts.add(name);
   }
    public void addCasts(String[]names){
       casts.addAll(Arrays.asList(names));
    }

    public String toString() {
        return
                "Title:'" + title + '\n' +
                "Country:'" + country + '\n' +
                "Genre:'" + Genre + '\n' +
                "ReleaseDate:'" + releaseDate + '\n' +
                "Director:" + director + '\n' +
                "Casts:" + casts ;


    }
}
