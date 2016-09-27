package net.minecraftforge.client.gui;

import java.util.Collection;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * An abstract class which can be extended to make reusable parts of a gui(e.g. progress bars, liquid tanks, energy storages, etc.). 
 */
@SideOnly(Side.CLIENT)
public abstract class GuiElement
{
    /**
     * Put your element rendering code here.
     * 
     * @param mouseX A X position of the cursor
     * @param mouseY A Y position of the cursor
     */
    public abstract void draw(int mouseX, int mouseY);
    
    /**
     * @return A X position of the element
     */
    public abstract int getX();
    
    /**
     * @return A Y position of the element
     */
    public abstract int getY();
    
    /**
     * Draws all elements from a collection(e.g. List)
     * 
     * @param collection
     * @param mouseX A X position of the cursor
     * @param mouseY A Y position of the cursor
     */
    public static void drawElementsFromCollection(Collection<GuiElement> collection, int mouseX, int mouseY)
    {
        for (GuiElement e : collection)
        {
            e.draw(mouseX, mouseY);
        }
    }
}
