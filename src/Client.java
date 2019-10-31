public class Client {
    public static void main(String[] args) {
        RemoteControl initiateState = new Off();

        Tv tv = new Tv(initiateState);
        tv.pressButton();
        tv.pressButton();
    }
}
