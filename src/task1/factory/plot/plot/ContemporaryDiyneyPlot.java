package task1.factory.plot.plot;

import task1.factory.plot.Character;
import task1.factory.plot.EpicCrisis;
import task1.factory.plot.Plot;

public class ContemporaryDiyneyPlot implements Plot {
    private final Character hero;
    private final Character funnyFriend;
    private final EpicCrisis epicCrisis;
    private final String plot;
    public ContemporaryDiyneyPlot(Character hero, EpicCrisis epicCrisis, Character funnyFriend) {
        this.epicCrisis = epicCrisis;
        this.hero = hero;
        this.funnyFriend = funnyFriend;
        plot =getPlot();
    }



    @Override
    public String getPlot() {
        return "ContemporaryDiyneyPlot{" +
                "hero=" + hero +
                ", funnyFriend=" + funnyFriend +
                ", epicCrisis=" + epicCrisis +
                ", plot='" + plot + '\'' +
                '}';
    }
}
