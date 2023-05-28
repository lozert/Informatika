package Laba_11_GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.*;
import javax.swing.*;
public class exp_2 extends JFrame{
    JButton zapis,vivod;
    JTextField t2,name,tham,otch,date,group;
    JLabel b1,b2,name1,tham1,otch1,date1,group1;
    String text,put;
    eWork kn = new eWork();
    public exp_2 (String s) {
        super(s);
        setLayout(new FlowLayout());
        name1 = new JLabel("Введите имя");
        tham1 = new JLabel("Введите фамилию");
        otch1 = new JLabel("Введите отчество");
        date1 = new JLabel("Введите дату рождения");
        group1 = new JLabel("Укажите учебную группу");
        b2 = new JLabel("Введите адрес файла ");
        t2 = new JTextField(25);
        name = new JTextField(30);
        tham = new JTextField(30);
        otch = new JTextField(30);
        date = new JTextField(25);
        group = new JTextField(25);
        b1 = new JLabel("                      ");
        vivod = new JButton("Вывод");
        zapis = new JButton("Запись");


        add(name1);add(name);
        add(tham1);add(tham);
        add(otch1);add(otch);
        add(date1);add(date);
        add(group1);add(group);
        add(b2);add(t2);

        add(zapis);
        add(vivod);
        add(b1);

        zapis.addActionListener(kn);
        vivod.addActionListener(kn);
    }
    public static void main(String[] args){
        exp_2 g = new exp_2("exp_2");
        g.setVisible(true);
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        g.setSize(500, 300);
        g.setResizable(false);
        g.setLocationRelativeTo(null);

    }
    public class eWork implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource()==zapis) {
                    text = name.getText()+"\s"+tham.getText()+"\s"+otch.getText()+"\s"+date.getText()+"\s"+group.getText();
                    put = t2.getText();
                    File file=new File(put);
                    try {
                        FileWriter fwrite = new FileWriter(file);
                        fwrite.write(text);
                        fwrite.close();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }

                    b1.setText("Запись произошла успешно");
                } else if (e.getSource() == vivod) {
                    put = t2.getText();
                    File file=new File(put);
                    BufferedReader fread = new BufferedReader(new FileReader(file));
                    text = fread.readLine();
                    b1.setText("Вывод записи:\s"+text);

                }

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Aдрес или текст введен(ы) неправильно"); }

        }
    }
}
