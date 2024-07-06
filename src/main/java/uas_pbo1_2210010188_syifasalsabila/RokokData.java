package uas_pbo1_2210010188_syifasalsabila;

public class RokokData {
    private String namaRokok;
    private String isiRokok;
    private String stokRokok;
    
    public RokokData(String namaRokok, String isiRokok, String stokRokok) {
        this.namaRokok = namaRokok;
        this.isiRokok = isiRokok;
        this.stokRokok = stokRokok;
    }
    
    public String getNamaRokok() {
        return namaRokok;
    }

    public void setNamaRokok(String namaRokok) {
        this.namaRokok = namaRokok;
    }

    public String getIsiRokok() {
        return isiRokok;
    }

    public void setIsiRokok(String isiRokok) {
        this.isiRokok = isiRokok;
    }

    public String getStokRokok() {
        return stokRokok;
    }

    public void setStokRokok(String stokRokok) {
        this.stokRokok = stokRokok;
    }
    
    public String displayInfo() {
        return "Nama Rokok\t\t: " + getNamaRokok() + 
               "\nIsi Rokok\t\t: " + getIsiRokok();
    }

    @Override
    public String toString() {
        return "RokokData [namaRokok=" + namaRokok + 
               ", isiRokok=" + isiRokok + 
               ", stokRokok=" + stokRokok + "]";
    }
}
