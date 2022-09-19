import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class virus extends myMotherfckingframe{
    public static JLabel l2 = new JLabel("Sasagutin mo ba ako?");
    public static JButton yes = new JButton("Oo");
    public static JButton no = new JButton("Sorry hanggang friends lang");
    ImageIcon bg = new ImageIcon(new ImageIcon("C:\\Users\\john rendell\\OneDrive\\Desktop\\Java Swing Projects\\My own Java Virus stuff\\img\\bg.jpg").getImage().getScaledInstance(1000,600, Image.SCALE_DEFAULT));
    JLabel forbg = new JLabel();
    boolean color = false;

    //for sound
    public static File file = new File("C:\\Users\\john rendell\\OneDrive\\Desktop\\Java Swing Projects\\My own Java Virus stuff\\img\\Video Game Reward Sound\uD83D\uDD0A ⧸ Sound Effect (HD).wav");
    public static AudioInputStream au;

    static {
        try {
            au = AudioSystem.getAudioInputStream(file);
        } catch (UnsupportedAudioFileException | IOException e) {
            e.printStackTrace();
        }
    }

    public static Clip clip;

    static {
        try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    virus() throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        //title
        f.setTitle("Surpriseeeeee!!!!!!!!!!!!!!!!!!!!!!!!");
        isOn = false;

        //bg
        forbg.setVisible(true);
        forbg.setIcon(bg);

        //text
        f.remove(credits);
        f.remove(l);
        f.remove(count);
        f.remove(b);
        f.remove(p);
        f.add(forbg);
        l2.setBounds(330,150,700,50);
        l2.setFont(new Font("Cascadia Code", Font.BOLD, 25));
        l2.setForeground(new Color(255, 77, 127));
        l2.setOpaque(false);

        Timer t1 = new Timer(100, e->{
            if(color){
                l2.setForeground(new Color(252, 121, 158));
                color = false;
            }
            else{
                l2.setForeground(new Color(255, 77, 127));
                color = true;
            }
        });
        t1.start();

        //buttons
        yes.setFocusable(false);
        yes.setOpaque(false);
        yes.setVisible(true);
        yes.setBounds(400,230,200,30);
        no.setFocusable(false);
        no.setOpaque(false);
        no.setVisible(true);
        no.setBounds(400,300,200,30);

        yes.addMouseListener(this);
        no.addMouseListener(this);
    }
}
