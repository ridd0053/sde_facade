package app;

public class Main {

    public static void main(String[] args) {
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
        CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
        Projector projector = new Projector("Top-O-Line Projector", dvd);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

       HomeCinemaFacade cinema = new HomeCinemaFacade(amp, tuner, dvd, cd, projector, lights, screen, popper);

       cinema.watchAMovie("The joker");
       cinema.listenToMusic(lights, amp, cd);
       cinema.listenToRadio(tuner, amp);

    }
}
