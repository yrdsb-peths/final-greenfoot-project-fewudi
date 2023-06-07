import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ground extends Actor
{
    /**
     * Act - do whatever the Ground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Ground(){
        getImage().scale(getImage().getWidth() / 5, getImage().getHeight()/6);
    }
    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("A"))
        {
            move(4);
            
            //facing = "left";
        }else if(Greenfoot.isKeyDown("D")){
            move(-4);
            //facing = "right";
        }
        if(Greenfoot.isKeyDown("D")){
            move(-6);
        }
        if(getX() == 0){
            setLocation(getWorld().getWidth(), Greenfoot.getRandomNumber(400) + 30);
        }
    }
}
