package ar.com.logic;

import ar.com.gui.*;

/**
 *
 * @author Giacobini Gaston
 */
public class App {

    static CurrencyController currencyController = new CurrencyController();
    static CssUnitsController cssUnitsController = new CssUnitsController();

    private static void setFrameDefaultConfig(javax.swing.JFrame Frame) {
        Frame.setVisible(true); // La hace visible 
        Frame.setLocationRelativeTo(null); // La centra en la pantalla
        Frame.setResizable(false); // Hace que mantenga su tamaño
    }

    public static void openCurrencyConverter() {
        CurrencyConverterFrame currencyConverter = new CurrencyConverterFrame(currencyController);
        setFrameDefaultConfig(currencyConverter);
    }

    public static void openCssUnitsConverter() {
        CssUnitsConverterFrame cssUnitsConverter = new CssUnitsConverterFrame(cssUnitsController);
        setFrameDefaultConfig(cssUnitsConverter);
    }

    public static void openMainSelection() {
        MainSelectionFrame mainSelection = new MainSelectionFrame();
        setFrameDefaultConfig(mainSelection);
    }

    public static void main(String[] args) {
        openMainSelection();
    }
}
