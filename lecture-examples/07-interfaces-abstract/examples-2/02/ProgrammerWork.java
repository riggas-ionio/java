public enum ProgrammerWork { 
    MEET ("Discuss, Design"), 
    CODE ("Think, Type, Test"), 
    MAKE_COFFEE ("Make coffee");
    
    private final String descr;
    ProgrammerWork(String d) { this.descr = d; }
    public String getDescription() { return this.descr; }
}