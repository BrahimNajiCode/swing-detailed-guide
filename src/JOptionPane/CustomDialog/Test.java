package JOptionPane.CustomDialog;
import  JOptionPane.Window;
public class Test {
    public static void main(String[] args) {
        Window win = new Window();
        CustomDialog D = new CustomDialog(win);
        D.setVisible(true);
    }
}
