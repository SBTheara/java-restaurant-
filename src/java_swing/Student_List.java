package java_swing;

import java.util.ArrayList;

public class Student_List {
    private int id;
    private String name;
    private String gender;
    private String university;
    private String department;
    private float java;
    private float php;
    private float db;
    private float total;
    private float avg;
    private String phone;
    private String image;
    private String address;
    private int year;
    private String classes;
    private String time;
    
    public Student_List(){
        
    }
    public Student_List(int id, String name, String gender, String university, String department, float java, float php, float db, float total, float avg,String phone, String image, String address, int year, String classes, String time) {
        this.id = id;
        this.name = name;
        this.gender=gender;
        this.university = university;
        this.department = department;
        this.java = java;
        this.php = php;
        this.db = db;
        this.total=total;
        this.avg=avg;
        this.phone = phone;
        this.image = image;
        this.address = address;
        this.year = year;
        this.classes = classes;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUniversity() {
        return university;
    }

    public String getDepartment() {
        return department;
    }

    public float getJava() {
        return java;
    }

    public float getPhp() {
        return php;
    }

    public float getDb() {
        return db;
    }

    public String getPhone() {
        return phone;
    }

    public String getImage() {
        return image;
    }

    public float getTotal() {
        return total;
    }

    public float getAvg() {
        return avg;
    }

    public String getAddress() {
        return address;
    }

    public int getYear() {
        return year;
    }

    public String getClasses() {
        return classes;
    }

    public String getGender() {
        return gender;
    }

    public String getTime() {
        return time;
    }
    static ArrayList<Student_List> list= new ArrayList<>();
}
