package catalogoAutos;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CatalogoAutosEventos implements ActionListener{
	
	private CatalogoAutosPanel catalogoAutosPanel;
	
	public CatalogoAutosEventos(CatalogoAutosPanel catalogoAutosPanel) {
        this.catalogoAutosPanel = catalogoAutosPanel;
    }
	
	  @Override
	    public void actionPerformed(ActionEvent e) {
		  
	        if (e.getSource() == catalogoAutosPanel.getBtnAgregar()) {
	           catalogoAutosPanel.agregarAuto();
	           
	        } else if (e.getSource() == catalogoAutosPanel.getBtnMostrar()) {
	        	catalogoAutosPanel.mostrarAutos();
	        	catalogoAutosPanel.mostrarDetalleAutoSeleccionado();
	        	
	        } else if (e.getSource() == catalogoAutosPanel.getCmbClase()) {
	        	catalogoAutosPanel.actualizarComboBoxAutos();
	        	
	        } else if (e.getSource() == catalogoAutosPanel.getCmbAutos()) {
	        	catalogoAutosPanel.mostrarDetalleAutoSeleccionado();
	        	
	        }
    }
	  
	  	
	  
   
}
