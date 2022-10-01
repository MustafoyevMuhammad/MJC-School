package task1.factory.plot.disney;

import task1.factory.plot.Character;
import task1.factory.plot.EpicCrisis;
import task1.factory.plot.Plot;
import task1.factory.plot.PlotFactory;
import task1.factory.plot.plot.ClassicDisneyPlot;

public class ClassicDisneyPlotFactory implements PlotFactory {
    private final Character hero;
    private final Character beloved;
    private final Character villain;

    public ClassicDisneyPlotFactory(Character hero, Character beloved, Character villain) {
        this.beloved = beloved;
        this.hero = hero;
        this.villain = villain;
    }

    @Override
    public Plot plot() {
        return new ClassicDisneyPlot(getHero(), getBeloved(), getVillain());
    }

    @Override
    public Character getHero() {
        return hero;
    }

    @Override
    public Character getBeloved() {
        return beloved;
    }

    @Override
    public Character getVillain() {
        return villain;
    }

    @Override
    public EpicCrisis getEpicCrisis() {
        return null;
    }

    @Override
    public Character getfunnyFriends() {
        return null;
    }


    @Override
    public Character[] getCharacters() {
        return new Character[0];
    }
}
