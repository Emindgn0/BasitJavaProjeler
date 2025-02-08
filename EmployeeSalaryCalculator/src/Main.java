public class Main {
    public static void main(String[] args) {
        Employee calisan1=new Employee();
        calisan1.setNameLastname("Emin Doğan");
        calisan1.setAge(35);
        calisan1.setNumber("0552");
        calisan1.setDepartment("Yazılım");
        Hesaplar hesap=new Hesaplar(35000,13,10);
        System.out.println("Çalışan isim : " + calisan1.getNameLastname());
        System.out.println("Çalışan yaş : " + calisan1.getAge());
        System.out.println("Çalışan numara : " + calisan1.getNumber());
        System.out.println("Çalışan departmanı : " + calisan1.getDepartment());
        System.out.println("Çalışan garanti maas : " + hesap.getMaas());
        System.out.println("Çalışan bonuslu maas : " + hesap.bonusluMaas());
        System.out.println("Çalışan vergi düşülmüş maas : " + hesap.vergi());


    }



}