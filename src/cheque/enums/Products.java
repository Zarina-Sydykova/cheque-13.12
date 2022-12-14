package cheque.enums;

public enum Products {
    SUT(105),
    BANAN(165),
    SIR(458),
    KAYMAK(189),
    NAN(35),
    ET(850),
    BALYK(599),
    SUU_MAY(450),
    KUM_WEKER(66),
    PECHENE(271);

    private int baalary;

    Products(int baalary) {
        this.baalary = baalary;
    }

    public int getBaalary() {
        return baalary;
    }

    public void setBaalary(int baalary) {
        this.baalary = baalary;
    }

    @Override
    public String toString() {
        return "Products{" +
                "baalary=" + baalary +
                '}';
    }

    public Integer getSum() {
        return 0;
    }
}
