package Chain_of_Responsibility;

public class Level1Handler implements Handler {
    private Handler next;
    public void setNext(Handler next) { this.next = next; }
    public void handle(Request r) {
        if (r.getPriority() == Priority.BASIC) {
            System.out.println("Level1 bearbeitet BASIC.");
        } else if (next != null) {
            next.handle(r);  // **KERN: Weiterleiten**
        }
    }
}
