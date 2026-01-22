package Chain_of_Responsibility;

public class Level3Handler implements Handler {
    public void setNext(Handler next) {}
    public void handle(Request r) {
        System.out.println("Level3 bearbeitet CRITICAL.");
    }
}
