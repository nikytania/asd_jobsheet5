package minggu5;

public class MainNilai {
  public static void main(String[] args) {
    int uts[] = {78, 85, 90, 76, 92, 88, 80, 82};
    int uas[] = {82, 88, 87, 79, 95, 85, 83, 84};

    Nilai nl = new Nilai(uts, uas);

    int maxUTS = nl.maxUTS(uts, 0, uts.length - 1);
    int minUTS = nl.minUTS(uts, 0, uts.length - 1);
    double rrUAS = nl.rataUAS();

    System.out.println("Nilai UTS tertinggi (Divide and Conquer): " + maxUTS);
    System.out.println("Nilai UTS terendah (Divide and Conquer): " + minUTS);
    System.out.printf("Rata-rata nilai UAS (Brute Force): %.2f\n", rrUAS);
  }
}