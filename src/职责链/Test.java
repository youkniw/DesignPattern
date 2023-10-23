package 职责链;

public class Test {
    public static void main(String[] args) {
        DataFilter df1 = new CharacterFilter();
        DataFilter df2 = new DataTypeFilter();
        DataFilter df3 = new ValidationFilter();

        df1.setSuccessor(df2);
        df2.setSuccessor(df3);
        df1.filter();
    }
}
