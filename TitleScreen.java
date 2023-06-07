import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLabel  = new Label("G11 CS Games Commission", 40);
    Label gameOne = new Label("Faliure Game Don't click or hurts your eyes", 30);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        addObject(titleLabel, getWidth()/2, getHeight()/5);
        
        addObject(gameOne, getWidth()/2, 300);
    }
    
    public void act(){
        Greenfoot
        
    }
    
}
