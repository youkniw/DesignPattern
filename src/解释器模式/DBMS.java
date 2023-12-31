package 解释器模式;

import java.util.ArrayList;
import java.util.List;


public class DBMS {
    private String name;

    public String getName() {
        return name;
    }

    public DBMS(String name) {
        this.name = name;
    }

    public List<View> viewList = new ArrayList<View>();
    public List<Student> studentList = new ArrayList<Student>();

    public void addView(View v) {
        viewList.add(v);
    }

    public void addStudents(Student s) {
        studentList.add(s);
    }

    public void removeView(View v) {
        viewList.remove(v);
    }

    public void removeStudents(Student s) {
        studentList.remove(s);
    }

    public void printView() {
        for (View view : viewList) {
            System.out.print(view.getName() + " ");

        }
        System.out.print("\n");
    }

    public void printStudents() {
        for (Student student : studentList) {
            System.out.print(student.getName() + " ");
        }
        System.out.print("\n");
    }
}
