package Chain_of_Responsibility;

public class Main {
    public static void main(String[] args) {
        Handler l1 = new Level1Handler();
        Handler l2 = new Level2Handler();
        Handler l3 = new Level3Handler();
        l1.setNext(l2); l2.setNext(l3);  // **KERN: Kette**
        l1.handle(new Request(Priority.INTERMEDIATE));
    }
}
