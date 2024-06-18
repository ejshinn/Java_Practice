import java.util.HashMap;
import java.util.Map;

public class HashMapEx2 {
    public static void main(String[] args) {

        Map<Member, Integer> map = new HashMap<Member, Integer>();

        map.put(new Member("짱구", 5), 95);
        map.put(new Member("짱구", 5), 95);

        System.out.println("총 저장 수 : " + map.size());
    }
}