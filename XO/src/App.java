import javax.swing.SwingUtilities;
import TicTacToe.*;

public class App {
    public static void main(String[] args) throws Exception {
       SwingUtilities.invokeLater(new Runnable () {
            @Override
            public void run () {
                TicTacToe XO = new TicTacToe();
            }
       });
    }
}
