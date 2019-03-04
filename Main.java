import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        gevecht g = new gevecht();
        g.initMensen();
        g.initTegenstanders();



        /*while(t1.LevenT > 0 & m1.LevenM>0){
            m1.setLeven(t1.aanval());
            t1.setLeven(m1.aanval());
            System.out.println("Leven mens: "+m1.LevenM);
            System.out.println("Leven tegenstander: " +t1.LevenT);
        }*/

    }
}


    class Mens{
        private int maxLeven=30;
        private int maxAanval=20;
        int LevenM;
        Random random = new Random();
        Mens(){
            LevenM= random.nextInt(maxLeven)+1;
            System.out.println(LevenM);
        }

        int aanval(){
            return random.nextInt(maxAanval);
        }

        void setLeven(int att){
            LevenM=LevenM-att;
        }

        Mens genereerMens(){
            return new Mens();
        }

    }

    class Tegenstander{
        private int maxLeven=15;
        private int maxAanval=10;
        int LevenT;
        int Aanval;
        Random random = new Random();
       Tegenstander(){
           LevenT=random.nextInt(maxLeven)+1;
       }
       int aanval(){
           return random.nextInt(maxAanval);
       }

       void setLeven(int att){
           LevenT=LevenT-att;
       }
       Tegenstander genereerTegenstander(){
           return new Tegenstander();
       }

    }

    class gevecht{
    int iMensen;
    int iTegenstanders;

        Mens m = new Mens();
        Tegenstander t = new Tegenstander();

        void initMensen(){
            System.out.println("Aantal mensen: ");
            Scanner scanner = new Scanner(System.in);
            iMensen = scanner.nextInt();
            System.out.println(iMensen);
            ArrayList<Mens> deMensen = new ArrayList();

            for(int i=0;i<iMensen;i++){
                deMensen.add(m.genereerMens());
            }

            System.out.println(deMensen.size());
        }

        void initTegenstanders(){
            System.out.println("Aantal tegenstanders: ");
            Scanner scanner = new Scanner(System.in);
            iTegenstanders = scanner.nextInt();
            System.out.println(iTegenstanders);
            ArrayList<Tegenstander> deTegenstanders = new ArrayList();

            for(int i=0;i<iTegenstanders;i++){
                deTegenstanders.add(t.genereerTegenstander());
                System.out.println(deTegenstanders.get(i).LevenT);
            }

        }


    }





