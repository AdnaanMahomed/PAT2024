/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adnaa
 */
public class Launcher {
    public static Process p;
    private static LocalTime startTime;
    private static LocalTime endTime;

    public static void runGame(String game) {
        try {
            Runtime play = Runtime.getRuntime();
            p = play.exec(game);
        } catch (IOException ex) {
            Logger.getLogger(Launcher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void endGame(){
        p.destroy();
    }
    
    public static LocalTime getTime(){
        LocalTime playTime = null;
        Duration.between(startTime, endTime).addTo(playTime);
        return playTime;
    }
}
