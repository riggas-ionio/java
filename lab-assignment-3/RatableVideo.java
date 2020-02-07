import java.util.*;

public class RatableVideo extends Video implements Ratable, Comparable<RatableVideo> {
    private int ratingsCnt =0;
    private double ratingsSum = 0.0;

    public RatableVideo(String title, String producer, Genre genre){
        super(title, producer, genre);
    }
    public RatableVideo(String title, String producer, Genre genre, String[] languages){
        super(title, producer, genre, languages);
    }
    public double getAverageRating() {
        if ( this.ratingsCnt==0 )
            return 0.0;
        double avg = this.ratingsSum / this.ratingsCnt;
        return Math.round(avg * 2) / 2.0;
    }
    public int getRatingsCount() {
        return this.ratingsCnt;
    }
    public void addRating(int r) throws IllegalArgumentException {
        if (r <1 || r>5 )
            throw new IllegalArgumentException("Rating out of bounds [1-5]: "+r);
        this.ratingsSum += r;
        this.ratingsCnt++;
    }

    public int compareTo(RatableVideo other) {
        int c = new Double( this.getAverageRating()).compareTo( new Double(other.getAverageRating()) );
        return c!=0 ? -c : (new Integer(this.getRatingsCount()).compareTo(new Integer(other.getRatingsCount())));

    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
            .append("\n\tAverage Rating:\t").append(this.getAverageRating())
            .append("\n\tRatings count:\t").append(this.getRatingsCount()).append("\n");
        return sb.toString();
    }


}
