import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cloud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cloud extends Actor
{
    /**
     * Act - do whatever the Cloud wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    

    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("D")){
            move(-6);
        }
        if(getX() == 0){
            setLocation(getWorld().getWidth(), Greenfoot.getRandomNumber(100) + 30);
        }
    }
}
