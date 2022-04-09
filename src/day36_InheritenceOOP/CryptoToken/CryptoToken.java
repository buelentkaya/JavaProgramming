package day36_InheritenceOOP.CryptoToken;

public class CryptoToken {

   public double price, quantity,marketCap, volume;
   public int circulatingSupply;
   public  boolean isMineAble;

    public void setInfo(double price, double quantity, double marketCap, double volume, int circulatingSupply, boolean isMineAble) {
        this.price = price;
        this.quantity = quantity;
        this.marketCap = marketCap;
        this.volume = volume;
        this.circulatingSupply = circulatingSupply;
        this.isMineAble = isMineAble;
    }

    public double totalPrice(){
       return price*quantity;


   }

    public String toString() {
        return "CryptoToken{" +
                "price=$" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply='" + circulatingSupply + '\'' +
                ", isMineAble=" + isMineAble +
                '}';
    }
}
