import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class Main {
    public static void main(String[] args){
        double para;
        Scanner input = new Scanner(System.in);
        System.out.print("KDV'siz Fiyat :");
        para = input.nextDouble();
        double kdvli = ((para * 18) / 100) + para;  
        double kdvli2  = ((para * 8) / 100) + para;
        boolean kosul1 = para >= 0;
        boolean kosul2 = para <= 1000;
        boolean sonuc1 = kosul1 && kosul2;
        double sonuc2 = (sonuc1)  ? ((para * 18) / 100) + para : ((para * 8) / 100) + para;

        System.out.println("KDV'li Fiyat :" + sonuc2);
    }
}