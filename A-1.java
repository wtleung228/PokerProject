import java.util.Random;

class A {
   private int x;
   int getRandom (int y){ // Unpredictable 
       Random r = new Random();
       return r.nextInt(y);
   }

   int getRandom (int y, long seed) { // More Predictable
       Random r = new Random(seed);
       return r.nextInt(y);
   }

public static void main(String[] args) {
        //System.out.println( new A().getRandom(Integer.parseInt(args[0])) ); 
        System.out.println( new A().getRandom(100) ); //Random 

        long mySeed = 2020;
        System.out.println( new A().getRandom(100, mySeed )); //Always the Same

        mySeed = System.currentTimeMillis();
        System.out.println( new A().getRandom(100, mySeed ));
   }
}
