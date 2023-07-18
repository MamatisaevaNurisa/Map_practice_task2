import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map = new HashMap<>();
        int[] numbers = new int[10];
        Random ran = new Random();

        int counter = 0;
        int counter2 = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ran.nextInt(1, 10);

            for (int j = 0; j < numbers.length; j++) {

             if(numbers[i]==numbers[j]){
                 counter++;
                 counter2+=counter;
                 map.put(numbers[i], counter2);
                 counter=0;
             }
            }
              counter2=0;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(map);
    }

}


