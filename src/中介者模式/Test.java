package 中介者模式;


public class Test {
    public static void main(String[] args) {
        MediatorImpl mediator = new MediatorImpl();
        TCsubSystem tCsubSystem = new TCsubSystem("旅行社", mediator);
        TASubsystem taSubsystem = new TASubsystem("景点", mediator);
        HSubsystem hSubsystem = new HSubsystem("旅馆", mediator);
        RSubsystem rSubsystem = new RSubsystem("餐厅", mediator);
        ASubsystem aSubsystem = new ASubsystem("机场", mediator);

        mediator.sethSubsystem(hSubsystem);
        mediator.settCsubsystem(tCsubSystem);
        mediator.setTaSubsystem(taSubsystem);
        mediator.setaSubsystem(aSubsystem);
        mediator.setrSubsystem(rSubsystem);

        tCsubSystem.contact("新客人");

        System.out.println("======================");
        aSubsystem.contact("食堂有客人");
    }
}
