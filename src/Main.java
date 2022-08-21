import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int oyuncununPuani = 0;
        int bilgisayarinPuani = 0;

String bilgisayarinOyunu = "";
        int bilgisayarinOyunuRandom = 0;
        // 0 - tas
        // 1 - makas
        // 2 - kagit
        String oyuncununSecenegi = "";
        System.out.println("TAS, KAGIT ve MAKAS oyununa hosgeldiniz.");
        System.out.println("Oyunumuz 3 round'dan olusmaktadir.");
       //round1
        //round 1

        System.out.println("Baslamak icin TAS KAGIT veya MAKAS yazabilirsiniz.");
        oyuncununSecenegi = scanner.nextLine();
        bilgisayarinOyunuRandom = random.nextInt(3);
        if (bilgisayarinOyunuRandom == 0){
            bilgisayarinOyunu = "TAS";
        }
        else if (bilgisayarinOyunuRandom == 1){
            bilgisayarinOyunu = "KAGIT";
        }
        else if (bilgisayarinOyunuRandom == 2){
            bilgisayarinOyunu = "MAKAS";
        }

        if(oyuncununSecenegi.equals("TAS") && bilgisayarinOyunu.equals("MAKAS")){
            oyuncununPuani++;
            System.out.println("Bilgisayar MAKAS oynadi.");
            System.out.println("Oyuncu 1 puan kazandi.");
            System.out.println(" Oyuncu = " + oyuncununPuani + " Bilgisayarin puani = " + bilgisayarinPuani);
        }
        else if (oyuncununSecenegi.equals("TAS") && bilgisayarinOyunu.equals("TAS")){
            System.out.println("Bilgisayar TAS oynadi.");
            System.out.println("Berabere");
        }
        else if (oyuncununSecenegi.equals("TAS") && bilgisayarinOyunu.equals("KAGIT")){
            System.out.println("Bilgisayar KAGIT oynadi.");
            bilgisayarinPuani++;
            System.out.println("Bilgisayar kazandi.");
            System.out.println("Oyuncu = " + oyuncununPuani + " Bilgisayarin puani = " + bilgisayarinPuani);
        }
//oyuncu makas girerse
        if(oyuncununSecenegi.equals("MAKAS") && bilgisayarinOyunu.equals("KAGIT")){
            oyuncununPuani++;
            System.out.println("Bilgisayar KAGIT oynadi.");
            System.out.println("Oyuncu 1 puan kazandi.");
            System.out.println(" Oyuncu = " + oyuncununPuani + " Bilgisayarin puani = " + bilgisayarinPuani);
        }
        else if (oyuncununSecenegi.equals("MAKAS") && bilgisayarinOyunu.equals("MAKAS")){
            System.out.println("Bilgisayar MAKAS oynadi.");
            System.out.println("Berabere");
        }
        else if (oyuncununSecenegi.equals("MAKAS") && bilgisayarinOyunu.equals("TAS")){
            System.out.println("Bilgisayar TAS oynadi.");
            bilgisayarinPuani++;
            System.out.println("Bilgisayar kazandi.");
            System.out.println("Oyuncu = " + oyuncununPuani + " Bilgisayarin puani = " + bilgisayarinPuani);
        }
        // OYUNCU KAGIT GIRERSE
        if(oyuncununSecenegi.equals("KAGIT") && bilgisayarinOyunu.equals("TAS")){
            oyuncununPuani++;
            System.out.println("Bilgisayar TAS oynadi.");
            System.out.println("Oyuncu 1 puan kazandi.");
            System.out.println(" Oyuncu = " + oyuncununPuani + " Bilgisayarin puani = " + bilgisayarinPuani);
        }
        else if (oyuncununSecenegi.equals("KAGIT") && bilgisayarinOyunu.equals("KAGIT")){
            System.out.println("Bilgisayar KAGIT oynadi.");
            System.out.println("Berabere");
        }
        else if (oyuncununSecenegi.equals("KAGIT") && bilgisayarinOyunu.equals("MAKAS")){
            System.out.println("Bilgisayar MAKAS oynadi.");
            bilgisayarinPuani++;
            System.out.println("Bilgisayar kazandi.");
            System.out.println("Oyuncu = " + oyuncununPuani + " Bilgisayarin puani = " + bilgisayarinPuani);
        }


        //bitti
        System.out.println("Round 1 tamamlandi, ikinci rounda baslamak icin TAS, KAGIT veya MAKAS yazin.");
        //round 2 start
        oyuncununSecenegi = scanner.nextLine();
        bilgisayarinOyunuRandom = random.nextInt(3);
        if (bilgisayarinOyunuRandom == 0){
            bilgisayarinOyunu = "TAS";
        }
        else if (bilgisayarinOyunuRandom == 1){
            bilgisayarinOyunu = "KAGIT";
        }
        else if (bilgisayarinOyunuRandom == 2){
            bilgisayarinOyunu = "MAKAS";
        }

        if(oyuncununSecenegi.equals("TAS") && bilgisayarinOyunu.equals("MAKAS")){
            oyuncununPuani++;
            System.out.println("Bilgisayar MAKAS oynadi.");
            System.out.println("Oyuncu 1 puan kazandi.");
            System.out.println(" Oyuncu = " + oyuncununPuani + " Bilgisayarin puani = " + bilgisayarinPuani);
        }
        else if (oyuncununSecenegi.equals("TAS") && bilgisayarinOyunu.equals("TAS")){
            System.out.println("Bilgisayar TAS oynadi.");
            System.out.println("Berabere");
        }
        else if (oyuncununSecenegi.equals("TAS") && bilgisayarinOyunu.equals("KAGIT")){
            System.out.println("Bilgisayar KAGIT oynadi.");
            bilgisayarinPuani++;
            System.out.println("Bilgisayar kazandi.");
            System.out.println("Oyuncu = " + oyuncununPuani + " Bilgisayarin puani = " + bilgisayarinPuani);
        }
        if(oyuncununSecenegi.equals("TAS") && bilgisayarinOyunu.equals("MAKAS")){
            oyuncununPuani++;
            System.out.println("Bilgisayar MAKAS oynadi.");
            System.out.println("Oyuncu 1 puan kazandi.");
            System.out.println(" Oyuncu = " + oyuncununPuani + " Bilgisayarin puani = " + bilgisayarinPuani);
        }
        else if (oyuncununSecenegi.equals("TAS") && bilgisayarinOyunu.equals("TAS")){
            System.out.println("Bilgisayar TAS oynadi.");
            System.out.println("Berabere");
        }
        else if (oyuncununSecenegi.equals("TAS") && bilgisayarinOyunu.equals("KAGIT")){
            System.out.println("Bilgisayar KAGIT oynadi.");
            bilgisayarinPuani++;
            System.out.println("Bilgisayar kazandi.");
            System.out.println("Oyuncu = " + oyuncununPuani + " Bilgisayarin puani = " + bilgisayarinPuani);
        }
