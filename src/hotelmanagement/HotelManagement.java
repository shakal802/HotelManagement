/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagement;
 
import javax.swing.SwingUtilities;

/**
 *
 * @author chris_000
 */
public class HotelManagement {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                login GUI = new login();
                GUI.show();
            }
        });
    }
}