public enum LecturerWork { 
    TEACH ("Be inspiring"), 
    RESEARCH ("Appear thoughtful");
    
    private final String descr;
    LecturerWork(String d) { this.descr = d; }
    public String getDescription() { return this.descr; }
}