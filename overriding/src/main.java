public class main {
    public static void main(String[] args) {
        BaseKrediManager[] krediManagers = new BaseKrediManager[]{new OgretmenKrediManager(), new TarimKrediManager(),new ogrenciKrediManager()};
        for (BaseKrediManager krediManager : krediManagers) {
            System.out.println(krediManager.hesapla(1000));

        }
    }
}
