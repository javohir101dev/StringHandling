package string.case03;

public class Concat {


    public static void main(String[] args) {

//        CASE 1
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 100_000; i++) {
            s  = s + "1";
        }
        long end = System.currentTimeMillis();
        System.out.println("Time difference in + :" + (end - start));

//        CASE 2
//        String s2 = "";
//        long start2 = System.currentTimeMillis();
//        for (int i = 0; i < 100_000; i++) {
//            s2 = s2.concat("1");
//        }
//        long end2 = System.currentTimeMillis();
//        System.out.println("Time difference in concat :" + (end2 - start2));

    }

}
