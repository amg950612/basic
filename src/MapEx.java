import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEx {

    public static void main(String[] args) {

        Map<Integer, String> statuses = new TreeMap<>();
        statuses.put(404, "Not found");
        statuses.put(301, "Redirect");
        statuses.put(200, "Ok");
        System.out.println(statuses.containsKey(500)); //return bool
        String ok = statuses.get(200);

        for (Map.Entry<Integer, String> entry : statuses.entrySet()) {
            System.out.println("My entry:" + entry.getKey() + " " + entry.getValue());
        }
        {
        }
    }
}
