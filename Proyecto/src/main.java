import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


class Nodo {
    private String mensaje;
    private ImageIcon imagen;
    private Nodo izquierda;
    private Nodo derecha;

    public Nodo(String mensaje, ImageIcon imagen) {
        this.mensaje = mensaje;
        this.imagen = imagen;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public String getMensaje() {
        return mensaje;
    }

    public ImageIcon getImagen() {
        return imagen;
    }
}

class Game {
    private Nodo rama;
    private Nodo nodoActual;
    private JLabel outputLabel;
    private JButton ButonIzquierdo;
    private JButton ButonDerecho;
    private JFrame frame;

    public Game() {
        // Construye el árbol de opciones
        ImageIcon imagen1 = new ImageIcon("img/bosque.png");
        ImageIcon imagen2 = new ImageIcon("img/rio.png");
        ImageIcon imagen3 = new ImageIcon("img/cueva.png");
        ImageIcon imagen4 = new ImageIcon("img/trampa.png");
        ImageIcon imagen5 = new ImageIcon("img/bifurcacion.png");
        ImageIcon imagen6 = new ImageIcon("img/muerteflechas.png");
        ImageIcon imagen7 = new ImageIcon("img/tesoro.png");
        ImageIcon imagen8 = new ImageIcon("img/veneno.png");
        ImageIcon imagen9 = new ImageIcon("img/humo.png");
        ImageIcon imagen10 = new ImageIcon("img/bandidos.png");
        ImageIcon imagen11 = new ImageIcon("img/pelea.png");
        ImageIcon imagen12 = new ImageIcon("img/salir.png");
        ImageIcon imagen13 = new ImageIcon("img/oso.png");
        ImageIcon imagen14 = new ImageIcon("img/osomuerte.png");
        ImageIcon imagen15 = new ImageIcon("img/arbol.png");
        ImageIcon imagen16 = new ImageIcon("img/niñas.png");
        ImageIcon imagen17 = new ImageIcon("img/apertura.png");
        ImageIcon imagen18 = new ImageIcon("img/laboratorio.png");
        ImageIcon imagen19 = new ImageIcon("img/soldados.png");
        ImageIcon imagen20 = new ImageIcon("img/escondido.png");
        ImageIcon imagen21 = new ImageIcon("img/curiosidad.png");


        Nodo nodo1 = new Nodo("Te encuentras en un bosque. ¿Deseas ir hacia la izquierda(1) o hacia la derecha(2)?", imagen1);
        
        Nodo nodo2 = new Nodo("Has llegado a un río. ¿Quieres cruzarlo(1) o dar la vuelta(2)?", imagen2);
        
        Nodo nodo3 = new Nodo("Has visto una cueva, deseas entrar(1) en ella o mejor decides irte?(2).", imagen3);
        Nodo nodo4 = new Nodo("En tu camino por la cueva pisas una trampa, ves como se aceran flechas hacia a ti. !Rapido decide!: Esquivar(1) o Bloquear (2)", imagen4);
        Nodo nodo5 = new Nodo("Has esquivado perfectamente, no sufres heridas, ahora hay un bifurcación. -Hueles algo-Izquierda(1) o -Escuchas algo-Derecha(2)", imagen5);
        Nodo nodo6 = new Nodo("Bloqueaste algunas flechas con tu cuerpo pero, ves como te desangras... Has sido asesinado. Fin del juego", imagen6);
        Nodo nodo7 = new Nodo("Lo que olias era un veneno muy fuerte de plantas de cueva, es demasiado tarde... Fin del juego", imagen8);
        Nodo nodo8 = new Nodo("Lo que escuchabas eran ratas, caminas un rato y encuentras un cofre con joyas y gemas. ¡Felicidades has ganado! ", imagen7);

        Nodo nodo9 = new Nodo("Cruzas el rio perfectamente. A lo lejos ves un humo. Ir a ver(1) o Seguir por otro camino(2)", imagen9);
        Nodo nodo10 = new Nodo("Llegas al sitio del humo. Ves a un grupo bandidos agredir y robarles a hombres y muejeres. ¿Que decides hacer?. Pelear(1) o Irte(2)", imagen10);
        Nodo nodo11 = new Nodo("Consigues vencer a 2 de ellos, sin embargo, son muchos... sabes el destino que te espera. Fin del juego.", imagen11);
        Nodo nodo12 = new Nodo("Buena decisión, aunque te pese en tu conciencia sabes que no es racional pelear. Despues de un rato abandonas el bosque, aunque con cierta pesadez en tu corazón. Fin del juego.", imagen12);
        Nodo nodo13 = new Nodo("Sigues con tu camino por abandonar el bosque. Escuchas algo es... un oso. ¿Qué haces? Correr(1) o Quedarse quieto(2)", imagen13);
        Nodo nodo14 = new Nodo("Corres pero el oso entra en pánico al verte correr y te ataca. Fin del juego.", imagen14);
        Nodo nodo15 = new Nodo("El oso te mira durante unos segundos, luego sigue con su camino y se va. Despues de un rato abandonas el bosque. Fin del juego.", imagen12);

        Nodo nodo16 = new Nodo("Das la vuelta, escuchas murmullos pequeños detras de un arbol. ¿Que haces?. Ver(1) o Irte(2)", imagen15);
        Nodo nodo17 = new Nodo("Miras y son dos niñas pequeñas llorando. Te dicen que se perdieron en su busqueda por dejar el bosque. ¿Qué haces?. Ayudarlas(1) o Dejarlas(2)", imagen16);
        Nodo nodo18 = new Nodo("Los ayudas y abandonas el bosque muy tarde por la noche, los padres de las niñas te agradecen y recompensan, aunque recibes un regaño por parte de tus padres. Fin del juego.", imagen12);
        Nodo nodo19 = new Nodo("No los ayudas, pienas que te entorpecerán en tu camino. Abandonas el bosque en la tarde... al fondo escuchas como unos padres gritan buscando a sus hijos... Fin del juego.", imagen12);
        Nodo nodo20 = new Nodo("Te vas. En tu camino de regreso notas algo en el suelo parece... una apertura? Sientes un sentimiento ominoso. ¿Qué haces?. Entrar(1) o Irte corriendo(2)", imagen17);
        Nodo nodo21 = new Nodo("Entras. Inesperadamente despues de cruzar una puerta todo esta muy limpio, se siente como un laboratorio. Escuchas pasos al fondo del pasillo. !RAPIDO! ¿QUÉ HACES? CORRER(1) O ESCONDERTE (2)", imagen18);
        Nodo nodo22 = new Nodo("CORRES LO MAS RAPIDO QUE PUDES, ALERTAS A TODOS POR TUS PASOS, TE SIGUEN. EN TU CAMINO VES COSAS QUE NUNCA DEBISTE DE VER. ´C-Como esto es posible´ piensas. Es... es muy tarde para pensar eso. No hay mas camino, escuchas mas pasos detras de ti... Fin del juego.", imagen19);
        Nodo nodo23 = new Nodo("TE ESCONDES... afortunadamente no se dieron cuenta, pero.. ´¿Esos eran soldados´ piensas. Esto se siente muy mal. ¿Qué haces?. Te vas(1) o SEGUIR(2) ", imagen20);
        Nodo nodo24 = new Nodo("Te vas. Todo se siente muy irreal. Abandonas el bosque. Espero que no te hayan visto por las camaras... suerte. Fin del juego", imagen12);
        Nodo nodo25 = new Nodo("Sigues, descubres cosas que nunca deberias de haber visto, sin embargo, las camaras te vieron. Oh parece que tu curiosidad a sido tu tumba... Fin del juego.", imagen21);
        Nodo nodo26 = new Nodo("No entras. Sientes que es la mejor decision que has hecho en tu vida. Abandonas el bosque. Fin del juego.", imagen12);
        
        
        rama = nodo1;
        nodo1.setIzquierda(nodo2);
        nodo1.setDerecha(nodo3);
        nodo3.setIzquierda(nodo4);
        nodo3.setDerecha(nodo2);
        nodo4.setIzquierda(nodo5);
        nodo4.setDerecha(nodo6);
        nodo5.setIzquierda(nodo7);
        nodo5.setDerecha(nodo8);
        nodo2.setIzquierda(nodo9);
        nodo9.setIzquierda(nodo10);
        nodo10.setIzquierda(nodo11);
        nodo10.setDerecha(nodo12);
        nodo9.setDerecha(nodo13);
        nodo13.setIzquierda(nodo14);
        nodo13.setDerecha(nodo15);
        nodo2.setDerecha(nodo16);
        nodo16.setIzquierda(nodo17);
        nodo17.setIzquierda(nodo18);
        nodo17.setDerecha(nodo19);
        nodo16.setDerecha(nodo20);
        nodo20.setDerecha(nodo26);
        nodo20.setIzquierda(nodo21);
        nodo21.setIzquierda(nodo22);
        nodo21.setDerecha(nodo23);
        nodo23.setIzquierda(nodo24);
        nodo23.setDerecha(nodo25);
        
        

        nodoActual = rama;
    }

