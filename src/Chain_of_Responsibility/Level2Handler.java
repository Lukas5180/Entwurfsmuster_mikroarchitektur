package Chain_of_Responsibility;

public class Level2Handler implements Handler {
    private Handler next;
    public void setNext(Handler next) { this.next = next; }
    public void handle(Request r) {
        if (r.getPriority() == Priority.INTERMEDIATE) {
            System.out.println("Level2 bearbeitet INTERMEDIATE.");
        } else if (next != null) {
            next.handle(r);
        }
    }
}

