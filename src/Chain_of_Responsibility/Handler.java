package Chain_of_Responsibility;

public interface Handler {
    void setNext(Handler next);
    void handle(Request r);
}

