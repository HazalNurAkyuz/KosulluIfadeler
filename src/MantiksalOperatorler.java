public class MantiksalOperatorler {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 50;
        int d = 27;

        boolean kosul1 = a<b;
        boolean kosul2 = c>d;
        System.out.println(kosul1 && kosul2);

        boolean kosul3 = a>b;
        boolean kosul4 = c>d;
        boolean sonuc = kosul3 || kosul4;
        System.out.println(sonuc);

    }
}
