import java.util.Scanner;

public class RegistStudent {
    public static void RegistStudent(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program pendaftaran mahasiswa baru!");
        System.out.println("Silakan pilih jurusan:");
        System.out.println("1. Informatika");
        System.out.println("2. Sistem Informasi-S1");
        System.out.println("3. Teknologi Informasi-S1");
        System.out.println("4. Sistem Informasi-D3");

        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih jurusan Informatika");
                break;
            case 2:
                System.out.println("Anda memilih jurusan Sistem Informasi-S1");
                break;
            case 3:
                System.out.println("Anda memilih jurusan Teknologi Informasi-S1");
                break;
            case 4:
                System.out.println("Anda memilih jurusan Sistem Informasi-D3");
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }

        scanner.close();
    }
}
