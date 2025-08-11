package cs665.structural.facade;

public interface ProgramProvider {
    Program getUndergradCS();
    Program getUndergradCIS();
    Program getGradCS();
    Program getGradCIS();
    Program getGradDA();

    Program getCertSec();
    Program getCertWeb();
    Program getCertAnalytics();
}
