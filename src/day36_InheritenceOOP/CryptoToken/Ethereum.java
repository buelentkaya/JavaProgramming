package day36_InheritenceOOP.CryptoToken;

public class Ethereum extends  CryptoToken{
    public String toString() {
        return "Ethereum{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply='" + circulatingSupply + '\'' +
                ", isMineAble=" + isMineAble +
                '}';
    }
}
