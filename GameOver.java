import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * displys when game is over
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    Label titleLabel = new Label("Game Over", 50);
    Label timeLabel = new Label("You jumped: " + HorseWorld.getScore() + " m.", 35);
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 330, 1);
        
        // "Game Over".
        addObject(titleLabel, getWidth()/2, 100);
        // Survived time.
        addObject(timeLabel, getWidth()/2, 200);
        
        // Return arrow.
        Return back = new Return();
        addObject(back, 560, 297);
    }
}
