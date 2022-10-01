package task1.factory.plot.plot;

import task1.factory.plot.Character;
import task1.factory.plot.EpicCrisis;
import task1.factory.plot.Plot;

import java.util.Arrays;

public class MarvelDisneyPlot implements Plot {
    private final Character villain;
    private final Character[] heroes;
    private final EpicCrisis epicCrisis;
    private final String plot;
    public MarvelDisneyPlot(Character[] heroes, EpicCrisis epicCrisis, Character villain) {
        this.epicCrisis = epicCrisis;
        this.heroes = heroes;
        this.villain = villain;
        plot = getPlot();
    }



    @Override
    public String getPlot() {
        return "MarvelDisneyPlot{" +
                "villain=" + villain +
                ", heroes=" + Arrays.toString(heroes) +
                ", epicCrisis=" + epicCrisis +
                ", plot='" + plot + '\'' +
                '}';
    }
}
