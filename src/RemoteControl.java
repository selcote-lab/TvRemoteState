abstract class RemoteControl {
    public abstract void pressSwitch(Tv context);
}

class On extends RemoteControl {
    @Override
    public void pressSwitch(Tv context) {
        System.out.println("I am already on.Going to be Off now");
        context.setState(new Off());
    }
}

class Off extends RemoteControl {
    @Override
    public void pressSwitch(Tv context) {
        System.out.println("I am already off.Going to be On now");
        context.setState(new On());
    }
}
