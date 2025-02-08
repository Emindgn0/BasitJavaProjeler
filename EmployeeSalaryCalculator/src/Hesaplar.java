public class Hesaplar {
    private int maas;
    private int year;
    private int performanceScore;

    public Hesaplar(int maas, int year, int performanceScore) {
        this.maas = maas;
        this.year = year;
        this.performanceScore = performanceScore;
    }

    public int getMaas() {
        return maas;
    }

    // 5 yıldan az çalışmış ise bonus yok
    // 5 ile 10 yıl arası %15 bonus
    // 10 dan fazla ise %40 bonus
    // perforans bonusu 1 ile 10 arasında bir puana göre maaş artışı sağlıyor
    public int bonusluMaas() {
        double bonusluMaas = maas;
        if (year < 5) {
            System.out.println("Bonus yok ");
            return maas;
        } else if (year >= 5 && year <= 10) {
            bonusluMaas += (maas + maas * 0.15);
        } else {
            bonusluMaas += (maas + (maas * 0.40));
        }
        if (performanceScore <= 5) {
            bonusluMaas += maas * 0.1;
        } else if (performanceScore >= 6 && performanceScore < 10) {
            bonusluMaas += maas * 0.2;
        } else if (performanceScore == 10) {
            bonusluMaas += maas * 0.5;
        }
        return (int) bonusluMaas;
    }

    public double vergi() {
        final double Vergi_Orani = 0.2;
        int netMaas = bonusluMaas();
        return netMaas - (netMaas * Vergi_Orani);
    }


}
