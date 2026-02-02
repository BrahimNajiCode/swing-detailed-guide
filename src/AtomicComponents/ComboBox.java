package AtomicComponents;

import javax.swing.*;
import java.awt.*;

// ========================== EXPLICATION BREF ======================================================
// La boîte de liste combinée (boîte combo) de type
// JComboBox associe un champs de texte et une boîte de liste
// à sélection simple. Tant que le composant n'est pas sélectionné, seul le champ de texte s'affiche.
// ==================================================================================================

// Important Methods : setMaximumRowCount(int) : Pour L'affichage, getSelectedItem() --> Object,
public class ComboBox extends JFrame {
    private  JComboBox cb;
    public ComboBox(){
        super("JComboBox");
        setBounds(10,40,300,200);
        setLayout(new FlowLayout());



        String[] Fruits = {"Banana", "Lemon", "Tomato", "Watermelon", "Strawberry"};
        cb =  new JComboBox(Fruits);
        // =====================================================================
        cb.setSelectedIndex(2) ;
        // Sélection préalable de l’élément de rang 2
        // =====================================================================

        // =====================================================================
        // La boîte combo est dotée d'une barre de défilement dès que son
        //nombre de valeurs est supérieur à 8. On peut modifier le
        //nombre de valeurs visibles avec la méthode setMaximumRowCount.
        cb.setMaximumRowCount(4) ; // Il va afficher 4, avec scrollPane
        // =====================================================================

        // =====================================================================
        // L'utilisateur peut alors y entrer soit une valeur de la liste (en la sélectionnant),
        //  soit une valeur de son choix (en la saisissant).
        cb.setEditable(true) ;
        // =====================================================================
        // La méthode getSelectedIndex fournit le rang de la valeur
        // sélectionnée. Elle fournit la valeur -1, si l'utilisateur a entré une
        // nouvelle valeur (c'est à dire une valeur qui n'a pas été
        // sélectionnée dans la liste).
        String st = (String) cb.getSelectedItem();
        int Index = cb.getSelectedIndex();
        System.out.println(Index+".  "+st);
        // =====================================================================
        cb.addItem("Orange") ;
        // Ajoute la valeur orange à la fin de la liste combo
        cb.insertItemAt("Orange", 2);
        // Ajoute la valeur orange à la positon 2 de la liste combo
        cb.removeItem("Tomato");
        // Supprime la valeur gris de la liste combo
        // =====================================================================

        add(cb);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
