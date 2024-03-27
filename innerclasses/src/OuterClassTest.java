public class OuterClassTest {

    public String name;

    public OuterClassTest(String name){
        this.name = name;
    }

    class InnerClass {

        public void printNameOuterClass(){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        OuterClassTest out = new OuterClassTest("Maluco beleza");

        InnerClass inner = out.new InnerClass();

        inner.printNameOuterClass();
    }
}
