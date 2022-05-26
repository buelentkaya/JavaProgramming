package day53_FunctionalInterface;

public class LambdaExpression {
    public static void main(String[] args) {

     MyThirdFunctionalInterface <String> stringReverse =
             (s)->{
         String reverse=new StringBuilder(s).reverse().toString();
         return reverse;
             };

     String result= stringReverse.method("Bülent Kaya");
        System.out.println("result = " + result);  //result = ayaK tnelüB






    }
}
