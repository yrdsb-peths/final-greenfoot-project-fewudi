import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Backwuhu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Backwuhu extends Actor
{
    /**
     * Act - do whatever the Backwuhu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("D")){
            move(-10);
        }
        if(getX() == 0){
            setLocation(getWorld().getWidth(), Greenfoot.getRandomNumber(400) + 30);
        }
    }
}
