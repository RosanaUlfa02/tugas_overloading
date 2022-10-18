public class mainAPP {
    public static void main(String[] args) {
        karyawan karyawan = new karyawan("rosana ulfa", "batunyala", "087752846085");
        penggajian penggajian = new penggajian("Rp.3.000.000", "Rp.1.500.000", "Rp.2.000.000");
        status_pendidikan status_pendidikan=new status_pendidikan("aktif");
        jabatan jabatan = new jabatan("guru");

        karyawan.cetakkaryawan(karyawan.no_hp);
        penggajian.cetakpenggajian(penggajian.gajiPokok);
        jabatan.cetakjabatan(jabatan.jabatan);
        status_pendidikan.cetakstatus_pendidikan(status_pendidikan.status);
    }
}