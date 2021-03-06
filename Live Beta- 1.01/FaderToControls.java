import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Fader that fades current screen into Game Controls screen.
 * 
 * @author (Jasper Tu) 
 * @version (January 2015)
 */
public class FaderToControls extends FaderType1
{
    private GreenfootSound menu = new GreenfootSound("MainMenuTrack.mp3");
    private Intro myWorld;

    /**
     * Act - do whatever the Fader wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        fade(fadeLevel = fadeLevel + 10);
        if (fadeLevel > 255)
        {
            Greenfoot.setWorld(new Controls()); // (myWorld.getTheme()));
        }
    }    

    public FaderToControls()
    {
        fade(0);
    }
}