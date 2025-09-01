import java.util.*;

public class MajorityElement169 {
  public static void main(String[] args) {
    int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
    int n = nums.length;
    int result = 0;
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < n; i++) {
      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }
    for (int key : map.keySet()) {
      if (map.get(key) > n / 2) {
        result = key;
        System.out.println("Majority Number is :" + result);
        break;
      }
    }

  }
}
