package ChainOfResponsibility;

public interface Operation {

    public void setNextOperation(Operation op);
    public void calculate(Number request);
}
