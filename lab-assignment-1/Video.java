import java.util.*;

public class Video {
    private String title;
    private String producer;
    private Gerne gerne;
    private int date;
    private Set<String> languages = new TreeSet<String>();

    public Video(String title, String producer, Gerne gerne){
        this.title = title;
        this.producer = producer;
        this.gerne = gerne;
    }
    public Video(String title, String producer, Gerne gerne, String[] languages){
        this(title, producer, gerne);
        StringBuilder sb = new StringBuilder();
        for (String s: languages){
            if(s.length()==0) continue;
            sb.setLength(0);
            sb.append(s.toLowerCase());
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            this.languages.add(sb.toString());
        }
    }
    public void setDate(int date){
        if (date < 1900 || date>2020) {
            System.out.println("Date out of bounds [1900-2020]: "+date);
            return;
        }
        this.date = date;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public String getProducer(){
        return this.producer;
    }
    public Gerne getGerne(){
        return this.gerne;
    }
    public int getDate(){
        return this.date;
    }
    public Collection getLanguages(){
        return new TreeSet<String>(this.languages);
    }
    public boolean equals(Video other){
        if ( other==null ) return false;
        return this.title.equals(other.title)
            && this.producer.equals(other.producer)
            && this.gerne.equals(other.gerne)
            && this.date==other.date;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Video \t").append(this.title)
            .append("\n\tProducer:\t").append(this.producer)
            .append("\n\tGerne:\t").append(this.gerne)
            .append("\n\tDate:\t").append(this.date)
            .append("\n\tLanguages:\t");
        for(String l: this.languages)
            sb.append(l).append(", ");
        if( sb.length()>0 )
            sb.setLength( sb.length()-2);
        return sb.toString();
    }


}
