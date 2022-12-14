package cheque.classes;

import java.math.BigDecimal;
import java.util.List;

public class Clients {
    private String name;
    private Integer bankCard;//ichinde akcha bolot
    private int bankCardPassword;

    public Clients(String name, Integer bankCard, int bankCardPassword) {
        this.name = name;
        this.bankCard = bankCard;
        this.bankCardPassword = bankCardPassword;
    }

    public int getBankCardPassword() {
        return bankCardPassword;
    }

    public void setBankCardPassword(int bankCardPassword) {
        this.bankCardPassword = bankCardPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBankCard() {
        return bankCard;
    }

    public void setBankCard(Integer bankCard) {
        this.bankCard = bankCard;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "name='" + name + '\'' +
                ", bankCard=" + bankCard +
                '}';
    }

    public void add(List<Clients> clients) {
    }
    public static void printUserInfo(Clients clients) {
        var name = clients.name;
        var bankCard = clients.bankCard;
        var bankCardPassword = clients.bankCardPassword;
        System.out.println(
                "Client: " + name + "\n"
                        + "Bank card: " + bankCard + "\n"
                + "Bank card password: " + bankCardPassword + "\n"
        );
    }


}
