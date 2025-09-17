import java.util.List;
import java.util.Arrays;

public class EXER1_Functional {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        int sum = numbers.stream()
                         .filter(n -> n % 2 == 0)  
                         .map(n -> n * n)           
                         .reduce(0, Integer::sum);  

        System.out.println("Sum of squares of even numbers: " + sum);
    }
}
