import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Read the whole line
        String[] arr = s.nextLine().split("\\s+");
        HashMap<Integer, String> map = new HashMap<>();

        // First 4 strings
        for (int i = 1; i <= 4; i++) {
            map.put(i, arr[i-1]);
        }
        // The last entry is the integer key to remove
        int keyToRemove = Integer.parseInt(arr[4]);

        System.out.println("Mappings of HashMap are : " + map);
        map.remove(keyToRemove);
        System.out.println("Mappings after removal are : " + map);
  }
}