/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import sms.model.Student;

public class StudentFileHandler {
    public static void saveStudent(Student s) {
        try{
            BufferedWriter bw= new BufferedWriter(new FileWriter("data/students.txt",true));
            bw.write(s.toFileString());
            bw.newLine();
            bw.close();
        } catch (Exception e){
            
            JOptionPane.showMessageDialog(null, "File Error");
        }
    }
}
