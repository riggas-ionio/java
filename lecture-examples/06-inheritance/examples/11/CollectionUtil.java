import java.util.Collection;
import java.lang.StringBuilder;

public class CollectionUtil{
    public static <E> String toString(Collection<E> c){
        StringBuilder sb = new StringBuilder();
        for(E e: c){
            sb.append(e.toString()).append(", ");
        }
        sb.replace(sb.length()-2, sb.length()-1, "");
        return sb.toString().trim();
    }
}
