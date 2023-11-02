package 解释器模式;


public class CopyView implements Operation {

    @Override
    public void interpret(DBMS srcDB, DBMS desDB) {
        for (View view : srcDB.viewList) {
            desDB.addView(view);
        }
        System.out.println("将" + srcDB.getName() + "中的view对象拷贝到了" + desDB.getName());
    }

}
