package day36_InheritenceOOP.CryptoToken;

public class MyWallet {
    public static void main(String[] args) {
        Bitcoin bitcoin=new Bitcoin();
        bitcoin.setInfo(43000,2,54,88605000,12345687,true);

        Ethereum ethereum=new Ethereum();
        ethereum.setInfo(3400,1,5465465,546532,54676,true);
        Cardano cardano=new Cardano();
        cardano.setInfo(16,85,5465764,5498567,549879,false);

        XRP xrp=new XRP();
       xrp.setInfo(0.82,100000,4646549832d,6546432,465486431,false);



        Doge dodge=new Doge();
        dodge.setInfo(0.14575,50000,5643546,456843,5246876,true);

        double totalAsset=bitcoin.totalPrice()+
                ethereum.totalPrice()+
                cardano.totalPrice()+
                xrp.totalPrice()+
                dodge.totalPrice();

        System.out.println("My total Asset is : "+totalAsset);
    }

}
