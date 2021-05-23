import java.util.Arrays;

public class GettersAndSetters {
    private int[] score;

    public GettersAndSetters(int[] score) {
        this.score = score;
    }

    public int[] getScore() {
        return score;
    }

    public void setScore(int[] score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "GettersAndSetters{" +
                "score=" + Arrays.toString(score) +
                '}';
    }
    //    private String title;
//    private String director;
//    private double rating;
//
//    public GettersAndSetters(String title, String director, double rating){
//        this.title=title;
//        this.director=director;
//        this.rating=rating;
//    }
//
//    @Override
//    public String toString() {
//        return "GettersAndSetters{" +
//                "title='" + title + '\'' +
//                ", director='" + director + '\'' +
//                ", rating=" + rating +
//                '}';
//    }
//
//    public String getTitle(){
//        return this.title=title;
//    }
//    public void setTitle(){
//        this.title=title;
//    }
//
//    public void setRating(double rating) {
//        if(rating>=0 && rating<=5){
//            this.rating=rating;
//        }else
//            System.out.println("Invalid");
//
//    }

    public static void main(String[] args) {

//        GettersAndSetters movie1 =new GettersAndSetters("The avengers","Joss",4);
//        GettersAndSetters movie2 = new GettersAndSetters("Don","Farhan",2.3);
//
//        movie1.setRating(2);
//        movie1.getTitle();
//        System.out.println(movie1.rating);


}
}

