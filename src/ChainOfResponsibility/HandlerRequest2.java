package ChainOfResponsibility;

public class HandlerRequest2 extends Handler {
    @Override
    public void HandlerRequest(int request) {
        if (request >= 11 && request <= 20) {
            System.out.println(getClass().getName() + "执行===" + request);

        } else  {
            getHandler().HandlerRequest(request);
        }
    }
}
