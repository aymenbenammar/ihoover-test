package aymen_ben_ammar.ihoover.entities;

public class Swing extends Command{
    private final Pivot pivot;

    public Swing(Pivot pivot) {
        this.pivot = pivot;
    }

    public Pivot getPivot() {
        return pivot;
    }
}
