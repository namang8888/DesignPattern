package ChainOfResponsibility;

public class Divide implements Operation {
    Operation nextOp;

    @Override
    public void setNextOperation(Operation op) {
        this.nextOp = op;
    }

    @Override
    public void calculate(Number request) {
        if(request.getOpType().equals("div")){
            System.out.println(request.getNumber1() +" / " + request.getNumber2() + " = "+
                    (request.getNumber1()/request.getNumber2()));
        } else{
            System.out.println("Can only perform add,subtract,multiply and divide");
        }
    }
}
