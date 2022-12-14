package cheque.classes;

import java.math.BigDecimal;

public class Clients {
    private String name;
    private BigDecimal bankCard;
    private int bankCardPassword;

    public Clients(String name, BigDecimal bankCard, int bankCardPassword) {
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

    public BigDecimal getBankCard() {
        return bankCard;
    }

    public void setBankCard(BigDecimal bankCard) {
        this.bankCard = bankCard;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "name='" + name + '\'' +
                ", bankCard=" + bankCard +
                '}';
    }
}
