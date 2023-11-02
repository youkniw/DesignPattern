package 享元模式;

import java.util.HashMap;


public class AccountFactory {
    public HashMap<String, Account> map;

    private AccountFactory() {
        map = new HashMap<>();
        map.put("01", new Normal());
        map.put("02", new VIP());
        map.put("03", new VIPP());
    }

    private static AccountFactory accountFactory = new AccountFactory();

    public static AccountFactory getInstance() {
        return accountFactory;
    }

    public Account getPermission(String code) {
        return map.get(code);
    }
}
