import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame{
    private JPanel panalMain;
    private JTextField txtName;
    private JButton btnClick;
    private JTextField txtID;
    private JButton btnID;
    private JTextField txtAddress;
    private JButton btnAddress;
    private JTextField txtnProduct;
    private JButton btnnProduct;
    private JRadioButton op1;
    private JRadioButton op2;
    private JRadioButton op3;
    private JRadioButton smartphoneRadioButton;
    private JRadioButton OOPRadioButton;
    private JRadioButton tShirtRadioButton;
    private JRadioButton smartphoneRadioButton1;
    private JRadioButton tShirtRadioButton1;
    private JRadioButton OOPRadioButton1;
    private JRadioButton smartphoneRadioButton2;
    private JRadioButton tShirtRadioButton2;
    private JRadioButton OOPRadioButton2;

    public UI() {
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btnClick,txtName.getText()+" ,Welcome");
            }
        });
        btnID.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btnID,txtID.getText()+" Is your ID");
            }
        });
        btnAddress.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btnAddress,txtAddress.getText()+" , Is your Address");
            }
        });
        btnnProduct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        UI ui = new UI();
        ui.setContentPane(ui.panalMain);
        ui.setTitle("Welcome to Abdallah's Small GUI");
        ui.setSize(300,400);
        ui.setVisible(true);
        ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
