package task1.factory.plot.plot;

import task1.factory.plot.Character;
import task1.factory.plot.Plot;

public class ClassicDisneyPlot implements Plot {
    private final Character hero;
    private final Character beloved;
    private final Character villain;
    private final String plot;
    public ClassicDisneyPlot(Character hero, Character beloved, Character villain) {
        this.beloved = beloved;
        this.hero = hero;
        this.villain = villain;
        this.plot = getPlot();
    }


    @Override
    public String getPlot() {
        return "ClassicDisneyPlot{" +
                "hero=" + hero +
                ", beloved=" + beloved +
                ", villain=" + villain +
                ", plot='" + plot + '\'' +
                '}';
    }


}
