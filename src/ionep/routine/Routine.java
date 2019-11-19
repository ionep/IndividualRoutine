
package ionep.routine;

/**
 *
 * @author ionep
 */
public class Routine {
    
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Individual().setVisible(true);
            }
        });
    }
    
}
