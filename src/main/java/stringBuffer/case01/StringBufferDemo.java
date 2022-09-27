package stringBuffer.case01;

// StringBuffer length vs. capacity.
class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Hello");
        System.out.println("buffer = " + sb1);
        System.out.println("length = " + sb1.length());
        System.out.println("capacity = " + sb1.capacity());



        StringBuffer sb2 = new StringBuffer();
//        sb2.ensureCapacity(100);
        for (int i = 0; i <407; i++) {
            sb2.append("i");
        }
        System.out.println("buffer = " + sb2);
        System.out.println("length = " + sb2.length());
        System.out.println("capacity = " + sb2.capacity());


    }
}
