/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan2;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;

/**
 *
 * @author MSI-PC
 */
public class FormMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Form Mahasiswa");
        
        JLabel title = new JLabel();
        title.setText("Form Mahasiswa");
        title.setBounds(365, 0, 100, 50);
        frame.add(title);
        
        JLabel nama = new JLabel();
        nama.setText("Nama");
        nama.setBounds(100, 50, 100, 25);
        frame.add(nama);
        
        JTextField txtNama = new JTextField();
        txtNama.setBounds(200, 50, 500, 30);
        frame.add(txtNama);
        
        JLabel username = new JLabel();
        username.setText("Username");
        username.setBounds(100, 100, 100, 25);
        frame.add(username);
        
        JTextField txtUsername = new JTextField();
        txtUsername.setBounds(200, 100, 500, 30);
        frame.add(txtUsername);
        
        JLabel password = new JLabel();
        password.setText("Password");
        password.setBounds(100, 150, 100, 25);
        frame.add(password);
        
        JPasswordField txtPassword = new JPasswordField();
        txtPassword.setBounds(200, 150, 500, 30);
        frame.add(txtPassword);
        
        JLabel jk = new JLabel();
        jk.setText("Jenis Kelamin");
        jk.setBounds(100, 200, 100, 25);
        frame.add(jk);
        
        JCheckBox jk1 = new JCheckBox("Laki-Laki", true);
        JCheckBox jk2 = new JCheckBox("Perempuan");
        jk1.setBounds(200, 200, 500, 25);
        jk2.setBounds(200, 230, 500, 25);
        frame.add(jk1);
        frame.add(jk2);
        
        JLabel hobi = new JLabel();
        hobi.setText("Hobi");
        hobi.setBounds(100, 280, 100, 25);
        frame.add(hobi);
        
        JRadioButton hobi1 = new JRadioButton("Membaca", true);
        JRadioButton hobi2 = new JRadioButton("Menulis");
        hobi1.setBounds(200, 280, 500, 25);
        hobi2.setBounds(200, 310, 500, 25);
        frame.add(hobi1);
        frame.add(hobi2);
        
        JLabel alamat = new JLabel();
        alamat.setText("Alamat");
        alamat.setBounds(100, 360, 100, 25);
        frame.add(alamat);
        
        JTextArea txtAlamat = new JTextArea();
        txtAlamat.setBounds(200, 360, 500, 100);
        frame.add(txtAlamat);
        
        JButton submit = new JButton();
        submit.setText("Submit");
        submit.setBounds(365, 500, 75, 25);
        frame.add(submit);
        
        frame.setSize(800, 600);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
}
