/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koneksi;

/**
 *
 * @author fajar
 */
import java.sql.*;
public class ValidasiKoneksi {
    public static boolean cekKoneksi() {
        Connection conn = KoneksiDB.getConnection();
        if (conn != null) {
            System.out.println("Validasi berhasil! Database terhubung.");
            return true;
        } else {
            System.out.println("Validasi gagal! Database tidak terhubung.");
            return false;
        }
    }
}
