import java.util.Arrays;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio){
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }
    void display(){
        System.out.println(title + " " + studio + " " + rating);
    }
    String[] getPG(Movie[] m1s){
        String[] ratingPG = new String[3];
        int p = 0;
        for (int i = 0; i < m1s.length; i++) {
            if(m1s[i].rating.matches("PG")){
                ratingPG[p++] = this.title;
            }
        }
        return ratingPG;
    }

    public static void main(String[] args) {
        Movie m1 = new Movie("DDLJ","Raj-imperial","PG-13");
        m1.display();
        Movie m2 = new Movie("OSO", "PVR");
        m2.display();
        Movie m3 = new Movie("OSO", "PVR","R");
        System.out.println(Arrays.toString(m1.getPG(new Movie[]{m1,m2,m3})));
        Movie m4 = new Movie("OSO", "PVR","PG");
    }

}
