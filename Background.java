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
        super(1000, 600, 1); 
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
        ground.setLocation(91,348);
        ground2.setLocation(300,298);
        ground.setLocation(179,340);
        ground2.setLocation(268,302);
        Ground ground3 = new Ground();
        addObject(ground3,540,263);
        ground3.setLocation(492,261);
        Ground ground4 = new Ground();
        addObject(ground4,697,352);
        ground4.setLocation(672,351);
        player2.setLocation(79,294);
        ground2.setLocation(277,297);
        ground.setLocation(124,352);
        ground2.setLocation(306,295);
        ground2.setLocation(297,273);
        ground3.setLocation(436,201);
        ground4.setLocation(663,341);
        Cloud cloud = new Cloud();
        addObject(cloud,140,67);
        Cloud cloud2 = new Cloud();
        addObject(cloud2,309,22);
        Cloud cloud3 = new Cloud();
        addObject(cloud3,618,96);
        Cloud cloud4 = new Cloud();
        addObject(cloud4,448,85);
        cloud3.setLocation(652,59);
        cloud4.setLocation(459,71);
        cloud.setLocation(112,84);
        cloud2.setLocation(315,19);
        cloud3.setLocation(637,55);
        cloud4.setLocation(468,74);
        ground.setLocation(118,504);
        ground2.setLocation(333,436);
        ground4.setLocation(513,370);
        ground3.setLocation(455,323);
        ground4.setLocation(652,378);
        ground3.setLocation(531,313);
        player2.setLocation(62,462);
        Cloud cloud5 = new Cloud();
        addObject(cloud5,785,28);
        Cloud cloud6 = new Cloud();
        addObject(cloud6,896,114);
        Backwuhu backwuhu = new Backwuhu();
        addObject(backwuhu,818,460);
        Backwuhu backwuhu2 = new Backwuhu();
        addObject(backwuhu2,476,491);
        Backwuhu backwuhu3 = new Backwuhu();
        addObject(backwuhu3,190,389);
        Backwuhu backwuhu4 = new Backwuhu();
        addObject(backwuhu4,716,553);
        Backwuhu backwuhu5 = new Backwuhu();
        addObject(backwuhu5,482,384);
    }
}
