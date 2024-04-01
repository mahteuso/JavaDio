import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {

        List<String> name = List.of("2", "3", "4");
        List<Integer> integer = map(name, s -> Integer.parseInt(s));
        System.out.println(integer instanceof List<Integer>);
        System.out.println(name instanceof List<String>);

    }

    private static <T, R> List <R> map(List<T> list, Function<T, R> function){
        List<R> rList = new ArrayList<>();
        for (T e : list){
           R r = function.apply(e);
           rList.add(r);
        }
        return rList;
    }

}
