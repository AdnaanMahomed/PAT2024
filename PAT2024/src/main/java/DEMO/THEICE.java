/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DEMO;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Adnaa
 */
//I.C.E, game manager
public class THEICE {

    public static void main(String[] args) {
        String[] games = new String[10];
        int size = 0;
        int howman = Integer.parseInt(JOptionPane.showInputDialog("how many games you adding?"));
        for (size = 0; size < howman; size++) {
            games[size] = JOptionPane.showInputDialog("enter path of game");
            System.out.println("Your game's index is: " + size);
        }

        try {
            for (int i = 0; i > -1; i++) {
                int index = Integer.parseInt(JOptionPane.showInputDialog("enter game index to play. enter negetive to end"));
                Process p;
                if (index > -1) {
                    Runtime game = Runtime.getRuntime();
                    p = game.exec(games[index]);
                } else {
                    break;
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(THEICE.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
