/**
 * Write a description of class Penumpang here.
 *
 * @author (Sopia Safira)
 * @NIM (1908107010010)
 */
public class Bus {
    private Penumpang[] arrayPenumpangBiasa;
    private Penumpang[] arrayPenumpangPrioritas;
    private int jumlah = 0;

    public Bus() {
        arrayPenumpangBiasa = new Penumpang[4];
        arrayPenumpangPrioritas = new Penumpang[2];
    }

    public Penumpang[] getPenumpangBiasa() {
        return arrayPenumpangBiasa;
    }

    public Penumpang[] getPenumpangPrioritas() {
        return arrayPenumpangPrioritas;
    }

    public int getJumlahPenumpangBiasa() {
        for(int i = 0; i < arrayPenumpangBiasa.length; i++) {
            if (arrayPenumpangBiasa[i] != null) {
                jumlah++;
            }
        }
        return jumlah;
    }

    public int getJumlahPenumpangPrioritas() {
        for(int i = 0; i < arrayPenumpangPrioritas.length; i++) {
            if (arrayPenumpangPrioritas[i] != null) {
                jumlah++;
            }
        }
        return jumlah;
    }

    public boolean naikPenumpang(Penumpang penumpang) {
        if (penumpang.getUmur() > 60 || penumpang.getUmur() < 10 || penumpang.getHamil()) {
            for (int i = 0; i < arrayPenumpangPrioritas.length; i++) {
                if (arrayPenumpangPrioritas[i] == null) {
                    arrayPenumpangPrioritas[i] = penumpang;
                    return true;
                }
            }
        } else {
            for (int i = 0; i < arrayPenumpangBiasa.length; i++) {
                if (arrayPenumpangBiasa[i] == null) {
                    arrayPenumpangBiasa[i] = penumpang;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean turunkanPenumpang(String nama) {
        for (int i = 0; i < arrayPenumpangBiasa.length; i++) {
            if (arrayPenumpangBiasa[i] != null) {
                if (arrayPenumpangBiasa[i].getNama().equals(nama)) {
                    arrayPenumpangBiasa[i] = null;
                    return true;
                }
            }
        }
        
        for (int i = 0; i < arrayPenumpangPrioritas.length; i++) {
            if (arrayPenumpangPrioritas[i] != null) {
                if (arrayPenumpangPrioritas[i].getNama().equals(nama)) {
                    arrayPenumpangPrioritas[i] = null;
                    return true;
                }
            }
        }
        return false;
    }
    
}
