package org.com.newyear;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;


public class newYear implements ActionListener {
    JButton yes = new JButton("Yes, I am \uD83D\uDE0A");

    JButton no = new JButton("No, I'm not \uD83D\uDE15");
    JButton restart = new JButton("Restart");
    JPanel yesPanel = new JPanel();
    JLabel spiritLabel = new JLabel("\u2728That's the spirit!\u2728");
    JLabel yearLaber = new JLabel("\u2728Happy New Year!\u2728");


    newYear(){
        JFrame frame = new JFrame("New Year Program");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(600,600);

        Color dm = new Color(24, 28,34);
        JPanel panel = new JPanel();
        panel.setBackground(dm);
        panel.setSize(600,600);
        panel.setLayout(null);

        yes.setBounds(150,300,120,60);
        yes.setFont(new Font("yes",Font.BOLD,15));
        yes.setBackground(dm);
        yes.setForeground(Color.black);
        yes.setFocusable(false);
        yes.addActionListener(this);

        no.setBounds(325,300,120,60);
        no.setFont(new Font("no",Font.BOLD,15));
        no.addActionListener(this);
        no.setBackground(dm);
        no.setForeground(Color.black);
        no.setFocusable(false);

        JLabel ard = new JLabel("2024 is coming. Are you ready?");



        ard.setFont(new Font("Anatolie Molosag", Font.BOLD, 30));
        ard.setBounds(50,25,600,200);
        ard.setForeground(Color.white);


        yesPanel.setBackground(dm);
        yesPanel.setSize(600,600);
        yesPanel.setLayout(null);


        spiritLabel.setFont(new Font("spirit label", Font.BOLD, 41));
        spiritLabel.setBounds(75,50,500,200);
        spiritLabel.setForeground(Color.white);
        spiritLabel.setVisible(false);

        yearLaber.setFont(new Font("year label", Font.BOLD, 41));
        yearLaber.setBounds(75,125,500,200);
        yearLaber.setForeground(Color.white);
        yearLaber.setVisible(false);


        restart.setBounds(100,300,80,50);
        restart.setBackground(dm);
        restart.setForeground(Color.black);
        restart.setFocusable(false);
        restart.addActionListener(this);
        restart.setVisible(false);

        yesPanel.add(spiritLabel);
        yesPanel.add(yearLaber);
        yesPanel.add(restart);
        yesPanel.setVisible(false);

        frame.add(yesPanel);
        frame.add(panel);
        panel.add(ard);
        panel.add(yes);
        panel.add(no);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int x, y, luck;
        x =  ThreadLocalRandom.current().nextInt(200 + 50, 400 + 50);
        y = ThreadLocalRandom.current().nextInt(200 + 50, 400 + 50);
        luck = ThreadLocalRandom.current().nextInt(1 + 50,8 + 50);
        if (e.getSource() == no){
            no.setBounds(x,y,120,60);
        }
        if (e.getSource() ==  yes){

            spiritLabel.setVisible(true);
            yearLaber.setVisible(true);
            yesPanel.setVisible(true);
            yes.setVisible(false);
            restart.setVisible(true);
            no.setVisible(false);

        }
        if(e.getSource() == restart){
            yesPanel.setVisible(false);
            yes.setVisible(true);
            no.setVisible(true);
            spiritLabel.setVisible(false);
            yearLaber.setVisible(false);
        }
    }

}
