public interface Ratable {
    public double getAverageRating();
    public int getRatingsCount();
    public void addRating(int r) throws IllegalArgumentException;
}
