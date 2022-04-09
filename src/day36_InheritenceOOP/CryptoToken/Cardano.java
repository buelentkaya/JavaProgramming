package day36_InheritenceOOP.CryptoToken;

public class Cardano extends CryptoToken{
    public String toString() {
        return "Cardano{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply='" + circulatingSupply + '\'' +
                ", isMineAble=" + isMineAble +
                '}';
    }
}
