package testCatalogoAutos;

import javax.swing.SwingUtilities;

import catalogoAutos.CatalogoAutosGUI;

public class CatalogoAutosTest {

	public static void main(String[] args) {
		
        SwingUtilities.invokeLater(() -> {
            CatalogoAutosGUI catalogoAutosB = new CatalogoAutosGUI();
            catalogoAutosB.setVisible(true);
        });
	}

}
