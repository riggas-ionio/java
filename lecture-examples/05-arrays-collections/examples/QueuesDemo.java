import java.util.*;

public class QueuesDemo {
    public static void main(String[] args){
        Stack<String> s = new Stack<>();
        s.push("A"); s.push("B"); s.push("C");
        while (s.size() > 0)
            System.out.print(s.pop() + " "); // Prints C B A
        System.out.println();

        Queue<String> q = new LinkedList<>();
        q.add("A"); q.add("B"); q.add("C");
        while (q.size() > 0)
            System.out.print(q.remove() + " ");  // Prints A B C
        System.out.println();

        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("C"); pq.add("A"); pq.add("B");
        while (pq.size() > 0)
            System.out.print(pq.remove() + " ");  // Prints A B C
        System.out.println();
    }
}
