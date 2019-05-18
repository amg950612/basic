import java.util.HashMap;
import java.util.Map;

public class Population {

    public static void main(String[] args) {
        Map<String, Integer> population = new HashMap<>();
        population.put("małopolskie", 400000);
        population.put("śląskie", 200000);
        population.put("pomorskie", 250000);
        population.put("podkarpackie", 300000);

        for(Map.Entry<String,Integer> entry:population.entrySet())
        {
            System.out.println("Population: " + entry.getKey() + " " + entry.getValue());
        }

    }
}
