/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms.file;

import java.io.BufferedReader;
import java.io.FileReader;

public class UserFileHandler {
    
    public static boolean checkLogin(String username,String password){
        try{
            BufferedReader br = new BufferedReader(new FileReader("data/users.txt"));
            String line;
            while ((line=br.readLine())!=null){
                String[] data= line.split(",");
                if (data[0].equals(username)&& data[1].equals(password)){
                    
                    br.close();
                    return true;
                }
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
}
