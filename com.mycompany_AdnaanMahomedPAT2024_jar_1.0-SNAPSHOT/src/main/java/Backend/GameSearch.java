/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.io.File;
import java.util.List;


/**
 *
 * @author Adnaa
 */
public class GameSearch {
    public static List<String> paths;
    public static List<String> names;
    
    public static List<String> searchForExeFiles(File directory) {
        //directory = where searching
        //List var used to easily add them to JLists in frontend
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            //Lists all files 
            if (files != null) {
                for (File found : files) {
                    // indicates that the loop should run for the length of files while assigning the next value into found
                    if (found.isDirectory()) {
                        // Searches for exe files
                        searchForExeFiles(found);
                    } else if (found.getName().toLowerCase().endsWith(".exe")) {
                        // Stores path and name 
                        paths.add(found.getAbsolutePath());
                        names.add(found.getName());
                    }
                }
            }
        }
        return names;
    }
    
    public static List<String> getPaths(){
        return paths;
    }
}
