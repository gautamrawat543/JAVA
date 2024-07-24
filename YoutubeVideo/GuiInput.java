package YoutubeVideo;

import javax.swing.JOptionPane;

public class GuiInput {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("enter your height"));

        JOptionPane.showMessageDialog(null,
                "Hello " + name.toUpperCase() + "\nYour age is " + age + "\nYour height is " + height + " cm");

    }
}
