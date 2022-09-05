public class IfVeElseBloklari {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

		/*if (a==b) {
			System.out.println("A Sayısı B sayısına Eşittir");
		}
		else {
			System.out.println("A Sayısı B Sayısına Eşit Değildir");
	    }*/

        //////////////////////////

		/*if (a<c) {
			System.out.println("A Sayısı C Sayısından Küçüktür");
		}
		else if (b>a)
		{
			System.out.println("B Sayısı A Sayısından Büyüktür");
		}
		else
		{
			System.out.println("B Saysısı A Sayısından Küçüktür");
		}*/

        ////////////////////////////

        if ((a<b) && (a<c)) {
            System.out.println("A Sayısı En Küçük Sayıdır");
        }
        else if ((b<a) && (b<c)) {
            System.out.println("B Sayısı En Küçük Sayıdır");
        }
        else {
            System.out.println("C Sayısı En Küçük Sayıdır");
        }

    }
}