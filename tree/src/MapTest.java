import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> aluno1 = new HashMap<>();

        aluno1.put("name", "Mateus");
        aluno1.put("age", "43");
        aluno1.put("rg", "43025473");

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("name", "Marco");
        aluno2.put("age", "45");
        aluno2.put("rg", "43021234");

        Map<String, String> aluno3 = new HashMap<>();

        aluno3.put("name", "Rogério");
        aluno3.put("age", "47");
        aluno3.put("rg", "43025473");



        List<Map<String, String>> alunos = new ArrayList<>();

        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);

        System.out.println(alunos);

     /*  for (String key : aluno3.keySet()){
           String value = aluno3.get(key);
           System.out.println(key + " = " + value);
       }*/

       for (Map aluno : alunos){
           for (Object key : aluno.keySet()){
               Object value = aluno.get(key);
               System.out.println(key + " = " + value);
           }
       }
    }
}
