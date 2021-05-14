package collectionframework;
import java.util.ArrayList;
public class Movie_DetailsList {
	public static void main(String[] args) {
		ArrayList<String> movies = new ArrayList<String>();
        movies.add("Titanic");
        movies.add("Superhero");
        movies.add("Romeo");
        movies.add("Hello");
        System.out.println(movies);
        movies.add(4,"XYZ");
        System.out.println(movies);
        movies.remove(2);
        System.out.println(movies);
       
        ArrayList<String> genre = new ArrayList<String>();
        genre.add("Comedy");
        genre.add("Action");
        genre.add("LoveStory");
        genre.add("Thriller");
        System.out.println(genre);
        genre.removeAll(genre);
        System.out.println(genre);
       
	}

}
 class Movie_Details {
	 String Movie_Name;
	 String lead_actor;
	 String lead_actress;
	 String genre;
	 public String getMovie_Name() {
		return Movie_Name;
	}
	public void setMovie_Name(String movie_Name) {
		Movie_Name = movie_Name;
	}
	public String getLead_actor() {
		return lead_actor;
	}
	public void setLead_actor(String lead_actor) {
		this.lead_actor = lead_actor;
	}
	public String getLead_actress() {
		return lead_actress;
	}
	public void setLead_actress(String lead_actress) {
		this.lead_actress = lead_actress;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	 
 }
