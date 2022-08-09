import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dbConnection {

    Connection connection;

    String dbName;
    String tableName;

    public dbConnection("jdbc:mysql://localhost/gamelebah", "root", "", "lebah/", "gamelebah/") throws Exception {
    //this.dbName = dbName;
        System.out.println("starting connection");
        Class.forName(driver);
        System.out.println("driver loaded");
        connection = DriverManager.getConnection("jdbc:mysql://localhost/gamelebah", "root", "");
    }

}
public class MyWorld extends World
{
    private int score=11;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        setScore();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Bee bee = new Bee();
        addObject(bee,255,276);
    }
    public int getScore(){
        return score; 
    }
    public void setScore(){
        score = score - 1;
        showText("nilai dari database = " ); 
    }
}
