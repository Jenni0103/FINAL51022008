/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinemafinalproject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Waktu {
    public static void setWaktu(javax.swing.JLabel labelWaktu, javax.swing.JLabel labelHari) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                        Date date = new Date();
                        SimpleDateFormat tf = new SimpleDateFormat("h:mm:ss aa");
                        SimpleDateFormat df = new SimpleDateFormat("EEEE, dd-MM-yyyy");
                        String time = tf.format(date);
                        String hari = df.format(date);
                        labelWaktu.setText(time);
                        labelHari.setText(hari);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Waktu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }
}

