package example_1_2;

import java.util.List;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1,2,3,4,5,6,7,8,9);
        System.out.println(sumEvenNumbers(integerList));
    }

    static int sumEvenNumbers(List<Integer> integerList){
        return integerList.stream()
                .filter(e -> e % 2 == 0)
                .mapToInt(e -> e)
                .sum();
    }
}
