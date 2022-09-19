public class Strings {
    public static void main(String[] args) {
        String mesaj = "Tanrılar ulusu olsaydı demokrasi ile yönetilirdi.";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı: " + mesaj.length());
        System.out.println("5. eleman: " + mesaj.charAt(6));
        System.out.println(mesaj.concat("Böylesi olgun bir yönetim insanların harcı değil."));
        System.out.println(mesaj.startsWith("A"));        System.out.println(mesaj.startsWith("A"));
        System.out.println(mesaj.endsWith("."));


    }
}
