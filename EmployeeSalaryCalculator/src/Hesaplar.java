public class Hesaplar {
    private  int maas;
    private  int year;
    public Hesaplar(int maas, int year){
        this.maas=maas;
        this.year=year;
    }

    public int getMaas() {
        return maas;
    }
    // 5 yıldan az çalışmış ise bonus yok
    // 5 ile 10 yıl arası %15 bonus
    // 10 dan fazla ise %40 bonus
    public  int bonusluMaas() {
        double bonusluMaas=maas;
        if (year<5 ){
            System.out.println("Bonus yok ");
            return maas;
        } else if (year>=5 && year<=10) {
            bonusluMaas= (maas + maas*0.15);
        }else {
            bonusluMaas= (maas + (maas * 0.40));
        }
        return (int) bonusluMaas;
    }
    public  double vergi (){
        final double Vergi_Orani=0.2;
        int netMaas=bonusluMaas();
        return  netMaas-(netMaas * Vergi_Orani) ;
    }



}
