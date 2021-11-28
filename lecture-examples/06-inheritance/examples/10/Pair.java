public class Pair<F, S>{
    private F first;
    private S second;
    public Pair(F f, S s){
        this.first = f;
        this.second = s;
    }
    public F getFirst(){
        return this.first;
    }
    public S getSecond(){
        return this.second;
    }
    @Override
    public String toString(){
        return this.first + " - " + this.second;
    }
}
