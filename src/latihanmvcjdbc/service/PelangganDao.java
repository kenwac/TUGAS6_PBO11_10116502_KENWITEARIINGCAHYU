/*
NIM:10116502
NAMA:KEN WITE ARIING CAHYU
KELAS: PBO-11
 */
package latihanmvcjdbc.service;

import java.util.List;
import latihanmvcjdbc.entity.Pelanggan;
import latihanmvcjdbc.error.PelangganException;

/**
 *
 * @author ASUS
 */
public interface PelangganDao {

    public void insertPelanggan (Pelanggan pelanggan) throws PelangganException;
    public void updatePelanggan (Pelanggan pelanggan) throws PelangganException;
    public void deletePelanggan (Integer id) throws PelangganException;
    public Pelanggan getPelanggan(Integer id) throws PelangganException;
    public Pelanggan getPelanggan (String email) throws PelangganException;
    public List<Pelanggan> selectAllPelanggan() throws PelangganException;
    
}
