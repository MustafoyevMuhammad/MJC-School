package task1.factory.plot.disney;

import task1.factory.plot.Character;
import task1.factory.plot.EpicCrisis;
import task1.factory.plot.Plot;
import task1.factory.plot.PlotFactory;
import task1.factory.plot.plot.MarvelDisneyPlot;

public class MarvelDisneyPlotFactory implements PlotFactory {
    private final Character villain;
    private final Character[] heroes;
    private final EpicCrisis epicCrisis;
    public MarvelDisneyPlotFactory(Character[] heroes, EpicCrisis epicCrisis, Character villain) {
        this.epicCrisis = epicCrisis;
        this.heroes = heroes;
        this.villain = villain;
    }

    @Override
    public Plot plot() {
        return new MarvelDisneyPlot(getCharacters(), getEpicCrisis(), getVillain());
    }

    @Override
    public Character getHero() {
        return null;
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
