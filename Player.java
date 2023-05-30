import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int vSpeed = 0;
    private final int acceleration = 1;
    private int jumpHeight = -8;
    
    
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move();
        checkFalling();
    }
    
    //falls when player is off the grouond
    private void fall(){
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }
    
    //horizontal movement of player
    public void move(){
        if(Greenfoot.isKeyDown("A"))
        {
            move(-4);
            
            //facing = "left";
        }else if(Greenfoot.isKeyDown("D")){
            move(4);
            //facing = "right";
        }
        
        if(Greenfoot.isKeyDown("space")){
            vSpeed = jumpHeight;
            fall();
        }
    }
    
    //boolean for on Ground
    private boolean onGround(){
        Actor under = getOneObjectAtOffset(0,getImage().getHeight()/2, Ground.class);
        return under != null;
    }
    
    //execeute fall if not on ground
    public void checkFalling(){
        if(onGround() == false){
            fall();
        }
        if(onGround() == true){
            vSpeed = 0;
        }
    }
    
   
    
}
