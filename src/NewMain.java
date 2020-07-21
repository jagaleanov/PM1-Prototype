
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jgale
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User1 myUser1 = new User1();
        User2 myUser2 = new User2();

        try {

            myUser1.setId(1);

            myUser1.setName(JOptionPane.showInputDialog("Nombre del usuario 1"));

            Object[] opsDocumentType = {"TI", "CC", "CE"};

            String documentType = JOptionPane.showInputDialog(
                    null,
                    "Seleccion el tipo de documento del usuario 1",
                    "Prototype",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opsDocumentType,
                    10)
                    .toString();

            myUser1.setDocumentType(documentType);

            myUser1.setDocumentNumber(Integer.parseInt(JOptionPane.showInputDialog("Nombre del usuario 1")));

            myUser2.setId(2);

            myUser2.setName(JOptionPane.showInputDialog("Nombre del usuario 2"));

            documentType = JOptionPane.showInputDialog(
                    null,
                    "Seleccion el tipo de documento del usuario 2",
                    "Prototype",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opsDocumentType,
                    10)
                    .toString();

            myUser2.setDocumentType(documentType);

            myUser2.setDocumentNumber(Integer.parseInt(JOptionPane.showInputDialog("Nombre del usuario 2")));
            
            
            
            BDUser clone;

            JOptionPane.showMessageDialog(
                    null,
                    "<html>"
                    + "Los datos del usuario 1 son: <br>"
                    + "Id: " + myUser1.getId() + ""
                    + "Nombre: " + myUser1.getName() + ""
                    + "Tipo de documento: " + myUser1.getDocumentType() + ""
                    + "Número de documento: " + myUser1.getDocumentNumber() + ""
                    + "</html>"
            );
            
            clone = myUser2.clone();

            JOptionPane.showMessageDialog(
                    null,
                    "<html>"
                    + "Los datos del usuario clon son: <br>"
                    + "Id: " + clone.getId() + ""
                    + "Nombre: " + clone.getName() + ""
                    + "Tipo de documento: " + clone.getDocumentType() + ""
                    + "Número de documento: " + clone.getDocumentNumber() + ""
                    + "</html>"
            );
            
            
            
            
            
            
            
            

            clone.setId(3);

            clone.setName(JOptionPane.showInputDialog("Nombre del usuario clon"));

            documentType = JOptionPane.showInputDialog(
                    null,
                    "Seleccion el tipo de documento del usuario clon",
                    "Prototype",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opsDocumentType,
                    10)
                    .toString();

            clone.setDocumentType(documentType);

            clone.setDocumentNumber(Integer.parseInt(JOptionPane.showInputDialog("Nombre del usuario clon")));

            JOptionPane.showMessageDialog(
                    null,
                    "<html>"
                    + "Los datos del usuario clon son: <br>"
                    + "Id: " + clone.getId() + ""
                    + "Nombre: " + clone.getName() + ""
                    + "Tipo de documento: " + clone.getDocumentType() + ""
                    + "Número de documento: " + clone.getDocumentNumber() + ""
                    + "</html>"
            );
            

            JOptionPane.showMessageDialog(
                    null,
                    "<html>"
                    + "Los datos del usuario 2 son: <br>"
                    + "Id: " + myUser2.getId() + ""
                    + "Nombre: " + myUser2.getName() + ""
                    + "Tipo de documento: " + myUser2.getDocumentType() + ""
                    + "Número de documento: " + myUser2.getDocumentNumber() + ""
                    + "</html>"
            );

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No se ha recibido ningun dato.");
        }

    }

}
