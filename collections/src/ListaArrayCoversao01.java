import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayCoversao01 {
    public static void main(String[] args) {
        List<Integer> nunbers = new ArrayList<>();

        nunbers.add(0);
        nunbers.add(1);
        nunbers.add(2);
        nunbers.add(3);

        System.out.println(nunbers);

        Integer[] arrayInteger = nunbers.toArray(new Integer[0]);

        System.out.println(Arrays.toString(arrayInteger));


        Integer[] arrayNumbers = new Integer[4];
        arrayNumbers[0] = 1;
        arrayNumbers[1] = 2;
        arrayNumbers[2] = 3;
        arrayNumbers[3] = 4;



        List<Integer> arrayToList = new ArrayList<>(Arrays.asList(arrayNumbers));

        System.out.println(Arrays.toString(arrayNumbers));
        System.out.println("-----------------------------");
        System.out.println(arrayToList);


        arrayToList.add(5);



        System.out.println(Arrays.toString(arrayNumbers));
        System.out.println("-----------------------------");
        System.out.println(arrayToList);
    }
}
