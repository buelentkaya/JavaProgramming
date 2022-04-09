package day36_InheritenceOOP.CryptoToken;

public class XRP extends CryptoToken{
    public String toString() {
        return "XRP{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply='" + circulatingSupply + '\'' +
                ", isMineAble=" + isMineAble +
                '}';
    }
}
