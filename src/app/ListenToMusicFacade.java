package app;

public class ListenToMusicFacade {

//    To listen to the music we should:
    public void turnOnTheMusic(TheaterLights lights, Amplifier amp, CdPlayer cd){
        System.out.println("start music");
        //  1) put the lights on
        lights.on();
        //  2) put the amplifier on
        amp.on();
        //  3) set the volume of the amplifier to 5
        amp.setVolume(5);
        //  4) insert a cd in the amplifier
        amp.setCd(cd);
        //  5) and enable sterio sound
        amp.setStereoSound();
        //  6) turn the cd player on
        cd.on();
        //  7) let the player play the cd
        cd.play("music");
    }



//
//    When  we're ready listening music:
    public void turnOffTheMusic(TheaterLights lights, Amplifier amp, CdPlayer cd){
        //  1) turn the amplifier off
        amp.off();
        //  2) set the amplifier to cd mode
        amp.setCd(cd);
        //  3) eject cd out of the cd player
        cd.eject();
        //  4) turn off cd player
        cd.off();
        System.out.println("stop music");
    }

}
