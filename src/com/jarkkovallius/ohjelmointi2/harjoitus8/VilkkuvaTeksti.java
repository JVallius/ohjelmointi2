package com.jarkkovallius.ohjelmointi2.harjoitus8;

/**
 * Created by Jarkko on 12.3.2017.
 */
/**
 * @(#)Vilkkuva_Teksti.java
 *
 *
 * @author
 * @version 1.00 2011/4/27
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VilkkuvaTeksti extends JPanel implements Runnable {
    private JLabel jlblTeksti = new JLabel("Tervetuloa", JLabel.CENTER);
    private boolean kaynnissa;
    public static int speed = 400 ;


    public VilkkuvaTeksti() {
        add(jlblTeksti);
        new Thread(this).start();
        kaynnissa = true;
    }

    public void lopetaVilkutus() {
        kaynnissa = false;
        System.out.println("Suoritus keskeytetty");

    }

    /** Asetetaan teksti nkyville/piiloon joka 200 millisekunti */
    public void run() {
        try {
            while (kaynnissa) {
                if (jlblTeksti.getText().equals(""))
                    jlblTeksti.setText("Tervetuloa");
                else
                    jlblTeksti.setText("");

                Thread.sleep(speed);
            }
        }
        catch (InterruptedException ex) {
        }

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame kehys = new JFrame("VilkkuvaTeksti");
                JButton interruptButton = new JButton("Lopeta");
                JPanel panel = new JPanel(new BorderLayout());
                VilkkuvaTeksti teksti = new VilkkuvaTeksti();
                panel.add(teksti, BorderLayout.CENTER);
                panel.add(interruptButton, BorderLayout.NORTH);

                JButton speedButtonSlow = new JButton("hidas");
                speedButtonSlow.addActionListener(new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        speed = 1000 ;
                    }
                });

                JButton speedButtonMedium = new JButton("keski");
                speedButtonMedium.addActionListener(new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        speed = 500 ;
                    }
                });

                JButton speedButtonHigh = new JButton("nopea");
                speedButtonHigh.addActionListener(new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        speed = 100 ;
                    }
                });



                panel.add(speedButtonHigh, BorderLayout.EAST);
                panel.add(speedButtonMedium, BorderLayout.SOUTH);
                panel.add(speedButtonSlow, BorderLayout.WEST);





                interruptButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        teksti.lopetaVilkutus();

                    }
                } );

                kehys.add(panel);
                kehys.setLocationRelativeTo(null);
                kehys.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                kehys.setSize(200, 200);
                kehys.setVisible(true);
            }
        });
    }

}
