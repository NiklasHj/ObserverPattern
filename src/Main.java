import ObserverPatternPackage.Channel;
import ObserverPatternPackage.Subscriber;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Channel channel = new Channel();

        Subscriber sub1 = new Subscriber("Robin");
        channel.attach(sub1);
        Subscriber sub2 = new Subscriber("Karin");
        channel.attach(sub2);
        Subscriber sub3 = new Subscriber("Johan");
        channel.attach(sub3);

        channel.setState("NYHET!");

        channel.detach(sub1);

        channel.setState("EN TILL NYHET!");

    }
}
