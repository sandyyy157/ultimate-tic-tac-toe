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
     * X und O können auf dem Board hinzugefügt werden.
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
