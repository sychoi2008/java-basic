package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "inception";
        inception.review = "Life is infinite loop";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "about time";
        aboutTime.review = "GOAT movie about time";

        System.out.println("Movie title : "+inception.title + ", Movie review : "+inception.review);
        System.out.println("Movie title : "+aboutTime.title + ", Movie review : "+aboutTime.review);
    }
}
