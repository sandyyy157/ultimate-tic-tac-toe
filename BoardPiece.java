import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BoardPiece here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BoardPiece extends Actor
{
    /**
     * Act - do whatever the BoardPiece wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            TicTacToe game = getWorldOfType(TicTacToe.class);
            if (game.isXTurn()) {
                game.addObject(new X(), getX(), getY());
                game.changeTurns();
            }else{
                game.addObject(new O(), getX(), getY());
                game.changeTurns();
            }
            }
        }
    }
