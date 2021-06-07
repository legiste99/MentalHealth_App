package za.ac.cput.mentalhealthapp;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class HomeScreen extends JFrame{

    private JPanel frame;
    Dimension ss = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension frameSize = new Dimension(360,600);

    public HomeScreen(){

        int width = ss.width/2 - frameSize.width/2;
        int hight = ss.height/2 - frameSize.height/2;


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(width,hight,360,600);
        setResizable(false);
        frame = new JPanel();
        frame.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(frame);
        frame.setLayout(null);

        // DISPLAYS BIG TITLE
        JLabel title = new JLabel("Affirmation");
        title.setFont(new Font("Comic Sans MS",Font.BOLD, 42));
        title.setForeground(Color.WHITE);
        title.setBounds(65,50,360,50);
        frame.add(title);

        // DISPLAYS SLOGAN
        JLabel slogan = new JLabel("You don't have to struggle in silence");
        slogan.setFont(new Font("Comic Sans MS",Font.BOLD, 18));
        slogan.setBounds(10,100,360,50);
        frame.add(slogan);

        //DISPLAY LOGO_LIKE IMAGE
        BufferedImage logoImage = null;
        try {
            logoImage = ImageIO.read(new File("affirmation_logo_alt.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        JLabel logoLabel = new JLabel();
        logoLabel.setIcon(new ImageIcon(logoImage));
        logoLabel.setBounds(15,170, 320, 230);
        frame.add(logoLabel);


        // DISPLAY ABOUT BUTTON
        JButton btnAbout = new JButton("About");
        btnAbout.setBackground(new Color(0,162,232));
        btnAbout.setForeground(Color.WHITE);
        btnAbout.setFont(new Font("Comic Sans MS",Font.BOLD, 21));
        btnAbout.setBounds(40, 430,120, 40);
        frame.add(btnAbout);

        // DISPLAY SIGNUP BUTTON
        JButton btnSignup = new JButton("Sign Up");
        btnSignup.setBackground(new Color(0,162,232));
        btnSignup.setForeground(Color.WHITE);
        btnSignup.setFont(new Font("Comic Sans MS",Font.BOLD, 21));
        btnSignup.setBounds(200, 430,120, 40);
        frame.add(btnSignup);

        // DISPLAY CLICKABLE SIGN IN TEXT
        JButton btnSignIn = new JButton("Already have an account? login here.");
        btnSignIn.setOpaque(false);
        btnSignIn.setContentAreaFilled(false);
        btnSignIn.setBorderPainted(false);
        btnSignIn.setForeground(Color.BLACK);
        btnSignIn.setBounds(55,500, 250, 25);
        frame.add(btnSignIn);


        // DISPLAY BACKGROUND IMAGE (BLUE AND WHITE)
        BufferedImage bgImage = null;
        try {
            bgImage = ImageIO.read(new File("bg_image.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        JLabel background = new JLabel();
        background.setIcon(new ImageIcon(bgImage));
        background.setBounds(0,0, 360, 600);
        frame.add(background);

        // BUTTON FUNCTIONALITY

        btnAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btnSignup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();
                SignUpPage frame = new SignUpPage();
                frame.setVisible(true);

            }
        });

        btnSignIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run(){
                try {
                    HomeScreen frame = new HomeScreen();
                    frame.setVisible(true);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
}
