import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{

    /**
     * Constructor for objects of class Background.
     * 
     */
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ground ground = new Ground();
        addObject(ground,163,328);
        ground.setLocation(140,330);
        Player player = new Player();
        addObject(player,77,293);
        player.setLocation(60,294);
        Player player2 = new Player();
        addObject(player2,177,284);
        player2.setLocation(93,288);
        player.setLocation(74,284);
        player.setLocation(161,302);
        player.setLocation(161,302);
        removeObject(player);
        Ground ground2 = new Ground();
        addObject(ground2,324,153);
        ground2.setLocation(302,152);
        ground.setLocation(148,144);
        player2.setLocation(67,109);
    }
}
