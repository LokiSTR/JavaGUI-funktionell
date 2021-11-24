import controller.MainController;

public class App {  
    public static void main(String[] args) {  
        // Erstellen des MainControllers - wir speichern ihn nicht zwischen, da alles Weitere im MainController verwaltet wird. Sollten wir hier später noch andere Dinge tun wollen, die VOR dem eigentlich Start des Programmes ablaufen, haben wir hier einen guten Einstiegspunkt.
        new MainController();
    }
}  