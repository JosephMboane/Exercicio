
package tema3_poo.numero4;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author joseph
 */
public class ComparacaoVector {

    private static Vector vectorBooleano1;
    private static Vector vectorBooleano2;
    private static int controle;

    public static void CriaVectores(int a, int p) {
        vectorBooleano1 = new Vector(a);
        vectorBooleano2 = new Vector(p);
        for (int i = 0; i < a; i++) {
            vectorBooleano1.add(Boolean.parseBoolean(JOptionPane.showInputDialog("Valor booleano (false/true) do primeiro vector na posicao " + i)));
        }
        for (int i = 0; i < p; i++) {
            vectorBooleano2.add(Boolean.parseBoolean(JOptionPane.showInputDialog("Valor booleano (true/false) do Segundo vector na posicao " + i)));
        }
    }

    public static void ComparaVectores() {
        if (vectorBooleano1.capacity() != vectorBooleano2.capacity()) {
            JOptionPane.showMessageDialog(null, "Os vectores nao sao identicos, pois nao tem o mesmo tamanho.");
        } else {
            for (int i = 0; i < vectorBooleano1.capacity(); i++) {
                if (vectorBooleano1.get(i).equals(vectorBooleano2.get(i))) {
                    controle++;
                }
            }
            if (vectorBooleano1.capacity() == controle) {
                JOptionPane.showMessageDialog(null, "Os vectores sao identicos, tem o mesmo tamanho e elementos iguais nas suas posicoes correspondentes");
            } else {
                JOptionPane.showMessageDialog(null, "Os vectores nao sao identicos, tem o mesmo mas os elementos nas  posicoes correspondentes nao sao iguais");
            }
        }

    }

    public static void main(String[] args) {
        int capacidade1 = Integer.parseInt(JOptionPane.showInputDialog(" Intrudoza o tamanho do 1 Vector"));
        int capacidade2 = Integer.parseInt(JOptionPane.showInputDialog("Intrudoza o tamanho do 2 Vector"));
        CriaVectores(capacidade1, capacidade2);
        ComparaVectores();
    }

}
