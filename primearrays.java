import java.util.*;

public class removeDup {
  public static void main(String[] args) {
    System.out.println("duplecate elements");
    System.out.println("2,3,3,5,7,7,11,11");
    List<Integer> list = Arrays.asList(2, 3, 3, 5, 7, 7, 11, 11);
    List<Integer> updatedList = new ArrayList<>();
    for (Integer data : list) {
      if (!updatedList.contains(data)) {
        updatedList.add(data);
      }
    }
    System.out.println("after updateing the list");
    System.out.println(updatedList);
  }
}
