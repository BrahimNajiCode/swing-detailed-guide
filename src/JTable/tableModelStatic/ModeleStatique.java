package JTable.tableModelStatic;

import JTable.Sport;

import javax.swing.table.AbstractTableModel;
import java.awt.*;
// ====================================================================
// Dans JTable, les données et la présentation sont séparées :
//      - Le JTable s’occupe de l’affichage (dessiner les lignes et colonnes, scroll, sélection…).
//      - Le TableModel s’occupe des données réelles (ce qui est dans chaque cellule).
// En gros :
//      - JTable = vue
//      - TableModel = données
// ====================================================================
public class ModeleStatique extends AbstractTableModel {
    private final Object[][] donnees;
    private final String[] entetes = {"Prénom", "Nom", "Couleur favorite", "Homme", "Sport"};
    public ModeleStatique(){
        super();
        donnees = new Object[][]{
                {"Johnathan", "Sykes", Color.red, true, Sport.TENNIS},
                {"Nicolas", "Van de Kampf", Color.black, true, Sport.FOOTBALL},
                {"Damien", "Cuthbert", Color.cyan, true, Sport.RIEN},
                {"Corinne", "Valance", Color.blue, false, Sport.NATATION},
                {"Emilie", "Schrödinger", Color.magenta, false, Sport.FOOTBALL},
                {"Delphine", "Duke", Color.yellow, false, Sport.TENNIS},
                {"Eric", "Trump", Color.pink, true, Sport.FOOTBALL},
        };
    }
    @Override
    public int getRowCount(){
        return donnees.length;
    }
    @Override
    public int getColumnCount(){
        return entetes.length;
    }
    @Override
    public String getColumnName(int columnIndex){
        return entetes[columnIndex];
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        return donnees[rowIndex][columnIndex];
    }
}
