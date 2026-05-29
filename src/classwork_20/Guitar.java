package classwork_20;

public class Guitar extends Instrument implements Playable {

    public Guitar(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("Playing guitar " + name);
}
}