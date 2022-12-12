@FunctionalInterface
interface IsFunctional {
    void testMethode();

}


public class Main {
    public static void main(String[] args) {

        IsFunctional isFunctional = () -> {
            System.out.println("hi"); };

    }

}