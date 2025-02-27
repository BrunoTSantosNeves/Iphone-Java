package Implementations;

import features.MusicPlayer;

public class MusicPlayerImpl implements MusicPlayer {
    
    @Override
    public void play() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pause() {
        System.out.println("Música pausada.");
    }

    @Override
    public void stop() {
        System.out.println("Música parada.");
    }
    
}
