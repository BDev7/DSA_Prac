
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class LayoutExampleApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Layout Management Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 500);
            frame.setLayout(new BorderLayout(10, 10));

            // Add panels to the frame
            frame.add(createTopPanel(), BorderLayout.NORTH);
            frame.add(createCenterPanel(), BorderLayout.CENTER);
            frame.add(createBottomPanel(), BorderLayout.SOUTH);
            frame.add(createLeftPanel(), BorderLayout.WEST);

            frame.setVisible(true);
        });
    }

    private static JPanel createTopPanel() {
        JPanel topPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        topPanel.setBorder(BorderFactory.createTitledBorder("Text Input Example"));

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(15);

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(15);

        JLabel bioLabel = new JLabel("Bio:");
        JTextArea bioArea = new JTextArea(3, 15);
        JScrollPane bioScrollPane = new JScrollPane(bioArea);

        topPanel.add(nameLabel);
        topPanel.add(nameField);
        topPanel.add(passwordLabel);
        topPanel.add(passwordField);
        topPanel.add(bioLabel);
        topPanel.add(bioScrollPane);

        return topPanel;
    }

    private static JPanel createCenterPanel() {
        JPanel centerPanel = new JPanel(new GridBagLayout());
        centerPanel.setBorder(BorderFactory.createTitledBorder("Choice Components Example"));

        JCheckBox javaCheckBox = new JCheckBox("Java");
        JCheckBox pythonCheckBox = new JCheckBox("Python");
        JCheckBox cppCheckBox = new JCheckBox("C++");

        JRadioButton maleRadio = new JRadioButton("Male");
        JRadioButton femaleRadio = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0; gbc.gridy = 0; centerPanel.add(javaCheckBox, gbc);
        gbc.gridx = 1; centerPanel.add(pythonCheckBox, gbc);
        gbc.gridx = 2; centerPanel.add(cppCheckBox, gbc);

        gbc.gridx = 0; gbc.gridy = 1; centerPanel.add(maleRadio, gbc);
        gbc.gridx = 1; centerPanel.add(femaleRadio, gbc);

        return centerPanel;
    }

    private static JPanel createBottomPanel() {
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        bottomPanel.setBorder(BorderFactory.createTitledBorder("Submit Section"));

        JLabel countryLabel = new JLabel("Country:");
        JComboBox<String> countryComboBox = new JComboBox<>(new String[]{"USA", "India", "Canada", "UK"});

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener((ActionEvent e) -> {
            String selectedCountry = (String) countryComboBox.getSelectedItem();
            JOptionPane.showMessageDialog(null, "Country Selected: " + selectedCountry);
        });

        bottomPanel.add(countryLabel);
        bottomPanel.add(countryComboBox);
        bottomPanel.add(submitButton);

        return bottomPanel;
    }

    private static JPanel createLeftPanel() {
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.setBorder(BorderFactory.createTitledBorder("Custom Layout Example"));

        JLabel customLabel = new JLabel("Custom Positioned:");
        JButton customButton = new JButton("Click Me");

        leftPanel.add(Box.createVerticalStrut(20)); // Adds spacing
        leftPanel.add(customLabel);
        leftPanel.add(Box.createVerticalStrut(10));
        leftPanel.add(customButton);

        return leftPanel;
    }
}
