import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GrosserBruder extends Actor
{
    public void act() 
    {
        move(2);
        if(Greenfoot.getRandomNumber(50) == 0)
            if(Greenfoot.getRandomNumber(1) == 0)
                turn(45);
            else
                turn(-45);

        if(isTouching(Spieler.class))
            Greenfoot.stop();
    }    
}
