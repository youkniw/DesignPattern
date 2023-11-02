package 命令模式;


public class Remote {
    public void update(Setting setting) {
        System.out.println("已保存配置：遥控器第" + setting.getIndex() + "个开关控制第" + setting.getRoomIndex() + "个房间");
    }
}
