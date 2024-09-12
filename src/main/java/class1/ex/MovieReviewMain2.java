package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];


        MovieReview inception = new MovieReview();
        inception.title = "inception";
        inception.review = "Life is infinite loop";
        reviews[0] = inception;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "about time";
        aboutTime.review = "GOAT movie about time";
        reviews[1] = aboutTime;

        for (MovieReview review : reviews) {
            System.out.println("Movie title : "+ review.title + ", Movie review : "+ review.review);

        }
    }
}
