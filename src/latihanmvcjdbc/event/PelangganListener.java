/*
NIM:10116502
NAMA:KEN WITE ARIING CAHYU
KELAS: PBO-11
 */
package latihanmvcjdbc.event;

import latihanmvcjdbc.entity.Pelanggan;
import latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author ASUS
 */
public interface PelangganListener {

    public void onChange(PelangganModel model);
    public void onInsert(Pelanggan pelanggan);
    public void onDelete();
    public void onUpdate(Pelanggan pelanggan);



    
}
