package day36_InheritenceOOP.CryptoToken;

public class Bitcoin extends CryptoToken{

    public String toString() {
        return "Bitcoin{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply='" + circulatingSupply + '\'' +
                ", isMineAble=" + isMineAble +
                '}';
    }
}
