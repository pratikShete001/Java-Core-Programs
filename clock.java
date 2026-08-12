import javax.swing.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.awt.Font;

public class Clock extends JFrame {

    public static void main(String[] args) {

        JFrame f = new JFrame();
        JLabel label = new JLabel("", SwingConstants.CENTER); // Label at center
        f.add(label);

        f.setSize(600, 600);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null); // frame at center

        Font f2 = new Font("Arial", Font.BOLD, 50);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");//

        label.setFont(f2);

        while (true) {

            label.setText(LocalTime.now().format(format));

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}