package Laba_11_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class exp_3_test extends JFrame implements ActionListener {
    private JTextField xMinField, xMaxField;
    private JButton plotButton;
    private JPanel graphPanel;

    public exp_3_test() {
        super("График функции");

// Создаем поля для ввода интервала и кнопку для построения графика
        xMinField = new JTextField("-10", 5);
        xMaxField = new JTextField("10", 5);
        plotButton = new JButton("Построить график");
        plotButton.addActionListener(this);

// Создаем панель для ввода интервала и кнопки
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("xMin:"));
        inputPanel.add(xMinField);
        inputPanel.add(new JLabel("xMax:"));
        inputPanel.add(xMaxField);
        inputPanel.add(plotButton);

// Создаем панель для отображения графика
        graphPanel = new JPanel() {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawGraph(g);
            }
        };
        graphPanel.setPreferredSize(new Dimension(600, 400));

// Добавляем панели на форму
        getContentPane().add(inputPanel, BorderLayout.NORTH);
        getContentPane().add(graphPanel, BorderLayout.CENTER);

// Настраиваем форму
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

// Обработчик нажатия на кнопку

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == plotButton) {
            graphPanel.repaint();
        }
    }

    // Метод для построения графика
    private void drawGraph(Graphics g) {
// Получаем интервал
        double xMin = Double.parseDouble(xMinField.getText());
        double xMax = Double.parseDouble(xMaxField.getText());

// Определяем размеры графика
        int width = graphPanel.getWidth();
        int height = graphPanel.getHeight();

// Рисуем оси координат
        g.setColor(Color.BLACK);
        g.drawLine(0, height / 2, width, height / 2);
        g.drawLine(width / 2, 0, width / 2, height);

// Рисуем график функции
        g.setColor(Color.BLUE);
        double xStep = (xMax - xMin) / width;
        double x = xMin;
        double y = f(x);
        int lastX = 0, lastY = height / 2;
        for (int i = 1; i < width; i++) {
            x += xStep;
            y = f(x);
            int xPos = i;
            int yPos = (int) (height / 2 - y * height / (xMax - xMin));
            g.drawLine(lastX, lastY, xPos, yPos);
            lastX = xPos;
            lastY = yPos;
        }
    }

    // Функция, график которой мы строим
    private double f(double x) {
        return Math.sin(x);
    }

    public static void main(String[] args) {
        new exp_3_test();
    }
}