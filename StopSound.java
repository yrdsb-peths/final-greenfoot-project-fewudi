import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StopSound here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StopSound extends Actor
{
    /**
     * Act - do whatever the StopSound wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)) {
            FirstWorld.stop();
        }
    }
    
    public StopSound()
    {
        GreenfootImage img = new GreenfootImage("VolumeNo v2.png");
        img.scale(img.getWidth()/5, img.getHeight()/5);
        setImage(img);
    }
}
