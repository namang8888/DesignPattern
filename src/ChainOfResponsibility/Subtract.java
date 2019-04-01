package ChainOfResponsibility;

public class Subtract implements Operation {
    Operation nextOp;

    @Override
    public void setNextOperation(Operation op) {
        this.nextOp = op;
    }

    @Override
    public void calculate(Number request) {
        if(request.getOpType().equals("sub")){
            System.out.println(request.getNumber1() +" - " + request.getNumber2() + " = "
                    + (request.getNumber1()-request.getNumber2()));
        } else{
            nextOp.calculate(request);
        }
    }
}