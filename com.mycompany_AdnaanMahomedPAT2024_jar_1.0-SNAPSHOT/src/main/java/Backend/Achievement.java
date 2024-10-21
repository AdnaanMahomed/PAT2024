/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adnaa
 */
public class Achievement {
    private String name;
    private boolean isComplete;
    private LocalDateTime whenCompleted;
    private int gameId;

    
    public static void GoalAdd(String Mname, LocalDate Mwhen, int Mid, boolean Mcompleted){
        try {

            GamesDB.connect();
            GamesDB.update("INSERT INTO gamesdb.achievements (name, whenComplete, games, isComplete)" + "VALUES (" + Mname + "," + Mwhen + "," + Mid + "," + Mcompleted);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void Completed(int Mid, LocalDate Mwhen){
        try {
            AchieveDB.connect();
            AchieveDB.update("UPDATE gamesdb.achievements" + " SET isComplete = true" + " WHERE game = " + Mid);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Achievement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Achievement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
