package com.wyx;

import java.util.ArrayList;
import java.util.List;

public class studentservice {
    public List<Student> find(){
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(1,"张三"));
        list.add(new Student(2,"张三"));
        list.add(new Student(3,"张三"));
        list.add(new Student(4,"张三"));
        list.add(new Student(5,"张三"));
        return list;
    }

}
