/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinemafinalproject;

import java.util.UUID;

public class Pesanan {
    private static int jumlahTiket;
    private static String idFilm;
    private static String idTiket;
    private static String judulFilm;
    private static String genreFilm;
    private static String durasiFilm;
    private static String hariTayang;
    private static String waktuTayang;
    private static String nomorKursi;
    private static int hargaTiket;
    private static int totalHarga;

    public static void simpanPesanan(int jumlahTiket, String idTiket, String idFilm, String judulFilm, String genreFilm, String durasiFilm, String hariTayang, String waktuTayang, String nomorKursi, int hargaTiket, int totalHarga) {
        Pesanan.jumlahTiket = jumlahTiket;
        Pesanan.idTiket = idTiket;
        Pesanan.idFilm = idFilm;
        Pesanan.judulFilm = judulFilm;
        Pesanan.genreFilm = genreFilm;
        Pesanan.durasiFilm = durasiFilm;
        Pesanan.hariTayang = hariTayang;
        Pesanan.waktuTayang = waktuTayang;
        Pesanan.nomorKursi = nomorKursi;
        Pesanan.hargaTiket = hargaTiket;
        Pesanan.totalHarga = totalHarga;
    }

    public static String generateIdTiket() {
        idTiket = UUID.randomUUID().toString();
        return idTiket;
    }
    public static String getIdTiket() {
        return idTiket;
    }

    public static int getJumlahTiket() {
        return jumlahTiket;
    }

    public static String getIdFilm() {
        return idFilm;
    }

    public static String getJudulFilm() {
        return judulFilm;
    }

    public static String getGenreFilm() {
        return genreFilm;
    }

    public static String getDurasiFilm() {
        return durasiFilm;
    }

    public static String getHariTayang() {
        return hariTayang;
    }

    public static String getWaktuTayang() {
        return waktuTayang;
    }

    public static String getNomorKursi() {
        return nomorKursi;
    }

    public static int getHargaTiket() {
        return hargaTiket;
    }

    public static int getTotalHarga() {
        return totalHarga;
    }
}
