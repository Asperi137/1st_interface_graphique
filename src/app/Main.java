package app;

import interface_graphique.FramePrincipal;

public class Main {
    public static void main(String[] args) {
        try {
            FramePrincipal FP = new FramePrincipal();
            FP.setVisible(true);
        } catch (Exception e) {
            System.out.println("probleme");
        }
    }
}
