package ucu;

public class Tray {
    private int denomination;
    private Tray next;
    private Tray tray;

    public Tray(int denomination) {
        this.denomination = denomination;
    }
    
    public void setNext(Tray tray) {
        this.tray = tray;
    }

    public void process(int amount) {
        if(next != null) {
            next.process(amount % denomination);
        }
        System.out.println("you should take " + amount / denomination + " of denomination " + denomination);
    }
}
