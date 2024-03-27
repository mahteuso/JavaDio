import java.util.ArrayList;
import java.util.List;

public class WildCardsTest {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat(), new Cat());
        List<Animal> animals = new ArrayList<>();

        appoitment(dogs);
        System.out.println("-----------------------");
        appoitment(cats);
        appointmentAnimal(animals);
     }

     public static void appoitment(List<? extends Animal> animals){
          for (Animal animal : animals){
              animal.appointment();
          }
     }

     public static void appointmentAnimal(List<? super Animal> animals){
        animals.add(new Dog());
        animals.add(new Dog());
        animals.add(new Cat());
         System.out.println("---------------------------");
         for (Object animal : animals){
             if (animal instanceof Dog){
                 Dog o = (Dog) animal;
                 o.appointment();
             } else if (animal instanceof Cat) {
                 Cat o = (Cat) animal;
                 o.appointment();
             }
         }
     }
}
