import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lines here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lines extends Actor
{
    public void addedToWorld(World world)
    {
        int d=20;
        GreenfootImage image=new GreenfootImage(world.getWidth()-10, d);
        image.setColor(Color.BLACK);
        image.fill();
        setImage(image);
    }
    
    /**
     * Act - do whatever the Lines wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
