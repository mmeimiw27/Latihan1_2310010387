package hitung;

public class MatematikaBeraksi {
     public static void main(String[] args) {
         Matematika memei = new Matematika(8,7);
         
         System.out.println("Hasil Penjumlahan " + memei.setPenjumlahan());
         System.out.println("Hasil Pengurangan " + memei.setPengurangan());
         System.out.println("Hasil Perkalian " + memei.setPerkalian());
         System.out.println("Hasil Pembagian " + memei.setPembagian());
    }
}
