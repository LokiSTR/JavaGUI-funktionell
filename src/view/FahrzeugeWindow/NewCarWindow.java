package view.FahrzeugeWindow;
import javax.swing.*;

import controller.FahrzeugeController.NewCarController;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewCarWindow {
    
    JFrame _mainFrame;
    JPanel _mainPanel;
    JButton _addCarBtn;

    JTextField _tf_marke;
    JTextField _tf_typ;
    JTextField _tf_ps;
    JTextField _tf_sitze;

    NewCarController _mc;



    public NewCarWindow(NewCarController newCarController){
        setNewCarController(newCarController);
        setMainPanel(new JPanel());
        getMainPanel().setLayout(new FlowLayout());
        // Neues Hauptfenster erstellen
        setMainFrame(new JFrame());
        getMainFrame().setTitle("Neues Auto erstellen");
        
        // Eingabefelder für das Auto erstellen
        JLabel l_marke = new JLabel("Marke");
        getMainPanel().add(l_marke);
        // Textfeld erstellen
        _tf_marke = new JTextField("", 15);
        // Textfeld dem Panel hinzufügen
        getMainPanel().add(_tf_marke);

        // Eingabefelder für das Auto erstellen
        JLabel l_ps = new JLabel("PS");
        getMainPanel().add(l_ps);
        // Textfeld erstellen
        _tf_ps = new JTextField("", 15);
        // Textfeld dem Panel hinzufügen
        getMainPanel().add(_tf_ps);

        // Eingabefelder für das Auto erstellen
        JLabel l_typ = new JLabel("Typ");
        getMainPanel().add(l_typ);
        // Textfeld erstellen
        _tf_typ = new JTextField("", 15);
        // Textfeld dem Panel hinzufügen
        getMainPanel().add(_tf_typ);

        // Eingabefelder für das Auto erstellen
        JLabel l_sitze = new JLabel("Sitze");
        getMainPanel().add(l_sitze);
        // Textfeld erstellen
        _tf_sitze = new JTextField("", 15);
        // Textfeld dem Panel hinzufügen
        getMainPanel().add(_tf_sitze);


        _addCarBtn = new JButton("Auto speichern");
        _addCarBtn.setBounds(0,0,0,0);
        _addCarBtn.addActionListener(new saveCarListener());
        getMainPanel().add(_addCarBtn);

        // Breite und Höhe des Fensters setzen
        getMainFrame().setSize(800,100);

        // Fenster anzeigen
        getMainFrame().setVisible(true);
        
        // Standard-Operation, wenn das Fenster geschlossen wird
        getMainFrame().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        getMainFrame().add(getMainPanel());
    }

     /**
     * 
     * Action Listener
     */
    class saveCarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == _addCarBtn){
                System.out.println("Auto speichern - Daten aktualisieren und in neue Ansicht wechseln.");
                System.out.println(_tf_marke.getText());
                System.out.println(_tf_ps.getText());
                System.out.println(_tf_typ.getText());
                System.out.println(_tf_sitze.getText());
                // Fenster ausblenden
                getMainFrame().setVisible(false);

                // Dem Controller die Daten übergeben
                getNewCarController().addNewCar(_tf_marke.getText(), _tf_ps.getText(), _tf_typ.getText(), _tf_sitze.getText());
            }
        }
    }


     /**
     * 
     * SETTER UND GETTER
     */
    public JFrame getMainFrame() {
        return _mainFrame;
    }

    public void setMainFrame(JFrame _mainFrame) {
        this._mainFrame = _mainFrame;
    }

    public void setMainPanel(JPanel _mainPanel) {
        this._mainPanel = _mainPanel;
    }

    public JPanel getMainPanel() {
        return _mainPanel;
    }

    public void setNewCarController(NewCarController _mc) {
        this._mc = _mc;
    }

    public NewCarController getNewCarController() {
        return _mc;
    }
}
