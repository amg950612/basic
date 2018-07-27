import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Krs {

  private static Map<String, String> pkd ;
  private static List<Company> companies = new ArrayList<>();

    public static void main(String[] args) {
        initCodes();
        addCompany("Company1");
    }

    private static void initCodes()
    {
        pkd = new HashMap<>();
        pkd.put("47.99.Z", "Pozostała sprzedaż detaliczna prowadzona poza siecią sklepową, straganami i targowiskami");
        pkd.put("63.12.Z", "Działalność portali internetowych");
        pkd.put("47.19.Z", "Pozostała sprzedaż detaliczna prowadzona w niewyspecjalizowanych sklepach");

    }

    public static boolean addCompany(String name, String... codes)
    {
        Company company = new Company("Company1");

        int i = 0;
        for (String code:codes)
        {
            if (company.addCode(code))
                i++;
            if (i>0)
                return companies.add(company);

        }             return false;
    }

    public static boolean isValid(String code)
    {
        if (pkd.containsKey(code)){
            return true;
        }
        return false;
    }
}
class Company
{
   private String name;
   private static List<String> codes = new ArrayList<>();

    public Company(String name){
        this.name = name;
    }

    public static boolean addCode (String code){
        if (Krs.isValid(code) && !codes.contains(code) ) {
            codes.add(code);
            return true;
        }
            return false;
    }

    public static void main(String[] args) {
        addCode("blabla");
    }
}