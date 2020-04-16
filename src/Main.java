public class Main {

    public static void main(String[] args) {

        /**
         * Char testing
         */
        char ch = 'b';
        ch += 'a';
        ch -= 'b';
        System.out.print('\n');
        System.out.println(ch);

        ch = 65;
        System.out.println(ch);

        ch = '\u0031' + '\u0035';
        System.out.println(ch);

        System.out.println('1' + '3');

        char c = '1' + '3';
        System.out.println(c);
    }

}
