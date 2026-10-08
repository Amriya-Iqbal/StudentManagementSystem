/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms.model;

/**
 *
 * @author amriy
 */
public class Student {
    private String id;
        private String name;
        private String course;
        private int year;
            private String email;
            
        public Student (String id,String name,String course,int year,String email){
            this.id=id;
            this.name=name;
            this.course=course;
            this.year=year;
            this.email=email;
        
    }
    public String getID(){
        return id;
    }
    public String getName(){
        return name;
}
    public String getCourse(){
            return course;
                    }
    public int getYear(){
        return year;
    }
    
    public String getEmail(){
        return email;
}

    public void setName(String name){
        this.name = name;
    }
    public void setCourse(String course){
        this.course=course;
    }
        
    public void setYear(int year){
        this.year=year;
    }
            
            public void setEmail(String email){
        this.email = email;
}
    public String toFileString(){
        return id + "," + name+"," +  course+"," + year+"," + email;
    }
    }
        