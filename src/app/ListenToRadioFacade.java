package app;

public class ListenToRadioFacade {
//    To listen to the radio we should:
public void turnOnTheRadio(Tuner tuner, Amplifier amp) {
    System.out.println("start radio");
        //  1) turn the tuner on
        tuner.on();
        //  2) set the frequence to the required number
        tuner.setFrequency(8.3);
        //  3) turn the amplifier on
        amp.on();
        //  4) set the amplifier volume to 5
        amp.setVolume(83);
        //  5) set the amplifier to tuner mode
        amp.setTuner(tuner);
}
//
//    When  we're ready listening music:
    public void turnOffTheRadio(Tuner tuner, Amplifier amp){

        //  1) turn of the tuner
        tuner.off();
        //  2) turn off the amplifier
        amp.off();
        System.out.println("stop radio");
    }
}
