import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

public class myMotherfckingframe implements MouseListener {
    JFrame f = new JFrame("Virus Java swing by - John Rendell Catuiza");
    JPanel p = new JPanel();
    JLabel l = new JLabel("Crush kita, pwede ba kitang Maging gf?");
    JLabel credits = new JLabel("Created by Cute programmer, John Rendell Catuiza");
    JLabel count = new JLabel("Pakipindot ng 10 beses, 0 na pindot");
    JButton b = new JButton("Press me hehe");
    boolean isOn;
    int num = 0;

    myMotherfckingframe(){
        f.setBounds(0,0,1000,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.add(count);
        f.add(credits);
        f.add(virus.l2);
        f.add(virus.yes);
        f.add(virus.no);
        f.add(b);
        f.add(l);
        f.add(p);

        //when start
        isOn = true;

        //bg
        p.setBackground(new Color(160, 222, 242));

        //title
        l.setForeground(new Color(214, 51, 100));
        l.setFocusable(false);
        l.setVisible(true);
        l.setBounds(250,150,600,50);
        l.setFont(new Font("Cascadia Code", Font.BOLD, 25));

        Timer t = new Timer(200, e -> {
            if(isOn){
                l.setForeground(new Color(145, 19, 57));
                isOn = false;
            }
            else {
                l.setForeground(new Color(214, 51, 100));
                isOn = true;
            }
        });
        t.start();

        //button
        b.setFocusable(false);
        b.setVisible(true);
        b.setForeground(Color.white);
        b.setBounds(400,250,200,50);
        b.setBackground(new Color(107, 138, 242));
        b.setBorder(new LineBorder(new Color(22, 59, 181), 5));
        b.addMouseListener(this);

        //for instruction
        count.setForeground(Color.black);
        count.setFocusable(false);
        count.setVisible(true);
        count.setBounds(330,300,500,50);
        count.setFont(new Font("Cascadia Code", Font.BOLD, 15));

        //for credits
        credits.setForeground(Color.black);
        credits.setFocusable(false);
        credits.setVisible(true);
        credits.setBounds(280,350,500,50);
        credits.setFont(new Font("Cascadia Code", Font.BOLD, 15));
    }

    @Override
    public void mouseClicked(MouseEvent ie) {
        num++;
        count.setText("Pakipindot ng 10 beses, " + num + " na pindot");
        if(num == 10){
            try {
                new virus();
            } catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
                e.printStackTrace();
            }
            f.dispose();
        }

        if(ie.getSource() == virus.yes){
            virus.yes.setVisible(false);
            virus.no.setVisible(false);
            f.remove(virus.yes);
            f.remove(virus.no);
            virus.l2.setText("Yeheyyyyyyyy!!!!");
            virus.l2.setBounds(330,150,800,100);
            virus.l2.setFont(new Font("Cascadia Code", Font.BOLD, 50));
        }
        else if(ie.getSource() == virus.no){
            f.dispose();
            try {
                new yow();
            } catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
