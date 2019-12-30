package ChainOfResponsibility;

public class HandlerRequest3 extends Handler {
    @Override
    public void HandlerRequest(int request) {
        if (request >=21 && request <= 30) {
            System.out.println(getClass().getName() + "执行===" + request);

        } else  {
            getHandler().HandlerRequest(request);
        }
    }
}
