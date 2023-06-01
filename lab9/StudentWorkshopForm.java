import javax.swing.*;
import java.awt.*;

public class StudentWorkshopForm {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Student Workshop Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);

        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(13, 2, 10, 10));
        frame.getContentPane().add(panel);

        
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        panel.add(nameLabel);
        panel.add(nameField);

        JLabel idLabel = new JLabel("Student ID:");
        JTextField idField = new JTextField();
        panel.add(idLabel);
        panel.add(idField);

        JLabel fatherLabel = new JLabel("Father's Name:");
        JTextField fatherField = new JTextField();
        panel.add(fatherLabel);
        panel.add(fatherField);

        JLabel motherLabel = new JLabel("Mother's Name:");
        JTextField motherField = new JTextField();
        panel.add(motherLabel);
        panel.add(motherField);

        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton maleRadioButton = new JRadioButton("Male");
        JRadioButton femaleRadioButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);
        panel.add(genderLabel);
        panel.add(genderPanel);

        JLabel contactLabel = new JLabel("Contact Number:");
        JTextField contactField = new JTextField();
        panel.add(contactLabel);
        panel.add(contactField);

        JLabel emailLabel = new JLabel("Email ID:");
        JTextField emailField = new JTextField();
        panel.add(emailLabel);
        panel.add(emailField);

        JLabel subjectsLabel = new JLabel("Subjects Interested In:");
        JCheckBox mathCheckBox = new JCheckBox("Math");
        JCheckBox scienceCheckBox = new JCheckBox("Science");
        JCheckBox englishCheckBox = new JCheckBox("English");
        JPanel subjectsPanel = new JPanel();
        subjectsPanel.add(mathCheckBox);
        subjectsPanel.add(scienceCheckBox);
        subjectsPanel.add(englishCheckBox);
        panel.add(subjectsLabel);
        panel.add(subjectsPanel);

        JLabel addressLabel = new JLabel("Address:");
        JTextField addressField = new JTextField();
        panel.add(addressLabel);
        panel.add(addressField);

        JLabel cityLabel = new JLabel("City:");
        JTextField cityField = new JTextField();
        panel.add(cityLabel);
        panel.add(cityField);

        JLabel stateLabel = new JLabel("State:");
        JTextField stateField = new JTextField();
        panel.add(stateLabel);
        panel.add(stateField);

        JLabel countryLabel = new JLabel("Country:");
        JTextField countryField = new JTextField();
        panel.add(countryLabel);
        panel.add(countryField);

        
        JButton submitButton = new JButton("Submit");
        panel.add(submitButton);

        
        frame.setVisible(true);
    }
}