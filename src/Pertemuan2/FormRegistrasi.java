/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author MSI-PC
 */
public class FormRegistrasi {
    public static void main(String[] Args){
        JFrame j = new JFrame("Form Registrasi");
        JLabel judul = new JLabel();
        judul.setText("Form Registrasi");
        judul.setBounds(200, 30, 100, 45);
        j.add(judul);
        
        JLabel name = new JLabel();
        name.setText("Nama");
        name.setBounds(50, 100, 100, 30);
        j.add(name);
        
        JLabel username = new JLabel();
        username.setText("Username");
        username.setBounds(50, 150, 100, 30);
        j.add(username);
        
        JLabel password  = new JLabel();
        password.setText("Password");
        password.setBounds(50, 200, 100, 30);
        j.add(password);
        
        JLabel email = new JLabel();
        email.setText("Email");
        email.setBounds(50, 250, 100, 30);
        j.add(email);
        
        JLabel no_hp = new JLabel();
        no_hp.setText("No. HP");
        no_hp.setBounds(50, 300, 100, 30);
        j.add(no_hp);
        
        JLabel alamat = new JLabel();
        alamat.setText("Alamat");
        alamat.setBounds(50, 350, 100, 30);
        j.add(alamat);
        
        JTextField txt_name = new JTextField();
        txt_name.setBounds(125, 100, 300, 30);
        j.add(txt_name);
        
        JTextField txt_username = new JTextField();
        txt_username.setBounds(125, 150, 300, 30);
        j.add(txt_username);
        
        JPasswordField txt_password = new JPasswordField();
        txt_password.setBounds(125, 200, 300, 30);
        j.add(txt_password);
        
        JTextField txt_email = new JTextField();
        txt_email.setBounds(125, 250, 300, 30);
        j.add(txt_email);
        
        JTextField txt_nohp = new JTextField();
        txt_nohp.setBounds(125, 300, 300, 30);
        j.add(txt_nohp);
        
        JTextArea txt_alamat = new JTextArea();
        txt_alamat.setBounds(125, 350, 300, 100);
        j.add(txt_alamat);
        
        JButton register = new JButton();
        register.setText("Register");
        register.setBounds(200, 475, 100, 30);
        j.add(register);
        
        j.setSize(500, 750);
        j.setLayout(null);
        j.setVisible(true);
    }
}
