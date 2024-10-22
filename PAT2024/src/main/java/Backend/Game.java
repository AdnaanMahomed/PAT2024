/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;



import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adnaa
 */
public class Game {
    private static String path;
    private static String name;
    private static LocalTime playTime;
    private static LocalDate lastPlayed;
    private static int id;
    

    public Game(String path, String name, LocalTime playTime, LocalDate lastPlayed, int id) {
        this.path = path;
        this.name = name;
        this.playTime = playTime;
        this.lastPlayed = lastPlayed;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public static String getPath() {
        return path;
    }

    public LocalTime getPlayTime() {
        return playTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setPlayTime(LocalTime playTime) {
        this.playTime = playTime;
    }
    
    public static void GameAdd(String Mpath, String Mname, int Mid, int Mhours){
        try {

            GamesDB.connect();
            GamesDB.update("INSERT INTO gamesdb.games (Names, Directory, HoursPlayed, TimesPlayed)" + "VALUES (" + Mname + "," + Mpath + "," + Mhours + "," + 0);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
