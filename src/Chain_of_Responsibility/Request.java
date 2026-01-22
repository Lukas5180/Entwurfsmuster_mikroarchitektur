package Chain_of_Responsibility;

public class Request {
    private Priority priority;
    public Request(Priority p) { this.priority = p; }
    public Priority getPriority() { return priority; }
}

