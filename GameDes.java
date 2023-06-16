import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameDes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameDes extends World
{
    Label descriptionLabel0 = new Label("Google offline Game Plus", 50);
    Label descriptionLabel1 = new Label("Always avoid the blocks !", 20);
    Label descriptionLabel2 = new Label("Space to jump, a to dodge.", 20);
    Label descriptionLabel3 = new Label("Each time you press a, you only have 3 seconds.", 20);
    Label descriptionLabel4 = new Label("Game will ends after you touched the block !", 20);
    Label descriptionLabel5 = new Label("Have fun!", 20);
    /**
     * Constructor for objects of class GameDes.
     * 
     */
    public GameDes()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 330, 1);
        
        // Game Descriptions.
        addObject(descriptionLabel0, 300, 70);
        addObject(descriptionLabel1, 300, 150);
        addObject(descriptionLabel2, 300, 180);
        addObject(descriptionLabel3, 300, 210);
        addObject(descriptionLabel4, 300, 240);
        addObject(descriptionLabel5, 300, 270);
        
        // Return arrow.
        Return back = new Return();
        addObject(back, 560, 297);
    }
}
