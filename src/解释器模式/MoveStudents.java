package 解释器模式;


public class MoveStudents implements Operation {

    @Override
    public void interpret(DBMS srcDB, DBMS desDB) {
        for (Student student : srcDB.studentList) {
            desDB.addStudents(student);
        }
        srcDB.studentList.clear();
        System.out.println("将" + srcDB.getName() + "中的学生表移动到了" + desDB.getName());
    }
}
