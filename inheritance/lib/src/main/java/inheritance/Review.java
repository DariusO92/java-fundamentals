package inheritance;

public class Review {
    public String author;
    public String body;
    public int numberOfStars;

    public Review(String author, String body, int numberOfStars) {
        this.author = author;
        this.body = body;
        this.numberOfStars = numberOfStars;
    }

    @Override
    public String toString(){
        return "author:" + this.author + "body:" + this.body + "numberOfStars:" + this.numberOfStars + ".";
    }
}
