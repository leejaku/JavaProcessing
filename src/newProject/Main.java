/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newProject;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

/**
 *
 * @author lee
 */
    

public class Main {
    

    
    public static void main (String [] args)
    {


            try {
                for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (Exception e) {
                // If Nimbus is not available, you can set the GUI to another look and feel.
            }
         ChooseProject test = new ChooseProject();
         test.setVisible(true);
    }
}
