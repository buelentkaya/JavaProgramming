package day31Constructer;

public class MovieObjects {
    public static void main(String[] args) {

        String[] casts={"Asiya", "Adam", "Muhtar","Bulent","Ihsan","Büsra","Sultan","Yalcin"};

        Movie movie1=new Movie("USA","Journey to SDET: Cydeo Batch 25","Adventure, Comedy, Thriller","10/25/2022","Kuzzat Altay");
   movie1.addCasts(casts);
        System.out.println(movie1);




    }
}
