public class Main {
    public static void main(String[] args) {
        int number = -1;
        boolean isPrime = true;

        if (number == 1) {
            System.out.println(number + " sayisi asal degildir");
            return;

        }
        if(number<1) {

            System.out.println(number + " sayisi gecersizdir");
            return;

        }

        for(int i = 2; i<number;i++) {

            if (number % i == 0) {
            isPrime = false;
        }
    }
        if(isPrime)

    {
        System.out.println(number + " sayisi asaldir");
    } else

    {
        System.out.println(number + " sayisi asal degildir");
    }

}
}


