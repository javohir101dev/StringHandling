package stringBuffer.case05;

// Using reverse() to reverse a StringBuffer.
class ReverseDemo {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("1 2 3 4 5");
        System.out.println(s);
        s.reverse();
        System.out.println(s);
    }
}