public class PrimitiveAndReferenceTypes {

    public static void main(String[] args) {
        String start = "start";

        String start2 = new String("start");
        String start3 = new String("start");

        String s4 = start3;
        String s5 = "start";

        String n = null;

        boolean right = start2 == start3;
        boolean isRight = s5 == start3;

        System.out.println(start);
        System.out.println(start2);

        System.out.println(start2.equals(start3));
        System.out.println(start2.equals(s4));

        System.out.println(s5.equals(start2));
        System.out.println(isRight);
    }
}
