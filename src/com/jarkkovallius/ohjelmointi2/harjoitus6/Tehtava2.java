package com.jarkkovallius.ohjelmointi2.harjoitus6;

import javax.swing.*;
import java.awt.*;

/**
 * Kirjoita	yksinkertaisen	laskin-ohjelman	käyttöliittymä Swing-kirjastoa	käyttäen alla
 olevan	kuvan	mukaisesti.	Ohjelmassa	ei	tarvitse	olla	toiminnallisuutta.
 *
 * Created by Jarkko on 23.2.2017.
 */
public class Tehtava2 {
    public static void main(String[] args) {

        final int FRAME_WIDTH = 400 ;
        final int FRAME_HEIGHT = 300 ;
        final int PADDING = 5 ;
        final String FRAME_TITLE = "Swing-laskin";
        final String [] LEFT_PANEL_CONTENT = new String []{"1", "2", "3", "4", "5", "6", "7", "8" ,"9", "0"};
        final String [] RIGHT_PANEL_CONTENT = new String []{"+", "-", "*", "/", "="};
        final Color LEFT_PANEL_BACKGROUND_COLOR = Color.GREEN;
        final Color RIGHT_PANEL_BACKGROUND_COLOR = Color.ORANGE;


        JFrame frame = new JFrame() ;
        frame.setTitle(FRAME_TITLE);
        frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        frame.setLocationRelativeTo(null);

        // build left panel
        JPanel panelLeft = new JPanel();
        panelLeft.setLayout(new GridLayout(4, 3, PADDING, PADDING));
        panelLeft.setBackground(LEFT_PANEL_BACKGROUND_COLOR);
        panelLeft.setBorder(BorderFactory.createEmptyBorder(PADDING, PADDING, PADDING, PADDING));
        for (String s : LEFT_PANEL_CONTENT) {
            panelLeft.add(constructButton(s, LEFT_PANEL_BACKGROUND_COLOR));
        }

        // build right panel
        JPanel panelRight = new JPanel();
        panelRight.setLayout(new GridLayout(4, 2, PADDING, PADDING));
        panelRight.setBackground(RIGHT_PANEL_BACKGROUND_COLOR);
        panelRight.setBorder(BorderFactory.createEmptyBorder(PADDING, PADDING, PADDING, PADDING));
        for (String s : RIGHT_PANEL_CONTENT) {
            panelRight.add(constructButton(s, RIGHT_PANEL_BACKGROUND_COLOR));
        }

        // set layouts
        frame.setLayout(new GridBagLayout());
        frame.add(new JTextField(), constructGridBagConstraints(0,0,2,1, 1f, 0.1f));
        frame.add(panelLeft, constructGridBagConstraints(0, 1, 1, 1, 0.6f, 0.9f));
        frame.add(panelRight, constructGridBagConstraints(1,1,1,1, 0.4f, 0.9f));

        // show frame
        frame.setVisible(true);

    }

    public static GridBagConstraints constructGridBagConstraints(int x, int y, int width, int height, double weightX, double weightY) {
        GridBagConstraints g = new GridBagConstraints();
        g.gridx = x ;
        g.gridy = y ;
        g.gridwidth = width;
        g.gridheight = height;
        g.fill = 1 ;
        g.weightx = weightX;
        g.weighty = weightY ;
        return g ;
    }

    public static JButton constructButton(String text, Color borderColor) {
        JButton button = new JButton();
        button.setText(text);
        button.setBackground(Color.WHITE);
        button.setBorder(BorderFactory.createLineBorder(borderColor, 1, true));

        return button;
    }

}
