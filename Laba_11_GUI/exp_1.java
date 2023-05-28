package Laba_11_GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
public class exp_1 extends JFrame{
    JButton I1;
    JTextField t1,t2;
    JLabel b1,b2,b3;
    String text,put;
    eWork kn = new eWork();
    public exp_1 (String s) {
        super(s);
        setLayout(new FlowLayout());
        b1 = new JLabel("Введите текст до 25 символов");
        b2 = new JLabel("Укажите путь к файлу");
        I1 = new JButton("Запись");
        t1 = new JTextField(20);
        t2 = new JTextField(25);
        b3 = new JLabel("                      ");
        t1.addKeyListener(new KeyAdapter(){
                              @Override
                              public void keyTyped(KeyEvent e) {
                                  if (t1.getText().length() >= 25) {
                                      e.consume();
                                  }
                              }
                          }
        );

        add(b1);
        add(t1);
        add(b2);
        add(t2);
        add(I1);
        add(b3);
        I1.addActionListener(kn);
    }
    public static void main(String[] args){
        exp_1 g = new exp_1("exp_1");
        g.setVisible(true);
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        g.setSize(500, 125);
        g.setResizable(false);
        g.setLocationRelativeTo(null);

    }
    public class eWork implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource()==I1) {
                    text = t1.getText();
                    put = t2.getText();
                    File file=new File(put);
                    FileWriter fwrite = null;
                    try {
                        fwrite = new FileWriter(file);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    fwrite.write(text);
                    fwrite.close();
                    b3.setText("Запись прошла удачно");
                }

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(exp_1.this, "адрес или текст введен(ы) неправильно"); }

        }
    }
}

