package task1.factory.plot;

import task1.factory.plot.disney.ClassicDisneyPlotFactory;
import task1.factory.plot.disney.ContemporaryDisneyPlotFactory;
import task1.factory.plot.disney.MarvelDisneyPlotFactory;

public class PlotFactories {
    public PlotFactory classicDisneyPlotFactory(Character hero, Character beloved, Character villain) {
        return new ClassicDisneyPlotFactory(hero, beloved, villain);
    }

    public PlotFactory contemporaryDisneyPlotFactory(Character hero, EpicCrisis epicCrisis, Character funnyFriend) {
        return new ContemporaryDisneyPlotFactory(hero, epicCrisis, funnyFriend);
    }

    public PlotFactory marvelPlotFactory(Character[] heroes, EpicCrisis epicCrisis, Character villain) {
        return new MarvelDisneyPlotFactory(heroes, epicCrisis, villain);
    }

}
