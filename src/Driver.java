public class Driver < T extends Transport > {

     private String fio;
     private  boolean driverLicense;
     private int exp;

     public void start() {
         System.out.println("Поехали");
     }
     public void  finish(){
         System.out.println("Закончили");

     }

     public  void refuelauto() {

         System.out.println("Бензин на нулях");
     }
}
