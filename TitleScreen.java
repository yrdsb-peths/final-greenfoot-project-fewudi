import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Google offline GamePlus ", 30);
    Label spaceLabel = new Label("Press <space> to Start", 25);
    Label instrucLabel = new Label("Use space & a", 25);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 330, 1); 
        
        // Title Screen Game Description.
        addObject(titleLabel, getWidth()/2, 150);
        addObject(spaceLabel, getWidth()/2, 200);
        addObject(instrucLabel, getWidth()/2, 250);
        
        prepare();
    }
    
    public void act()
    {
        // Start the game if user presses the space bar.
        if(Greenfoot.isKeyDown("space")) {
            HorseWorld gameWorld = new HorseWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     * 
     */
    private void prepare()
    {
        Kangroo horse = new Kangroo();
        addObject(horse, 102, 245);
        
        Description description = new Description();
        addObject(description, 560, 290);
        
        Home home = new Home();
        addObject(home, 35, 35);
    }
}
