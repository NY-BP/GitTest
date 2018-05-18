/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Safi
 */
public interface IModell {

    void close() throws SQLException;

    int addKonyv(Konyv k) throws SQLException;
    int updateKonyv(Konyv sz) throws SQLException;
    int removeKonyv (Konyv sz) throws SQLException;
    List<Konyv> getKonyv() throws SQLException;
    List <Konyv> getKonyvekByCim(String cim) throws SQLException;
}
