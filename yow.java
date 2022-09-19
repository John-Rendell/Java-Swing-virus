import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class yow {
    int x = 0, y = 0;
    //frame 1
    JFrame f = new JFrame("Sa Jabe bida ang saya!!!! hehe");
    JLabel bg = new JLabel();
    ImageIcon woo = new ImageIcon(new ImageIcon("C:\\Users\\john rendell\\OneDrive\\Desktop\\Java Swing Projects\\My own Java Virus stuff\\img\\jollibee.gif").getImage().getScaledInstance(500,500, Image.SCALE_DEFAULT));
    File file = new File("C:\\Users\\john rendell\\OneDrive\\Desktop\\Java Swing Projects\\My own Java Virus stuff\\img\\Video Game Reward Sound\uD83D\uDD0A ⧸ Sound Effect (HD).wav");
    AudioInputStream au = AudioSystem.getAudioInputStream(file);
    Clip clip = AudioSystem.getClip();

    //frame 2
    JFrame f2 = new JFrame("Surprise mf");
    JLabel bg2 = new JLabel();
    ImageIcon woo2 = new ImageIcon(new ImageIcon("C:\\Users\\john rendell\\OneDrive\\Desktop\\Java Swing Projects\\My own Java Virus stuff\\img\\stare-looking.gif").getImage().getScaledInstance(500,500, Image.SCALE_DEFAULT));
    File file2 = new File("C:\\Users\\john rendell\\OneDrive\\Desktop\\Java Swing Projects\\My own Java Virus stuff\\img\\Surprise Mother F cker ⧸ sound effect.wav");
    AudioInputStream au1 = AudioSystem.getAudioInputStream(file2);
    Clip clip2 = AudioSystem.getClip();

    //frame 3
    JFrame f3 = new JFrame("Are you serious?");
    JLabel bg3 = new JLabel();
    ImageIcon woo3 = new ImageIcon(new ImageIcon("C:\\Users\\john rendell\\OneDrive\\Desktop\\Java Swing Projects\\My own Java Virus stuff\\img\\isthisN.gif").getImage().getScaledInstance(500,500, Image.SCALE_DEFAULT));
    File file3 = new File("C:\\Users\\john rendell\\OneDrive\\Desktop\\Java Swing Projects\\My own Java Virus stuff\\img\\isthisN.wav");
    AudioInputStream au3 = AudioSystem.getAudioInputStream(file3);
    Clip clip3 = AudioSystem.getClip();

    //frame 4
    JFrame f4 = new JFrame("SUSSY MODE");
    JLabel bg4 = new JLabel();
    ImageIcon woo4 = new ImageIcon(new ImageIcon("C:\\Users\\john rendell\\OneDrive\\Desktop\\Java Swing Projects\\My own Java Virus stuff\\img\\sus.gif").getImage().getScaledInstance(500,500, Image.SCALE_DEFAULT));
    File file4 = new File("C:\\Users\\john rendell\\OneDrive\\Desktop\\Java Swing Projects\\My own Java Virus stuff\\img\\sus.wav");
    AudioInputStream au4 = AudioSystem.getAudioInputStream(file4);
    Clip clip4 = AudioSystem.getClip();

    yow() throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        f.setBounds(x, y, 500,500);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.add(bg);

        bg.setVisible(true);
        bg.setIcon(woo);

        f.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                randomLocation();
            }

            @Override
            public void windowClosing(WindowEvent ie) {
                Random r = new Random();
                int window = 4;
                int random = r.nextInt(window);

                try {
                    new yow();
                    new yow();
                } catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
                    e.printStackTrace();
                }

                if(random == 1){
                    try {
                        clip.open(au);
                    } catch (LineUnavailableException | IOException e) {
                        e.printStackTrace();
                    }
                    clip.start();
                }

                else if(random == 2){
                    //f2
                    Random r2 = new Random();
                    int limit = 500;
                    int random2 = r2.nextInt(limit);

                    f3.setBounds(random2, random2, 500,500);
                    f3.setResizable(false);
                    f3.setLocationRelativeTo(null);
                    f3.setVisible(true);
                    f3.add(bg3);

                    bg3.setVisible(true);
                    bg3.setIcon(woo3);

                    try {
                        clip3.open(au3);
                    } catch (LineUnavailableException | IOException e) {
                        e.printStackTrace();
                    }
                    clip3.start();
                }

                else if(random == 3){
                    //f3
                    Random r2 = new Random();
                    int limit = 500;
                    int random2 = r2.nextInt(limit);

                    f4.setBounds(random2, random2, 500,500);
                    f4.setResizable(false);
                    f4.setLocationRelativeTo(null);
                    f4.setVisible(true);
                    f4.add(bg4);

                    bg4.setVisible(true);
                    bg4.setIcon(woo4);

                    try {
                        clip4.open(au4);
                    } catch (LineUnavailableException | IOException e) {
                        e.printStackTrace();
                    }
                    clip4.start();
                }

                else {
                    //f2
                    Random r2 = new Random();
                    int limit = 500;
                    int random2 = r2.nextInt(limit);

                    f2.setBounds(random2, random2, 500,500);
                    f2.setResizable(false);
                    f2.setLocationRelativeTo(null);
                    f2.setVisible(true);
                    f2.add(bg2);

                    bg2.setVisible(true);
                    bg2.setIcon(woo2);

                    try {
                        clip2.open(au1);
                    } catch (LineUnavailableException | IOException e) {
                        e.printStackTrace();
                    }
                    clip2.start();
                }
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
    }
    void randomLocation(){
        Random r = new Random();
        int limit = 500;
        int random = r.nextInt(limit);
        f.setBounds(random, random, 500,500);

    }
}
