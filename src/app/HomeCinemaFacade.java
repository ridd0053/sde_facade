package app;

public class HomeCinemaFacade {
    private Amplifier amp;
    private Tuner tuner;
    private DvdPlayer dvd;
    private CdPlayer cd;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;
    private PopcornPopper popper;
    ListenToMusicFacade music = new ListenToMusicFacade();
    ListenToRadioFacade radio = new ListenToRadioFacade();

    public HomeCinemaFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, CdPlayer cd, Projector projector, TheaterLights lights, Screen screen, PopcornPopper popper){
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchAMovie(String movie){
        System.out.println("Start movie");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);

       this.endMovie();


    }
    public void endMovie(){
        System.out.println("End movie");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
    public void listenToMusic(TheaterLights lights, Amplifier amp, CdPlayer cd){
       this.music.turnOnTheMusic(lights, amp, cd);
       this.music.turnOffTheMusic(lights, amp, cd);
    }
    public void listenToRadio(Tuner tuner, Amplifier amp){
        this.radio.turnOnTheRadio(tuner, amp);
        this.radio.turnOffTheRadio(tuner, amp);
    }

}
