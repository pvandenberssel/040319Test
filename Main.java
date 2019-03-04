import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Mens m1 = new Mens();
        Tegenstander t1 = new Tegenstander();
        System.out.println(t1.aanval());
        System.out.println(t1.aanval());
        System.out.println(t1.aanval());

        while(t1.LevenT > 0 & m1.LevenM>0){
            m1.setLeven(t1.aanval());
            t1.setLeven(m1.aanval());
            System.out.println("Leven mens: "+m1.LevenM);
            System.out.println("Leven tegenstander: " +t1.LevenT);
        }

    }
}


    class Mens{
        private int maxLeven=30;
        private int maxAanval=20;
        int LevenM;
        Random random = new Random();
        Mens(){
            LevenM= random.nextInt(maxLeven);
            System.out.println(LevenM);
        }

        int aanval(){
            return random.nextInt(maxAanval);
        }

        void setLeven(int att){
            LevenM=LevenM-att;
        }


    }

    class Tegenstander{
        private int maxLeven=15;
        private int maxAanval=10;
        int LevenT;
        int Aanval;
        Random random = new Random();
       Tegenstander(){
           LevenT=random.nextInt(maxLeven);
           System.out.println(LevenT);
       }
       int aanval(){
           return random.nextInt(maxAanval);
       }

       void setLeven(int att){
           LevenT=LevenT-att;
       }

    }




