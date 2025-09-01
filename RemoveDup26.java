import java.util.*;

class RemoveDup26 {
  public static void main(String[] args) {
    int nums[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }; // sorted array
    LinkedHashSet<Integer> set = new LinkedHashSet<>();
    for (int i = 0; i < nums.length; i++) {
      set.add(nums[i]);
    }
    int i = 0;
    Iterator<Integer> iterator = set.iterator();

    while (iterator.hasNext()) {
      int element = iterator.next();
      nums[i] = element;
      i++;
    }
    System.out.println(set.size());
  }
}