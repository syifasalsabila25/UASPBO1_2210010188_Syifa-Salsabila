package uas_pbo1_2210010188_syifasalsabila;

// Inheritance
public class RokokMetode extends RokokData {
    public RokokMetode(String namaRokok, String isiRokok, String stokRokok) {
        super(namaRokok, isiRokok, stokRokok);
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() +
               "\nStok Rokok yang Masuk\t: " + getStokRokok();
    }
}
