public class ScheduleCollege {

    public static void ScheduleCollege() {
        String[] jadwalKuliah = {"Belajar Matakuliah A", "Belajar Matakuliah B", "Belajar Matakuliah C", "Belajar Matakuliah D", "Belajar Matakuliah E"};

        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};

        for (int i = 0; i < jadwalKuliah.length; i++) {
            System.out.println("Hari " + hari[i] + " saya " + jadwalKuliah[i]);
        }
    }
}
