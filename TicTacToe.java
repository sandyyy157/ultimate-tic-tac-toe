import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TicTacToe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TicTacToe extends World
{
    private boolean xTurn;
    /**
     * Constructor for objects of class TicTacToe.
     * 
     */
    public TicTacToe()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(3, 3,100); 
        makeBoard();
        xTurn = true;
    }
    
    public boolean isXTurn() {
        return xTurn;
    }
    
    public void changeTurns() {
        xTurn = !xTurn;
    }
    
    public void makeBoard() {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                addObject(new BoardPiece(), x, y);
            }
        }
    }
}
