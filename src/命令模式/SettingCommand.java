package 命令模式;

public class SettingCommand implements Command {
    private Remote remote;
    private Setting setting;

    public SettingCommand(Remote remote, Setting setting) {
        this.remote = remote;
        this.setting = setting;
    }

    @Override
    public void execute() {
        remote.update(setting);
    }
}
