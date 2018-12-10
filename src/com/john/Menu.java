package com.john;

import java.awt.*;

public class Menu {

    public Rectangle lvl1 = new Rectangle(960/4 + 120, 150,200,70);
    public Rectangle lvl2 = new Rectangle(960/4 + 120, 250, 200, 70);
    public Rectangle lvl3 = new Rectangle(960/4 + 120, 350, 200, 70);

    public void render(Graphics g){


        Graphics2D g2d = (Graphics2D) g;

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 960,512 );

        Font fnt = new Font("impact", Font.BOLD, 50);
        g.setFont(fnt);
        g.setColor(Color.BLUE);
        g.drawString("SPAIDRZ vs. DINOZORS", 965/4, 105);
        g.setColor(Color.WHITE);
        g.drawString("SPAIDRZ vs. DINOZORS", 960/4, 100);


        //LVL1
        g.setColor(Color.BLUE);
        g2d.draw(lvl1);
        g.setColor(Color.WHITE);
        g.drawString("Level 1", 960/4 + 155, 205);

        //LVL2
        g.setColor(Color.BLUE);
        g2d.draw(lvl2);
        g.setColor(Color.WHITE);
        g.drawString("Level 2", 960/4 + 155, 305);

        //LVL3
        g.setColor(Color.BLUE);
        g2d.draw(lvl3);
        g.setColor(Color.WHITE);
        g.drawString("Level 3", 960/4 + 155, 405);
    }
}