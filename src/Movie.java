public class Movie {

    private String name;
    private String genre;
    private int duration; // in minutes
    private String director;

    public Movie(String name, String genre, int duration, String director) {
        this.name = name;
        this.genre = genre;
        this.duration = duration;
        this.director = director;
    }

    public String getName() {
        return name;
    }
    public String getGenre() {
        return genre;
    }
    public int getDuration() {
        return duration;
    }
    public String getDirector() {
        return director;
    }
    
}
