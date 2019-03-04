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




    }
}


    class Mens{
        private int maxLeven=30;
        private int maxAanval=20;
        int LevenM;

        Mens(){
            Random random = new Random();
            LevenM= random.nextInt(maxLeven);
            System.out.println(LevenM);
        }





    }

    class Tegenstander{
        private int maxLeven=15;
        private int maxAanval=10;
        int LevenS;
        int Aanval;
        Random random = new Random();
       Tegenstander(){
           LevenS=random.nextInt(maxLeven);
           System.out.println(LevenS);
       }
       int aanval(){
           return random.nextInt(maxAanval);
       }

    }

    class Gevecht{

    }


