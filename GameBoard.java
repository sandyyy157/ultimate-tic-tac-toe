import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameBoard extends World
{
    private int [] Box=new int[9];
    private int delta=200, TURN=0; //Breite von der Welt durch 3
    private boolean GAMEOVER=false;
    private int WINNER=-1;
    /**
     * Constructor for objects of class GameBoard.
     * 
     */
    public GameBoard()
    {    
        // Create a new worl  d with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        
        Lines line=new Lines();
        addObject(line,delta,(int)(0.5*getHeight()));
        line.setRotation(90);
        
        line=new Lines();
        addObject(line, 2*delta, (int)(0.5*getHeight()));
        line.setRotation(90);
        
        line=new Lines();
        addObject(line, (int)(0.5*getWidth()),delta);
    }
}
