package java_swing;

import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Stu_list {
    private int id;
    private String name;
    private String gender;
    private String course;
    private String place;
    private float price;
    private String time;
    private String day;
    static ArrayList<Stu_list> list = new ArrayList<>();  
}
