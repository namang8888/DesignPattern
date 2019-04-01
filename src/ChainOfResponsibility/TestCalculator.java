package ChainOfResponsibility;

public class TestCalculator {

    public static void main(String[] args){
        Number request = new Number(4,2,"pow");

        Operation addOp = new Add();
        Operation subOp = new Subtract();
        Operation multOp = new Multiply();
        Operation divOp = new Divide();

        addOp.setNextOperation(subOp);
        subOp.setNextOperation(multOp);
        multOp.setNextOperation(divOp);

        addOp.calculate(request);
    }
}
