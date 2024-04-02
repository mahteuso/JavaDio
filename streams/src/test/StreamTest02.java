package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest02 {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>(List.of("Mateus", "Julia", "Helena", "Rafael"));
        List<String> teachers = new ArrayList<>(List.of("Marco", "Bruna", "Maria Helena", "Rafaela"));


        List<List<String>> list = new ArrayList<>(List.of(students, teachers));

        for (List<String> names : list){
            if (names.size() == students.size()){
                System.out.print("studentsList = [" );
                for (String name : names){
                    if (name.equals(names.getLast())){
                        System.out.println(name + "]");
                    } else {
                        System.out.print(name + ", ");
                    }
                }
            } else if (names.size() == teachers.size()){
                System.out.print("treacherList = [" );
                for (String name : names){
                    if (name.equals(names.getLast())){
                        System.out.println(name + "]");
                    } else {
                        System.out.print(name + ", ");
                    }
                }
            }
        }

        Stream<String> stringStream = list.stream().flatMap(l -> l.stream());
        stringStream.forEach(System.out::println);

        System.out.println("---------------------------");

    }
}
