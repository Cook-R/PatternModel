package ChainOfResponsibility;

public class HandlerRequest1 extends Handler {
    @Override
    public void HandlerRequest(int request) {
        if (request >= 0 && request <= 10) {
            System.out.println(getClass().getName() + "执行===" + request);

        } else  {
            getHandler().HandlerRequest(request);
        }
    }
}
