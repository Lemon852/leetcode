import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class main {    
    static ArrayList<String> find_zero_sum(ArrayList<Integer> arr) {
        Set<String> answer = new HashSet<>();
        Collections.sort(arr);
        int n = arr.size();
        for (int index = 0; index < n; index++) {
            int currentElement = arr.get(index);
            
            int neededSum = -currentElement;
            int left = index + 1, right = n - 1;
            while (left < right) {
                int sum = arr.get(left) + arr.get(right);
                if (sum == neededSum) {
                    answer.add(currentElement + "," + arr.get(left) + "," + arr.get(right));
                    left++; 
                } else if (sum > neededSum) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return new ArrayList<>(answer);
    }

}
