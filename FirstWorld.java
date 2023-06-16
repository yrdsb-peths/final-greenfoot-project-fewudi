import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game meue , music control
 * 
 * @Felix P 
 * @version June 7
 */
public class FirstWorld extends World
{
    public static GreenfootSound backgroundMusic = new GreenfootSound("background music v2.mp3");
    Label playThis = new Label("to play this", 20);
    /**
     * Constructor for objects of class FirstWorld.
     * 
     */
    public FirstWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 330, 1);
        
        
        Label welcomeLabel = new Label("Choose a game.", 40);
        addObject(welcomeLabel, 300, 100);
        
       
        
        Kangroo kangaroo = new Kangroo();
        addObject(kangaroo, 450, 220);
        
        Sound sound = new Sound();
        addObject(sound, 40, 290);
        
        StopSound stopsound = new StopSound();
        addObject(stopsound, 100, 290);
        
        Label playThis3 = new Label("to play this", 20);
        addObject(playThis3, 450, 260);
    }
    public void act()
    {
        
        if(Greenfoot.isKeyDown("3") || Greenfoot.mouseClicked(Kangroo.class)) {
            TitleScreen titleScreen = new TitleScreen();
            Greenfoot.setWorld(titleScreen);
        }
    }
    
    // Stop background Music.
    public static void stop()
    {
        backgroundMusic.stop();
    }
    
    // Start background Music.
    public static void music()
    {
        backgroundMusic.playLoop();
    }
}
