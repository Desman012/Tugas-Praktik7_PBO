package toko;
import java.util.Scanner;
public class Toko {
    public static void main(String[] args) {
        int pilih, total = 0;
        String idBarang[] = {"a001","a002","a003","a004","a005"};
        String []namaBarang = {"Buku","Pensil","Pulpen","Penggaris","Kertas"};
        String []beliIdBarang = new String[3];
        String []beliNamaBarang = new String[3];
        int []beliHargaBarang = new int[3];
        int []harga = {3000,4000,5000,6000,7000};
        int jumlahBayar[] = new int[3];
        int jumlahBeli[] = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("TOKO SERBA ADA");
        System.out.println("**************");
        System.out.print("Masukkan Item Barang : ");
        pilih = sc.nextInt();
        for (int i = 0; i < pilih; i++) {
            System.out.println("Data ke "+(i+1));
            System.out.print("Masukkan Kode\t\t: ");
            beliIdBarang[i] = sc.next();
            System.out.print("Masukkan jumlah Beli\t: ");
            jumlahBeli[i] = sc.nextInt();
            for (int j = 0; j < 3; j++){
                if (beliIdBarang[i].equals(idBarang[j])) {
                    beliNamaBarang[i] = namaBarang[j];
                    beliHargaBarang[i] = harga[j];
                    jumlahBayar[i] = jumlahBeli[i]*harga[j];
                }
            } 
        }
        System.out.println("\n\nTOKO SERBA ADA");
        System.out.println("******************************");
        System.out.println("No\tKode Barang\tNama Barang\tHarga\tJumlah Beli\tJumlah Bayar");
        System.out.println("=============================================================================");
        for (int i = 0; i < pilih; i++) {
            System.out.print((i+1)+"\t"+beliIdBarang[i]+"\t\t ");
            System.out.print(beliNamaBarang[i]+"\t\t "+beliHargaBarang[i]);
            System.out.println("\t   "+jumlahBeli[i]+"\t\t  "+jumlahBayar[i]);
            total += jumlahBayar[i];
        }
        System.out.println("=============================================================================");
        System.out.println("Total Bayar\t\t\t\t\t\t "+total);
        System.out.println("=============================================================================");
    }
}
