package minggu5;

public class Nilai {
  int uts[];
  int uas[];

  Nilai(int uts[], int uas[]) {
    this.uts = uts;
    this.uas = uas;
  }
 
  // Mencari nilai UTS tertinggi dengan Divide and Conquer
  int maxUTS(int arr[], int l, int r) {
    if (l == r) {
      return arr[l];
    }
    int mid = (l + r) / 2;
    int leftMax = maxUTS(arr, l, mid);
    int rightMax = maxUTS(arr, mid + 1, r);
    return Math.max(leftMax, rightMax);
  }

  // Mencari nilai UTS terendah dengan Divide and Conquer
  int minUTS(int arr[], int l, int r){
    if (l == r) {
      return arr[l];
    }
  int mid = (l + r) / 2;
  int leftMin = minUTS(arr, l, mid);
  int rightMin = minUTS(arr, mid + 1, r);
  return Math.min(leftMin, rightMin);
  }

  // Menghitung rata-rata nilai UAS menggunakan Brute Force
  double rataUAS(){
    int total = 0;
    for (int i = 0; i < uas.length; i++) {
      total += uas[i];
    }
      return (double) total / uas.length;
  }
}