    public void jugar() {
        frame = new JFrame("Juego de Aventura");
        frame.setLocation(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(new Color(21, 100, 155));

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.LIGHT_GRAY);
        outputLabel = new JLabel();
        outputLabel.setPreferredSize(new Dimension(500, 300));
        outputLabel.setVerticalAlignment(JLabel.TOP);
        panel.add(outputLabel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.gray);
        ButonIzquierdo = new JButton("Opcion 1");
        ButonIzquierdo.setBackground(Color.white);
        ButonIzquierdo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	HacerDesicion("izquierda");
            }
        });
        buttonPanel.add(ButonIzquierdo);

        ButonDerecho = new JButton("Opcion 2");
        ButonDerecho.setBackground(Color.white);
        ButonDerecho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	HacerDesicion("derecha");
            }
        });
        buttonPanel.add(ButonDerecho);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);

        outputLabel.setIcon(nodoActual.getImagen());
        outputLabel.setText("<html>" + nodoActual.getMensaje() + "</html>");
    }

    private void HacerDesicion(String decision) {
        if (nodoActual.getIzquierda() == null && nodoActual.getDerecha() == null) {
            // Llegamos a una hoja, fin del juego
            outputLabel.setText("<html>¡Fin del juego!</html>");
            ButonIzquierdo.setEnabled(false);
            ButonDerecho.setEnabled(false);
            JOptionPane.showMessageDialog(null, "<html>¡Fin del juego!</html>");
            System.exit(0);
            return;
        }

        if (decision.equals("izquierda")) {
            nodoActual = nodoActual.getIzquierda();
        } else if (decision.equals("derecha")) {
            nodoActual = nodoActual.getDerecha();
        } else {
            outputLabel.setText("<html>Opción inválida. Por favor, elige nuevamente.</html>");
            return;
        }

        outputLabel.setIcon(nodoActual.getImagen());
        outputLabel.setText("<html>" + nodoActual.getMensaje() + "</html>");
    }

}
public class main {

	public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Game game = new Game();
            game.jugar();
        });
    }

}
