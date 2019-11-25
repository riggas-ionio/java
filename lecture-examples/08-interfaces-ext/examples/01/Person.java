
public abstract class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }
    public void goodmorning() {
        System.out.println(name + " says Gooooodmorning!...");
    }
    public void goodnight() {
        System.out.println(name + " says Goodnight..");
    }
    public String getName() { return name; }
    
    public abstract void logDay();
    
    public static void main(String[] args) {
        //new Person("Dimitris");
        System.out.println("Hello world");
        
    }
}