//oyuncu makas girerse
        if(oyuncununSecenegi.equals("MAKAS") && bilgisayarinOyunu.equals("KAGIT")){
            oyuncununPuani++;
            System.out.println("Bilgisayar KAGIT oynadi.");
            System.out.println("Oyuncu 1 puan kazandi.");
            System.out.println(" Oyuncu = " + oyuncununPuani + " Bilgisayarin puani = " + bilgisayarinPuani);
        }
        else if (oyuncununSecenegi.equals("MAKAS") && bilgisayarinOyunu.equals("MAKAS")){
            System.out.println("Bilgisayar MAKAS oynadi.");
            System.out.println("Berabere");
        }
        else if (oyuncununSecenegi.equals("MAKAS") && bilgisayarinOyunu.equals("TAS")){
            System.out.println("Bilgisayar TAS oynadi.");
            bilgisayarinPuani++;
            System.out.println("Bilgisayar kazandi.");
            System.out.println("Oyuncu = " + oyuncununPuani + " Bilgisayarin puani = " + bilgisayarinPuani);
        }
        // OYUNCU KAGIT GIRERSE
        if(oyuncununSecenegi.equals("KAGIT") && bilgisayarinOyunu.equals("TAS")){
            oyuncununPuani++;
            System.out.println("Bilgisayar TAS oynadi.");
            System.out.println("Oyuncu 1 puan kazandi.");
            System.out.println(" Oyuncu = " + oyuncununPuani + " Bilgisayarin puani = " + bilgisayarinPuani);
        }
        else if (oyuncununSecenegi.equals("KAGIT") && bilgisayarinOyunu.equals("KAGIT")){
            System.out.println("Bilgisayar KAGIT oynadi.");
            System.out.println("Berabere");
        }
        else if (oyuncununSecenegi.equals("KAGIT") && bilgisayarinOyunu.equals("MAKAS")){
            System.out.println("Bilgisayar MAKAS oynadi.");
            bilgisayarinPuani++;
            System.out.println("Bilgisayar kazandi.");
            System.out.println("Oyuncu = " + oyuncununPuani + " Bilgisayarin puani = " + bilgisayarinPuani);
        }


        System.out.println("Round 2 tamamlandi, ucuncu rounda baslamak icin TAS, KAGIT veya MAKAS yazin.");
