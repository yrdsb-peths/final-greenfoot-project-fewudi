import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tree extends Actor
{
    private boolean start = true;
    
    /**
     * Will add tree to world randomly,
     * After the tree is added, move to the left with speed of 6.
     */
    public void act()
    {
        if(Kangroo.alive)
        {
            if(start)
            {
                start = false;
                setLocation(0, 0);
                if(Greenfoot.getRandomNumber(35)==0)
                {
                    setLocation(580, 271);
                }
            }
            move(-6);
            
            if(isAtEdge())
            {
                getWorld().removeObject(this);
            }
        }
    }
}
