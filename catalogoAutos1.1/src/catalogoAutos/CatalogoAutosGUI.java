package catalogoAutos;



import java.util.ArrayList;

import javax.swing.JFrame;

public class CatalogoAutosGUI extends JFrame {


	private static final long serialVersionUID = 1L;

	public CatalogoAutosGUI() {
		        
        setTitle("Catalogo de Vehiculos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setBounds(100, 100, 998, 544);
        iniciarGUI();
    }

    private void iniciarGUI() {
    	
    	ArrayList<Auto> autos = new ArrayList<>();
        ArrayList<Auto> sedanes = new ArrayList<>();
        ArrayList<Auto> sports = new ArrayList<>();
        ArrayList<Auto> suvs = new ArrayList<>();
        
        CatalogoAutosPanel catalogoAutosPanel = new CatalogoAutosPanel();
        catalogoAutosPanel = new CatalogoAutosPanel();
        catalogoAutosPanel.setAutos(autos);
        catalogoAutosPanel.setSedanes(sedanes);
        catalogoAutosPanel.setSports(sports);
        catalogoAutosPanel.setSuvs(suvs);
        
       
        getContentPane().add(catalogoAutosPanel);

        CatalogoAutosEventos evento = new CatalogoAutosEventos(catalogoAutosPanel);
        catalogoAutosPanel.getBtnAgregar().addActionListener(evento);
        catalogoAutosPanel.getBtnMostrar().addActionListener(evento);
        catalogoAutosPanel.getCmbClase().addActionListener(evento);
        catalogoAutosPanel.getCmbAutos().addActionListener(evento);
        
    }

  

}
