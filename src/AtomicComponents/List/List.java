package AtomicComponents.List;

import javax.swing.*;
import java.awt.*;

import static javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION;
import static javax.swing.ListSelectionModel.SINGLE_SELECTION;

// ======================================================================================
// La boîte de liste de type JList permet de choisir une ou
// plusieurs valeurs dans une liste prédéfinie. Initialement, aucune
// valeur n’est sélectionnée dans la liste.
// Par défaut, le type d’une boîte de liste est
// MULTIPLE_INTERVAL_SELECTION.
// ======================== Existe 3 Modes : ============================================
//  SINGLE_SELECTION [One Value]
//  SINGLE_INTERVAL_SELECTION [Multiple Values, Contiguous]
//  MULTPLE_INTRERVAL_SELECTION [[Multiple Values, Uncontiguous]
// Method is setSelectionMode().
// ======================================================================================

// Important Methods : setSelectedIndex(index), setSelectionMode(SINGLE_SELECTION)
public class List extends JFrame {
    private static final int SINGLE_INTERVAL_SELECTION_SELECTION = 1;
    private JScrollPane scrollpane;
    private JList list;
    public List(){
        super("");
        setBounds(10,40,300,200);
        setLayout(new FlowLayout());


        String colors[] = {"Red", "Blue", "Green", "Purple", "Pink", "Black"};
        list = new JList(colors);
        // =============== 1. Sélection préalable de l’élément des rangs 0, 1, 2 ===========
        int[] indices ={0,1};
        list.setSelectedIndices(indices);
        // =========================================================================
        // =============== 2. setSelectionMode() ===================================
        list.setSelectionMode(SINGLE_INTERVAL_SELECTION_SELECTION);
        // =========================================================================
        // =============== 3. getSelectedValue fournit la valeur sélectionnée. Son résultat est de type Object ===================================
        // String value = (String) list.getSelectedValue();
        // System.out.println(value);
        //========================================================================================================================================

        // =============== 4. La méthode getSelectedValues qui fournit un tableau d'objets ==============
        Object[] values = list.getSelectedValues();
        for(Object o : values){
            System.out.println((String)o);
            // Cast Obligatoire
        }
        // ==============================================================================================

        // ==============================================================================================
        // Par défaut une boîte de liste ne possède pas de barre de
        // défilement. On peut lui en ajouter une en l'introduisant dans un
        // panneau de défilement de type JScrollPane (classe dérivée de la classe JComponent).
        // ==============================================================================================
        // Seules 4 valeurs de la liste sont visibles à la fois
        list.setVisibleRowCount(3);
        scrollpane = new JScrollPane(list);


        add(scrollpane);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
