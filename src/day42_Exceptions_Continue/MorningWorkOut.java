package day42_Exceptions_Continue;

public class MorningWorkOut {
    public static void main(String[] args) {

        System.out.println("Push Up Started!\n");


        for (int i = 1; i <= 5; i++) {
            System.out.print("\r Push up " + i);
            sleep(1.5);
         /*   try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/

        }

        System.out.println("\nPush up completed");

        System.out.println("_________________________________");

        System.out.println("Pull Up Started!\n");


        for (int j = 1; j <= 5; j++) {
            System.out.print("\r Pull up " + j);
            sleep(2.5);

        /*    try{
                Thread.sleep(1500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

        }*/

        }
        System.out.println("\nPull up completed");
    }
        public static void sleep(double seconds){

            try {
                Thread.sleep((long) (seconds * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

