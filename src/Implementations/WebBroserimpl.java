package Implementations;

import features.WebBroser;

public class WebBroserimpl implements WebBroser{
    @Override
    public void openPage(String url){
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void refresh() {
        System.out.println("Recarregando página...");
    }

    @Override
    public void goBack() {
        System.out.println("Voltando para a página anterior");
    }
}
