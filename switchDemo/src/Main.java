public class Main {
    public static void main(String[] args){
        char grade='B';
        switch(grade){
            case 'A':
                System.out.println("Mükemmel:geçtiniz");
                break;
            case 'B':
            case 'C':
                System.out.println("İyi:geçtiniz");
                break;
            case 'D':
                System.out.println("Fena değil:geçtiniz");
                break;
            case 'F':
                System.out.println("Kaldınız");
                break;
            default:
                System.out.println("Gecersiz not girdiniz");


        }
    }
}
