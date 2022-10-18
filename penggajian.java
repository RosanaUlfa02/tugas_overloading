public class penggajian {

    String  gajiPokok;
    String gajiTunjangan;
    String  gatiLembur;

    penggajian(String parangajiPokok,String parangajiTunjangan,String parangajiLembur){
        this.gajiPokok=parangajiPokok;
        this.gajiTunjangan=parangajiTunjangan;
        this.gatiLembur=parangajiLembur;

    }

    void cetakpenggajian(String gajiPokok){
        System.out.println("Gaji pokok="+gajiPokok+"gaji tunjangan+gaji lembur"+"gaji lembur");
    }
}
