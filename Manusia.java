/**
 *
 * @author User
 * Nama         : Silky Afina Saly
 * NIM          : 22166017
 * Mata Kuliah  : Pemrograman Berorientasi Objek 1
 * Program Studi: Sistem Informasi
 * Semester     : 3
 */
/**
 * Kelas Manusia, Dosen, dan Mahasiswa
 */
public class Manusia {
    protected String nama;
    protected int umur;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void siapaKamu() {
        System.out.println("Saya Manusia");
    }
}

class Dosen extends Manusia {
    private String nip;
    private String mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public void MengajarApa() {
        System.out.println("NIP DOSEN: "+ nip);
        System.out.println("Saya " + nama + " umur " + umur +
                " sedang mengajar mata kuliah " + mataKuliah);
    }
}

class Mahasiswa extends Manusia {
    private String nim;
    private String kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void kelasApa() {
        System.out.println("NIM MAHASISWA : " + nim );
        System.out.println("Saya " + nama + " umur " + umur + 
                " sedang belajar di kelas " + kelas);
    }

    public static void main(String[] args) {
        // Data yang diambil dari dalam program
        Dosen dosen = new Dosen();
        dosen.setNip("4122782990");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");

        dosen.MengajarApa();
        System.out.println("");

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNama("Silky Afina Saly");
        mahasiswa.setUmur(19);
        mahasiswa.setKelas("PBO");
        mahasiswa.setNim("22166017");
        mahasiswa.kelasApa();
    }
}
