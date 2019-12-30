package ChainOfResponsibility;

public class Test {
    public static void main(String[] args) {
        Handler request1 = new HandlerRequest1();
        HandlerRequest2 request2 = new HandlerRequest2();
        HandlerRequest3 handlerRequest3 = new HandlerRequest3();
        request1.setHandler(request2);
        request2.setHandler(handlerRequest3);

        int[] request = {1, 2, 4, 6, 8, 9, 12, 21, 14, 15, 24, 27};

        for (int i : request) {
            request1.HandlerRequest(i);
        }

    }
}
