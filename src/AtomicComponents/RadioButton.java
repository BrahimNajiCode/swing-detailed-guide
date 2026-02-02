package AtomicComponents;
import javax.swing.*;
import javax.swing.plaf.basic.BasicViewportUI;
import java.awt.*;
//======================Explication Bref ==========================================
// Le bouton radio de type JRadioButton permet à l’utilisateur
// d’effectuer un choix de type oui/non. Mais sa vocation est de
// faire partie d’un groupe de boutons dans lequel une seule option
// peut être sélectionnée à la fois.
// ================================================================================


// Important Methods : isSelected(), setSelected() [ se trouvent dans AbstractButton.java]
public class RadioButton extends JFrame {
    private JRadioButton bVert ;
    private JRadioButton bBleu;
    private JRadioButton bRouge;
    public RadioButton(){
        super("Une fenetre avec des boutons radio");
        setBounds(10,40,300,200);
        bBleu = new JRadioButton("Bleu");
        bRouge = new JRadioButton("Rouge");
        bVert = new JRadioButton("Vert");
        // =================================================================================
        // Un objet de type ButtonGroup (classe du paquetage javax.swing,
        // dérivée de la classe Object) sert uniquement à assurer
        // la désactivation automatique d’un bouton lorsqu’un bouton du groupe
        // est activé. Un bouton radio qui n’est pas associé à un
        // groupe, exception faite de son aspect, se comporte, exactement comme une case à cocher
        // =================================================================================
        ButtonGroup buttons = new ButtonGroup();
        buttons.add(bBleu);
        buttons.add(bRouge);
        buttons.add(bVert);
        // Dispose les composants à la suite (gauche à droite) sur une ligne,
        // puis passe à la suivante.
        setLayout(new FlowLayout());
        add(bRouge);
        add(bVert);
        add(bBleu);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
