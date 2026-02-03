package JTable.ModeleDynamiqueObjet;

import JTable.Sport;
import JTable.tableModelObjet.Ami;

import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ModeleDynamiqueObjet extends AbstractTableModel {
    private final List<Ami> amis = new ArrayList<Ami>();
    private final String[] entetes = {"Prénom", "Nom", "Couleur favorite", "Homme", "Sport"};

    public ModeleDynamiqueObjet() {
        super();
        amis.add(new Ami("Johnathan", "Sykes", Color.red, true, Sport.TENNIS));
        amis.add(new Ami("Nicolas", "Van de Kampf", Color.black, true, Sport.FOOTBALL));
        amis.add(new Ami("Damien", "Cuthbert", Color.cyan, true, Sport.RIEN));
        amis.add(new Ami("Corinne", "Valance", Color.blue, false, Sport.NATATION));
        amis.add(new Ami("Emilie", "Schrödinger", Color.magenta, false, Sport.FOOTBALL));
        amis.add(new Ami("Delphine", "Duke", Color.yellow, false, Sport.TENNIS));
        amis.add(new Ami("Eric", "Trump", Color.pink, true, Sport.FOOTBALL));
    }

    @Override
    public int getRowCount() {
        return amis.size();
    }

    @Override
    public int getColumnCount() {
        return entetes.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return amis.get(rowIndex).getPrenom();
            case 1:
                return amis.get(rowIndex).getNom();
            case 2:
                return amis.get(rowIndex).getCouleur();
            case 3:
                return amis.get(rowIndex).isHomme();
            case 4:
                return amis.get(rowIndex).getSport();
            default:
                return null; //Ne devrait jamais arriver
        }
    }
    @Override
    public Class getColumnClass(int columnIndex){
        switch(columnIndex){
            case 2:
                return Color.class;
            case 3:
                return Boolean.class;
            default:
                return Object.class;
        }
    }



    public void addAmi(Ami ami) {
        amis.add(ami);
        fireTableRowsInserted(amis.size() - 1, amis.size() - 1);
        // fireTableRowsInserted(int firstRow, int lastRow)
        // → informe le JTable que de nouvelles lignes ont été insérées.
        // Préviens le JTable qu'une ligne a été ajoutée
    }

    public void removeAmi(int rowIndex) {
        amis.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
        // fireTableRowsDeleted(rowIndex, rowIndex)
        // → informe le JTable qu’une ligne a été supprimée.
        // Le tableau se met à jour automatiquement.
    }
}