//round bitti

        oyuncununSecenegi = scanner.nextLine();
        bilgisayarinOyunuRandom = random.nextInt(3);
        if (bilgisayarinOyunuRandom == 0){
            bilgisayarinOyunu = "TAS";
        }
        else if (bilgisayarinOyunuRandom == 1){
            bilgisayarinOyunu = "KAGIT";
        }
        else if (bilgisayarinOyunuRandom == 2){
            bilgisayarinOyunu = "MAKAS";
        }

        if(oyuncununSecenegi.equals("TAS") && bilgisayarinOyunu.equals("MAKAS")){
            oyuncununPuani++;
            System.out.println("Bilgisayar MAKAS oynadi.");
            System.out.println("Oyuncu 1 puan kazandi.");
            System.out.println(" Oyuncu = " + oyuncununPuani + " Bilgisayarin puani = " + bilgisayarinPuani);
        }
        else if (oyuncununSecenegi.equals("TAS") && bilgisayarinOyunu.equals("TAS")){
            System.out.println("Bilgisayar TAS oynadi.");
            System.out.println("Berabere");
        }
        else if (oyuncununSecenegi.equals("TAS") && bilgisayarinOyunu.equals("KAGIT")){
            System.out.println("Bilgisayar KAGIT oynadi.");
            bilgisayarinPuani++;
            System.out.println("Bilgisayar kazandi.");
            System.out.println("Oyuncu = " + oyuncununPuani + " Bilgisayarin puani = " + bilgisayarinPuani);
        }
        if(oyuncununSecenegi.equals("TAS") && bilgisayarinOyunu.equals("MAKAS")){
            oyuncununPuani++;
            System.out.println("Bilgisayar MAKAS oynadi.");
            System.out.println("Oyuncu 1 puan kazandi.");
            System.out.println(" Oyuncu = " + oyuncununPuani + " Bilgisayarin puani = " + bilgisayarinPuani);
        }
        else if (oyuncununSecenegi.equals("TAS") && bilgisayarinOyunu.equals("TAS")){
            System.out.println("Bilgisayar TAS oynadi.");
            System.out.println("Berabere");
        }
        else if (oyuncununSecenegi.equals("TAS") && bilgisayarinOyunu.equals("KAGIT")){
            System.out.println("Bilgisayar KAGIT oynadi.");
            bilgisayarinPuani++;
            System.out.println("Bilgisayar kazandi.");
            System.out.println("Oyuncu = " + oyuncununPuani + " Bilgisayarin puani = " + bilgisayarinPuani);
        }
//oyuncu makas girerse
        if(oyuncununSecenegi.equals("MAKAS") && bilgisayarinOyunu.equals("KAGIT")){
            oyuncununPuani++;
            System.out.println("Bilgisayar KAGIT oynadi.");
            System.out.println("Oyuncu 1 puan kazandi.");
            System.out.println(" Oyuncu = " + oyuncununPuani + " Bilgisayarin puani = " + bilgisayarinPuani);
        }
        else if (oyuncununSecenegi.equals("MAKAS") && bilgisayarinOyunu.equals("MAKAS")){
            System.out.println("Bilgisayar MAKAS oynadi.");
            System.out.println("Berabere");
        }
        else if (oyuncununSecenegi.equals("MAKAS") && bilgisayarinOyunu.equals("TAS")){
            System.out.println("Bilgisayar TAS oynadi.");
            bilgisayarinPuani++;
            System.out.println("Bilgisayar kazandi.");
            System.out.println("Oyuncu = " + oyuncununPuani + " Bilgisayarin puani = " + bilgisayarinPuani);
        }
        // OYUNCU KAGIT GIRERSE
        if(oyuncununSecenegi.equals("KAGIT") && bilgisayarinOyunu.equals("TAS")){
            oyuncununPuani++;
            System.out.println("Bilgisayar TAS oynadi.");
            System.out.println("Oyuncu 1 puan kazandi.");
            System.out.println(" Oyuncu = " + oyuncununPuani + " Bilgisayarin puani = " + bilgisayarinPuani);
        }
        else if (oyuncununSecenegi.equals("KAGIT") && bilgisayarinOyunu.equals("KAGIT")){
            System.out.println("Bilgisayar KAGIT oynadi.");
            System.out.println("Berabere");
        }
        else if (oyuncununSecenegi.equals("KAGIT") && bilgisayarinOyunu.equals("MAKAS")){
            System.out.println("Bilgisayar MAKAS oynadi.");
            bilgisayarinPuani++;
            System.out.println("Bilgisayar kazandi.");
            System.out.println("Oyuncu = " + oyuncununPuani + " Bilgisayarin puani = " + bilgisayarinPuani);
        }


        System.out.println("Round 3 tamamlandi. Oyun bitti.");
        System.out.println("oyuncunun puani = " + oyuncununPuani + "  bilgisayarin puani =  " + bilgisayarinPuani);
if (oyuncununPuani>bilgisayarinPuani){
    System.out.println("Oyuncu kazandi.");

}
else if (oyuncununPuani == bilgisayarinPuani){
    System.out.println("Berabere.");
}
else if (oyuncununPuani<bilgisayarinPuani){
    System.out.println("Kaybettiniz.....");
}


    }
}