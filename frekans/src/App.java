import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {

        int a[] = { 1, 2, 3, 4, 2, 3, 4, 4, 4, 5 };
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (frequency.containsKey(a[i])) {
                frequency.put(a[i], frequency.get(a[i]) + 1);
            } else {
                frequency.put(a[i], 1);
            }
        }
        System.out.println(frequency);
    }
}
