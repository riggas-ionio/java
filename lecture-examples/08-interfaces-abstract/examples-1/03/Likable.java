public interface Likable {
    public void increaseLikes() ;
    public int getLikes() ;
    /**
     * @returns: -1 if other more likable, 1 if this more likable, 0 otherwise.
     */ 
    public int isMoreLikableThan(Likable other);
}