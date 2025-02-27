package Devices;

import features.MusicPlayer;
import features.Phone;
import features.WebBrowser;
import Implementations.MusicPlayerImpl;
import Implementations.PhoneImpl;
import Implementations.WebBrowserimpl; 

public class Iphone {
    public static void main(String[] args) {
        // Instanciação das implementações
        MusicPlayer musicPlayer = new MusicPlayerImpl();
        Phone phone = new PhoneImpl();
        WebBrowser webBrowser = new WebBrowserimpl();
        
        // Testando funcionalidades
        System.out.println("=== Testando Reprodutor de Música ===");
        musicPlayer.play();
        musicPlayer.pause();
        musicPlayer.stop();
        
        System.out.println("\n=== Testando Telefone ===");
        phone.call("+55 11 98765-4321");
        phone.endCall();
        phone.sendMessage("+55 11 98765-4321", "Olá, tudo bem?");
        
        System.out.println("\n=== Testando Navegador ===");
        webBrowser.openPage("https://www.apple.com");
        webBrowser.refresh();
        webBrowser.goBack();
    }
}
