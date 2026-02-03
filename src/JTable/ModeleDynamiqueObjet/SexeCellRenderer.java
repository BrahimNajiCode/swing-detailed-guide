package JTable.ModeleDynamiqueObjet;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class SexeCellRenderer extends DefaultTableCellRenderer {
    private Icon manImage;
    private Icon womanImage;

    public SexeCellRenderer() {
        super();
        manImage = new ImageIcon("man.png");
        womanImage = new ImageIcon("woman.png");
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean
            isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        Boolean homme = (Boolean) value;
        setText("");
        if (homme) {
            setIcon(manImage);
        } else {
            setIcon(womanImage);
        }
        return this;
    }
}
