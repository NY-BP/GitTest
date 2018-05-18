/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Safi
 */
public class DBModell implements IModell {

    private Connection conn;
    
    private PreparedStatement addKonyvpstmt;
    private PreparedStatement getKonyvpstmt;
    private PreparedStatement updateKonyvpstmt;
    private PreparedStatement removeKonyvpstmt;
    private PreparedStatement getKonyvekByCimpstmt;

    public DBModell(Connection conn) throws SQLException {
        this.conn = conn;
        
        addKonyvpstmt = conn.prepareStatement("INSERT INTO konyvektabla (iroKolto, cim, hollet) VALUES (?,?,?) ");
        getKonyvpstmt = conn.prepareStatement("SELECT * FROM konyvektabla");
        updateKonyvpstmt = conn.prepareStatement("UPDATE konyvektabla SET iroKolto=?, cim=?, hollet=? WHERE id=?");
        removeKonyvpstmt = conn.prepareStatement("DELETE FROM konyvektabla WHERE id=?");
        getKonyvekByCimpstmt = conn.prepareStatement("SELECT * FROM konyvektabla WHERE cim LIKE ? ORDER BY iroKolto");
        
    }

    @Override
    public int addKonyv(Konyv k) throws SQLException {
        
        addKonyvpstmt.setString(1, k.getIroKolto());
        addKonyvpstmt.setString(2, k.getCim());
        addKonyvpstmt.setString(3, k.getHollet());
        return addKonyvpstmt.executeUpdate();
    }

    @Override
    public List<Konyv> getKonyv() throws SQLException {
        ResultSet rs = getKonyvpstmt.executeQuery();

        List<Konyv> konyvek = new ArrayList<>();
        while (rs.next()) {
            Konyv k = new Konyv(rs.getString("iroKolto"), rs.getString("cim"), rs.getString("hollet"));

            konyvek.add(k);
        }
        rs.close();
        return konyvek;
    }

    @Override
    public void close() throws SQLException {
        if (conn != null) {
            conn.close();
    }
    }

    @Override
    public int updateKonyv(Konyv sz) throws SQLException {
        updateKonyvpstmt.setString(1, sz.getIroKolto());
        updateKonyvpstmt.setString(2, sz.getCim());
        updateKonyvpstmt.setString(3, sz.getHollet());
        updateKonyvpstmt.setInt(4, sz.getId());
        return updateKonyvpstmt.executeUpdate();
    }

    @Override
    public int removeKonyv(Konyv sz) throws SQLException {
        removeKonyvpstmt.setInt(1, sz.getId());
        return removeKonyvpstmt.executeUpdate();
    }

    @Override
    public List<Konyv> getKonyvekByCim(String cim) throws SQLException {
        getKonyvekByCimpstmt.setString(1, cim+"%");
        ResultSet rs = getKonyvekByCimpstmt.executeQuery();

        List<Konyv> konyvek = new ArrayList<>();
        while (rs.next()) {
            Konyv k = new Konyv(rs.getString("iroKolto"), rs.getString("cim"), rs.getString("hollet"));

            konyvek.add(k);
        }
        rs.close();
        return konyvek;
    }


}
