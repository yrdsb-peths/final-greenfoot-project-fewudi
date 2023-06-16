import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The game world settings 
 * 
 * @author (your name) Felix Peng 
 * @version (a version number or a date)June 8
 */
public class HorseWorld extends World
{
    public static int score = 0;
    public static Label scoreLabel;
    public static Label liveLabel;
    /**
     * Constructor for objects of class HorseWorld.
     * 
     */
    
    public void act()
    {
        if(true)
        {
            addObject(new Tree(), 580, 300);
        }
    }
    
    public HorseWorld()
    {    
        super(600, 330, 1);
        addObject(new Kangroo(), 86, 271);
        
        scoreLabel = new Label(0, 25);
        addObject(scoreLabel, 530, 30);
        
        liveLabel = new Label("Live: " + Kangroo.getLive(), 25);
        addObject(liveLabel, 50, 50);
        
        increaseScore();
    }
    public static void increaseScore()
    {
        score += 1;
        scoreLabel.setValue("In-air: " + score);
    }
    public static int getScore()
    {
        return score;
    }
    public static void decreaseLive(int x)
    {
        liveLabel.setValue("Live: " + Kangroo.getLive());
    }
}
