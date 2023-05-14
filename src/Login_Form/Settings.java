package Login_Form;
import javax.swing.*;
import java.awt.*;

public class Settings extends JFrame {
     private  JButton back;
     private ImageIcon background;
     private JLabel bgLabel;

    SwitchButton musicSwitchButton;
    SwitchButton themeSwitchButton;
    JLabel musicLabel;
    JLabel ThemeLabel;

    Music music = new Music();
    String soundEffect = "MenuSoundEffect.wav";
    private String filepath= "Bones.wav";
    public Settings(){
        this.setLayout(null);
        this.setFocusable(false);
        this.setSize(600 ,300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        background = new ImageIcon(this.getClass().getResource("/Login_Form/theme/CATCHESS.jpg"));
        bgLabel = new JLabel(background);
        bgLabel.setBounds(0,0,600 ,300);

        back = new JButton("Back");
        back.setBackground(new Color(204, 204, 204));
        back.setFont(new Font("Papyrus", 2, 24)); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        back.setFocusable(false);
        back.setBounds(10,10,100,30);

        musicSwitchButton = new SwitchButton();
        themeSwitchButton = new SwitchButton();
        musicLabel = new JLabel();
        ThemeLabel = new JLabel();

        musicSwitchButton.setBounds(300,150,40,20);
        themeSwitchButton.setBounds(300,200,40,20);
        musicLabel.setBounds(250,150,40,20);
        ThemeLabel.setBounds(250,200,80,20);
        musicLabel.setText("Music");
        ThemeLabel.setText("Theme");
        musicLabel.setForeground(Color.RED);
        ThemeLabel.setForeground(Color.RED);
        MusicToggleButton();
        ThemeToggleButton();
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);



        this.add(musicSwitchButton);
        this.add(themeSwitchButton);
        this.add(musicLabel);
        this.add(ThemeLabel);
        this.add(back);
        this.add(bgLabel);
    }

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        music.PlaySoundEffect(soundEffect);
        this.setVisible(false);
    }

    private void MusicToggleButton(){
        musicSwitchButton.addEventSelected(new EventSwitchSelected() {
            @Override
            public void onSelected(boolean selected) {
                if (selected) {
                    music.PlayMusic(filepath);
                } else {
                    music.StopMusic(filepath);
                }
            }
        });
    }

    private void ThemeToggleButton(){
        themeSwitchButton.addEventSelected(new EventSwitchSelected() {
            @Override
            public void onSelected(boolean selected) {
                if (selected) {
                   Login.theme = true;
                } else {
                    Login.theme = false;
                }
            }
        });
    }
}
