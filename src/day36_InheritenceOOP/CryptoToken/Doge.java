package day36_InheritenceOOP.CryptoToken;

public class Doge extends CryptoToken{

    public String toString() {
        return "Doge{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply='" + circulatingSupply + '\'' +
                ", isMineAble=" + isMineAble +
                '}';
    }
}
