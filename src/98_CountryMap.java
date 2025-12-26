import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CountryMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> map = new HashMap<>();

        // store keys in lowercase
        map.put("india", "New Delhi");
        map.put("china", "Beijing");
        map.put("pakistan", "Islamabad");
        map.put("usa", "Washington D.C.");
        map.put("srilanka", "Sri Jayawardenepura Kotte");

        System.out.print("Please Enter the country name: ");
        String country = sc.nextLine().toLowerCase();

        if (map.containsKey(country)) {
            System.out.println("Capital of " + country + " is " + map.get(country));
        } else {
            System.out.println("Sorry..!! We don't know the capital of the country.");
        }

        sc.close();
    }
}
