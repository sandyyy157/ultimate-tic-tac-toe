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
        super(3, 3, 100); 
        makeBoard();
        xTurn = true;
    }
    
    public boolean isXTurn(){
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
    
    public void act() {
        //schauen ob X gewinnt
        for (int x = 0; x <3; x++) {
            for (int y = 0; y < 3; y++) {
                if (getObjectsAt(x, y, X.class).size() > 0 &&
                    getObjectsAt(x + 1, y, X.class).size() > 0 &&
                    getObjectsAt(x + 2, y, X.class).size() > 0){
                        addObject(new Xwin(),3,3);
                        Greenfoot.stop();
                    }
                if (getObjectsAt(x, y, X.class).size() > 0 &&
                    getObjectsAt(x, y + 1, X.class).size() > 0 &&
                    getObjectsAt(x, y + 2, X.class).size() > 0){
                        addObject(new Xwin(), 3,3);;
                        Greenfoot.stop();
                    }
                if (getObjectsAt(x, y, X.class).size() > 0 &&
                    getObjectsAt(x + 1, y + 1, X.class).size() > 0 &&
                    getObjectsAt(x + 2, y + 2, X.class).size() > 0){
                        addObject(new Xwin(), 3,3);;
                        Greenfoot.stop();
                    }
                if (getObjectsAt(x, y, X.class).size() > 0 &&
                    getObjectsAt(x + 1, y - 1, X.class).size() > 0 &&
                    getObjectsAt(x + 2, y - 2, X.class).size() > 0){
                        addObject(new Xwin(), 3,3);
                        Greenfoot.stop();
                    }
            }
        }
        // schauen ob O gewinnt
        for (int x = 0; x <3; x++) {
            for (int y = 0; y < 3; y++) {
                if (getObjectsAt(x, y, O.class).size() > 0 &&
                    getObjectsAt(x + 1, y, O.class).size() > 0 &&
                    getObjectsAt(x + 2, y, O.class).size() > 0){
                        addObject(new Owin(),getWidth() / 2,getHeight() / 2);
                        Greenfoot.stop();
                    }
                if (getObjectsAt(x, y, O.class).size() > 0 &&
                    getObjectsAt(x, y + 1, O.class).size() > 0 &&
                    getObjectsAt(x, y + 2, O.class).size() > 0){
                        addObject(new Owin(),getWidth() / 2,getHeight() / 2);
                        Greenfoot.stop();
                    }
                if (getObjectsAt(x, y, X.class).size() > 0 &&
                    getObjectsAt(x + 1, y + 1, O.class).size() > 0 &&
                    getObjectsAt(x + 2, y + 2, O.class).size() > 0){
                        addObject(new Owin(),getWidth() / 2,getHeight() / 2);
                        Greenfoot.stop();
                    }
                if (getObjectsAt(x, y, O.class).size() > 0 &&
                    getObjectsAt(x + 1, y - 1, O.class).size() > 0 &&
                    getObjectsAt(x + 2, y - 2, O.class).size() > 0){
                        addObject(new Owin(),getWidth() / 2,getHeight() / 2);
                        Greenfoot.stop();
                    }
            }
        }
        
    }
}
