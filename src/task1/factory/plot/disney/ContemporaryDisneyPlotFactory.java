package task1.factory.plot.disney;

import task1.factory.plot.Character;
import task1.factory.plot.EpicCrisis;
import task1.factory.plot.Plot;
import task1.factory.plot.PlotFactory;
import task1.factory.plot.plot.ContemporaryDiyneyPlot;

public class ContemporaryDisneyPlotFactory implements PlotFactory {
    private final Character hero;
    private final EpicCrisis epicCrisis;
    private final Character funnyFriend;
    public ContemporaryDisneyPlotFactory(Character hero, EpicCrisis epicCrisis, Character funnyFriend) {
        this.hero = hero;
        this.epicCrisis = epicCrisis;
        this.funnyFriend = funnyFriend;
    }

    @Override
    public Plot plot() {
        return new ContemporaryDiyneyPlot(getHero(), getEpicCrisis(), getfunnyFriends());
    }

    @Override
    public Character getHero() {
        return hero;
    }

    @Override
    public Character getBeloved() {
        return null;
    }

    @Override
    public Character getVillain() {
        return null;
    }

    @Override
    public EpicCrisis getEpicCrisis() {
        return epicCrisis;
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
