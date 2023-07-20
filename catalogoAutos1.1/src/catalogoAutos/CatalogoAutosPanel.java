package catalogoAutos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class CatalogoAutosPanel extends JPanel implements ActionListener{

	//Declaracion de los componentes globales
	
	private static final long serialVersionUID = 1L;	
	private JPanel contentPane;
	private JComboBox<String> cmbAutos;
	private JComboBox<String> cmbClase;
	private JButton btnAgregar, btnMostrar;
	private ArrayList<Auto> autos;
	private ArrayList<Auto> sedanes;
	private ArrayList<Auto> sports;
	private ArrayList<Auto> suvs;
	private JTextField txtNombre;
	private JTextField txtMarca;
	private JTextField txtAnio;
	private JTextField txtModelo;
	private JTextField txtTipo;
	private JTextField txtMotor;
	private JTextField txtPotencia;
	private JTextField txtCombustible;
	private JTextField txtPrecio;
	private JLabel lblDetallesAuto;
	private JPanel pnlDetalles;
	private JLabel lblDetallesAuto1;
	private JButton btnSalir;
	private JLabel lbliformacionAuto;
	private JLabel lblBackground;
	private ImageIcon backgroundImageIcon;
	
	//Constructor del Catalogo de autos
	
	public CatalogoAutosPanel() {
		
		 setContentPane(this);
		
	//iniciarComponentes();
        
        setLayout(null);
        setBackground(new Color(0, 102, 153));
        setPreferredSize(new Dimension(940, 510));
        
		contentPane.setLayout(null);
		
			
		JPanel pnlGeneral = new JPanel();
		pnlGeneral.setBackground(new Color(0, 102, 153));
		pnlGeneral.setBounds(0, 0, 388, 661);
		contentPane.add(pnlGeneral);
		pnlGeneral.setLayout(null);
			
		btnAgregar = new JButton("Agregar Datos e Imagen de Auto");
		btnAgregar.setBounds(43, 441, 310, 23);
		pnlGeneral.add(btnAgregar);
		
			
		cmbClase = new JComboBox<>(new String[]{"Sedan", "Sport", "Suv"});
		cmbClase.setBounds(10, 61, 157, 21);
		pnlGeneral.add(cmbClase);
			
		cmbAutos = new JComboBox<String>();
		cmbAutos.setBounds(196, 60, 169, 22);
		pnlGeneral.add(cmbAutos);
			
		JPanel pnlDatos = new JPanel();
		pnlDatos.setBounds(10, 143, 368, 287);
		pnlGeneral.add(pnlDatos);
		pnlDatos.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlDatos.setBackground(new Color(0, 102, 153));
		pnlDatos.setLayout(null);
			
		JLabel lblDatosGenerales = new JLabel("Datos Generales");
		lblDatosGenerales.setForeground(SystemColor.desktop);
		lblDatosGenerales.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDatosGenerales.setBounds(10, 111, 136, 21);
		pnlGeneral.add(lblDatosGenerales);
			
		JLabel lblNombre = new JLabel("Nombre Auto");
		lblNombre.setBounds(10, 0, 126, 14);
		pnlDatos.add(lblNombre);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 12));
			
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setForeground(SystemColor.desktop);
		lblMarca.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMarca.setBounds(10, 54, 37, 25);
		pnlDatos.add(lblMarca);
			
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setForeground(SystemColor.desktop);
		lblModelo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblModelo.setBounds(10, 83, 62, 25);
		pnlDatos.add(lblModelo);
			
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setForeground(SystemColor.desktop);
		lblTipo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTipo.setBounds(10, 119, 37, 25);
		pnlDatos.add(lblTipo);
		
		JLabel lblCombustible = new JLabel("Combustible");
		lblCombustible.setForeground(SystemColor.desktop);
		lblCombustible.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCombustible.setBounds(10, 199, 111, 25);
		pnlDatos.add(lblCombustible);
		
		JLabel lblMotor = new JLabel("Motor");
		lblMotor.setForeground(SystemColor.desktop);
		lblMotor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMotor.setBounds(10, 155, 62, 25);
		pnlDatos.add(lblMotor);
		
		JLabel lblPotencia = new JLabel("Potencia");
		lblPotencia.setForeground(SystemColor.desktop);
		lblPotencia.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPotencia.setBounds(228, 155, 57, 25);
		pnlDatos.add(lblPotencia);
		
		JLabel lblAnio = new JLabel("Año");
		lblAnio.setForeground(SystemColor.desktop);
		lblAnio.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAnio.setBounds(248, 54, 37, 25);
		pnlDatos.add(lblAnio);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setForeground(SystemColor.desktop);
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrecio.setBounds(10, 248, 73, 25);
		pnlDatos.add(lblPrecio);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(94, 57, 144, 20);
		pnlDatos.add(txtMarca);
		txtMarca.setColumns(10);
		
		txtAnio = new JTextField();
		txtAnio.setBounds(285, 57, 73, 20);
		pnlDatos.add(txtAnio);
		txtAnio.setColumns(10);
		
		txtModelo = new JTextField();
		txtModelo.setBounds(94, 86, 210, 20);
		pnlDatos.add(txtModelo);
		txtModelo.setColumns(10);
		
		txtTipo = new JTextField();
		txtTipo.setBounds(94, 122, 210, 20);
		pnlDatos.add(txtTipo);
		txtTipo.setColumns(10);
		
		txtMotor = new JTextField();
		txtMotor.setBounds(94, 158, 124, 20);
		pnlDatos.add(txtMotor);
		txtMotor.setColumns(10);
		
		txtPotencia = new JTextField();
		txtPotencia.setBounds(285, 158, 73, 20);
		pnlDatos.add(txtPotencia);
		txtPotencia.setColumns(10);
		
		txtCombustible = new JTextField();
		txtCombustible.setBounds(94, 202, 124, 20);
		pnlDatos.add(txtCombustible);
		txtCombustible.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(97, 251, 121, 20);
		pnlDatos.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(10, 22, 348, 21);
		pnlDatos.add(txtNombre);
		txtNombre.setColumns(10);
		

		btnMostrar = new JButton("Mostrar Auto");
		btnMostrar.setBounds(252, 112, 113, 23);
		pnlGeneral.add(btnMostrar);
		
		JLabel lblClaseAuto = new JLabel("Elija un tipo de Auto");
		lblClaseAuto.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblClaseAuto.setBounds(10, 27, 157, 23);
		pnlGeneral.add(lblClaseAuto);
		
		JLabel lblElijaUnAuto = new JLabel("Elija un Auto del Catalogo");
		lblElijaUnAuto.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblElijaUnAuto.setBounds(196, 27, 169, 23);
		pnlGeneral.add(lblElijaUnAuto);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(153, 475, 90, 23);
		pnlGeneral.add(btnSalir);
		
		
		pnlDetalles = new JPanel();
		pnlDetalles.setBackground(SystemColor.activeCaption);
		pnlDetalles.setBounds(392, 354, 538, 145);
		contentPane.add(pnlDetalles);
		pnlDetalles.setLayout(null);
		
		lblDetallesAuto = new JLabel("");
		lblDetallesAuto.setBounds(10, 24, 201, 110);
		pnlDetalles.add(lblDetallesAuto);
		lblDetallesAuto.setVerticalAlignment(SwingConstants.TOP);
		lblDetallesAuto.setForeground(SystemColor.desktop);
		lblDetallesAuto.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		lblDetallesAuto1 = new JLabel("");
		lblDetallesAuto1.setVerticalAlignment(SwingConstants.TOP);
		lblDetallesAuto1.setForeground(SystemColor.desktop);
		lblDetallesAuto1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDetallesAuto1.setBounds(286, 24, 201, 111);
		pnlDetalles.add(lblDetallesAuto1);
		
		lbliformacionAuto = new JLabel("Informació del Vehiculo");
		lbliformacionAuto.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbliformacionAuto.setBounds(10, 0, 183, 14);
		pnlDetalles.add(lbliformacionAuto);
		
		btnAgregar.addActionListener(this);
		btnMostrar.addActionListener(this);
		btnSalir.addActionListener(this);
		cmbClase.addActionListener(this);
		cmbAutos.addActionListener(this);
		
		JPanel pnlimagen = new JPanel();
		pnlimagen.setBackground(SystemColor.activeCaption);
		pnlimagen.setBounds(392, 11, 538, 346);
		add(pnlimagen);
		pnlimagen.setLayout(null);		
		
		
		//Codigo para insertar imagen en Jlabel y ajustar imagen
		
		String imagePath = ".\\src\\images\\fondo.jpg";
		ImageIcon imageIcon = new ImageIcon(imagePath);
		lblBackground = new JLabel(imageIcon);
		lblBackground.setBounds(0, 0, 538, 346);
		pnlimagen.add(lblBackground);
		
		ImageIcon originalImageIcon = new ImageIcon(imagePath);
		backgroundImageIcon = new ImageIcon(originalImageIcon.getImage());

		Image image = imageIcon.getImage();		
		int panelWidth = pnlimagen.getWidth();
		int panelHeight = pnlimagen.getHeight();
		Image scaledImage = image.getScaledInstance(panelWidth, panelHeight, Image.SCALE_SMOOTH);
		ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
		
		lblBackground.setIcon(scaledImageIcon);
		
		//Incializar instancias
		    autos = new ArrayList<>();
		    sedanes = new ArrayList<>();
		    sports = new ArrayList<>();
		    suvs = new ArrayList<>();

	}

// METODOS GETTERS Y SETTERS

	public JPanel getContentPane() {
		return contentPane;
	}



	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}



	public JComboBox<String> getCmbAutos() {
		return cmbAutos;
	}



	public void setCmbAutos(JComboBox<String> cmbAutos) {
		this.cmbAutos = cmbAutos;
	}



	public JComboBox<String> getCmbClase() {
		return cmbClase;
	}



	public void setCmbClase(JComboBox<String> cmbClase) {
		this.cmbClase = cmbClase;
	}



	public JButton getBtnAgregar() {
		return btnAgregar;
	}



	public void setBtnAgregar(JButton btnAgregar) {
		this.btnAgregar = btnAgregar;
	}



	public JButton getBtnMostrar() {
		return btnMostrar;
	}



	public void setBtnMostrar(JButton btnMostrar) {
		this.btnMostrar = btnMostrar;
	}



	public ArrayList<Auto> getAutos() {
		return autos;
	}



	public void setAutos(ArrayList<Auto> autos) {
		this.autos = autos;
	}



	public ArrayList<Auto> getSedanes() {
		return sedanes;
	}



	public void setSedanes(ArrayList<Auto> sedanes) {
		this.sedanes = sedanes;
	}



	public ArrayList<Auto> getSports() {
		return sports;
	}



	public void setSports(ArrayList<Auto> sports) {
		this.sports = sports;
	}



	public ArrayList<Auto> getSuvs() {
		return suvs;
	}



	public void setSuvs(ArrayList<Auto> suvs) {
		this.suvs = suvs;
	}



	public JTextField getTxtNombre() {
		return txtNombre;
	}



	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}



	public JTextField getTxtMarca() {
		return txtMarca;
	}



	public void setTxtMarca(JTextField txtMarca) {
		this.txtMarca = txtMarca;
	}



	public JTextField getTxtAnio() {
		return txtAnio;
	}



	public void setTxtAnio(JTextField txtAnio) {
		this.txtAnio = txtAnio;
	}



	public JTextField getTxtModelo() {
		return txtModelo;
	}



	public void setTxtModelo(JTextField txtModelo) {
		this.txtModelo = txtModelo;
	}



	public JTextField getTxtTipo() {
		return txtTipo;
	}



	public void setTxtTipo(JTextField txtTipo) {
		this.txtTipo = txtTipo;
	}



	public JTextField getTxtMotor() {
		return txtMotor;
	}



	public void setTxtMotor(JTextField txtMotor) {
		this.txtMotor = txtMotor;
	}



	public JTextField getTxtPotencia() {
		return txtPotencia;
	}



	public void setTxtPotencia(JTextField txtPotencia) {
		this.txtPotencia = txtPotencia;
	}



	public JTextField getTxtCombustible() {
		return txtCombustible;
	}



	public void setTxtCombustible(JTextField txtCombustible) {
		this.txtCombustible = txtCombustible;
	}



	public JTextField getTxtPrecio() {
		return txtPrecio;
	}



	public void setTxtPrecio(JTextField txtPrecio) {
		this.txtPrecio = txtPrecio;
	}



	public JLabel getLblDetallesAuto() {
		return lblDetallesAuto;
	}



	public void setLblDetallesAuto(JLabel lblDetallesAuto) {
		this.lblDetallesAuto = lblDetallesAuto;
	}



	public JPanel getPnlDetalles() {
		return pnlDetalles;
	}



	public void setPnlDetalles(JPanel pnlDetalles) {
		this.pnlDetalles = pnlDetalles;
	}



	public JLabel getLblDetallesAuto1() {
		return lblDetallesAuto1;
	}



	public void setLblDetallesAuto1(JLabel lblDetallesAuto1) {
		this.lblDetallesAuto1 = lblDetallesAuto1;
	}
	
	

	
	/* public void limpiarCampos() {
		 
	        txtNombre.setText("");
	        txtMarca.setText("");
	        txtModelo.setText("");
	        txtTipo.setText("");
	        txtCombustible.setText("");
	        txtAnio.setText("");
	        txtMotor.setText("");
	        txtPotencia.setText("");
	        txtPrecio.setText("");
	    }*/
	 
	//Metodo para los eventos de los botones
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == btnAgregar) {
	            agregarAuto();
	            
	        } else if (e.getSource() == btnMostrar) {
	            mostrarAutos();
	            mostrarDetalleAutoSeleccionado();
	            
	        } else if (e.getSource() == cmbClase) {
	            actualizarComboBoxAutos();
	            
	        } else if (e.getSource() == cmbAutos) {
	          
	        }
			
			if (e.getSource() == btnSalir) {
		        System.exit(0);
		    }
			
			
		}
		
		// Método para agregar un nuevo auto a la lista
	    public void agregarAuto() {
	    	
	        String nombre = txtNombre.getText();
	        String marca = txtMarca.getText();
	        String modelo = txtModelo.getText();
	        String tipo = txtTipo.getText();
	        String combustible = txtCombustible.getText();
	      
	        
	        int anio = 0;
	        try {
	            anio = Integer.parseInt(txtAnio.getText().trim());
	        } catch (NumberFormatException ex) {
	            System.out.println("Error Campo anio null ");
	        }

	        double motor = 0;
	        try {
	            motor = Double.parseDouble(txtMotor.getText().trim());
	        } catch (NumberFormatException ex) {
	            System.out.println("Error Campo motor null ");
	        }

	        int potencia = 0;
	        try {
	            potencia = Integer.parseInt(txtPotencia.getText().trim());
	        } catch (NumberFormatException ex) {
	            System.out.println("Error Campo potencia null ");
	        }

	        int precio = 0;
	        try {
	            precio = Integer.parseInt(txtPrecio.getText().trim());
	        } catch (NumberFormatException ex) {
	            System.out.println("Error Campo precio null ");
	        }
	        
	        
	        if (nombre.isEmpty() || marca.isEmpty() || modelo.isEmpty() || tipo.isEmpty() || combustible.isEmpty()) {
	            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos antes de agregar un auto.");
	       
	        } else {
	        		String claseSeleccionada = (String) cmbClase.getSelectedItem();
	        
	        // Crear el objeto Auto según la clase seleccionada
	        Auto auto = null;
	        
	        if (claseSeleccionada.equals("Sedan")) {
	        	
	        	auto = new Sedan(precio, nombre, marca, modelo, tipo, combustible, anio, motor, potencia, precio);
	            sedanes.add(auto);
	            
	            
	        } else if (claseSeleccionada.equals("Sport")) {
	        	auto = new Sport(precio, nombre, marca, modelo, tipo, combustible, anio, motor, potencia, precio);
	        	sports.add(auto);
	        	
	        	
	        } else {
	        	auto = new Suv(precio, nombre, marca, modelo, tipo, combustible, anio, motor, potencia, precio);
	        	suvs.add(auto);
	        }
	        
	        
	        String imagePath = getImagePath();
	        if (imagePath != null) {
	            auto.setImagen(imagePath);
	        }
	        
	        autos.add(auto);
	        cmbAutos.addItem(nombre);
	
	        // Limpiar los campos de entrada
	        txtNombre.setText("");
	        txtMarca.setText("");
	        txtModelo.setText("");
	        txtTipo.setText("");
	        txtCombustible.setText("");
	        txtAnio.setText("");
	        txtMotor.setText("");
	        txtPotencia.setText("");
	        txtPrecio.setText("");
	        
	        JOptionPane.showMessageDialog(this, "Auto agregado con éxito");

	        
	        }
	        
	    }
	    
	 
	    
	    // Método para mostrar los autos almacenados
	   public void mostrarAutos() {
	    	
	    	
	    	 cmbAutos.removeAllItems();

	         String claseSeleccionada = (String) cmbClase.getSelectedItem();

	         if (claseSeleccionada.equals("Sedan")) {
	             for (Auto auto : sedanes) {
	                 cmbAutos.addItem(auto.getNombre());
	             }
	         } else if (claseSeleccionada.equals("Sport")) {
	             for (Auto auto : sports) {
	                 cmbAutos.addItem(auto.getNombre());
	             }
	         } else {
	             for (Auto auto : suvs) {
	                 cmbAutos.addItem(auto.getNombre());
	             }
	         }
	    }
	    
	    
	    
	  public void mostrarDetalleAuto(Auto auto) {
	       
	    	StringBuilder sbDetalleAuto = new StringBuilder();    	
	        
	    	  if (auto instanceof Sedan) {
	    	        int id = ((Sedan) auto).getId();
	    	        sbDetalleAuto.append("ID: ").append(id).append("<br>");
	    	    } else if (auto instanceof Sport) {
	    	        int id = ((Sport) auto).getId();
	    	        sbDetalleAuto.append("ID: ").append(id).append("<br>");
	    	    } else if (auto instanceof Suv) {
	    	        int id = ((Suv) auto).getId();
	    	        sbDetalleAuto.append("ID: ").append(id).append("<br>");
	    	    }
	    	  
	    	  if (auto.getImagen() != null) {
	    	        ImageIcon imageIcon = new ImageIcon(auto.getImagen());
	    	        
	    	        // Ajustar la imagen al tamaño del JLabel lblBackground
	    	        Image image = imageIcon.getImage();
	    	        int panelWidth = lblBackground.getWidth();
	    	        int panelHeight = lblBackground.getHeight();
	    	        Image scaledImage = image.getScaledInstance(panelWidth, panelHeight, Image.SCALE_SMOOTH);
	    	        ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
	    	        lblBackground.setIcon(scaledImageIcon);
	    	    } 
	    	  else {
	    	        lblBackground.setIcon(null); // Si no hay imagen, se elimina la imagen del JLabel.
	    	    }
	    	  
	    	
	    	sbDetalleAuto.append("Nombre: ").append(auto.getNombre()).append("<br>");
	    	sbDetalleAuto.append("Marca: ").append(auto.getMarca()).append("<br>");
	    	sbDetalleAuto.append("Modelo: ").append(auto.getModelo()).append("<br>");
	    	sbDetalleAuto.append("Tipo: ").append(auto.getTipo()).append("<br>");
	    	
	    	StringBuilder sbDetalleAuto1 = new StringBuilder();
	    	
	    	sbDetalleAuto1.append("Combustible: ").append(auto.getCombustible()).append("<br>");
	    	sbDetalleAuto1.append("Año: ").append(auto.getAnio()).append("<br>");
	    	sbDetalleAuto1.append("Motor: ").append(auto.getMotor()).append("<br>");
	    	sbDetalleAuto1.append("Potencia: ").append(auto.getPotencia()).append("<br>");
	    	sbDetalleAuto1.append("Precio : $").append(auto.getPrecio()).append("<br><br>");

	        lblDetallesAuto.setText("<html>" + sbDetalleAuto.toString() + "</html>");
	        lblDetallesAuto1.setText("<html>" + sbDetalleAuto1.toString() + "</html>");
	    }
	    
	    
	    public void actualizarComboBoxAutos() {
	    	
	        cmbAutos.removeAllItems();

	        String claseSeleccionada = (String) cmbClase.getSelectedItem();
	        System.out.println("Clase seleccionada: " + claseSeleccionada);

	        for (Auto auto : autos) {
	        	System.out.println("Tipo del auto: " + auto.getTipo());
	            if (auto.getTipo().equals(claseSeleccionada)) {
	                cmbAutos.addItem(auto.getNombre());
	            }
	        }
	    }
   
	    
  public void mostrarDetalleAutoSeleccionado() {
	    	
	    	 int indiceAutoSeleccionado = cmbAutos.getSelectedIndex();
	    	 
	         if (indiceAutoSeleccionado >= 0) {
	             String claseSeleccionada = (String) cmbClase.getSelectedItem();
	             Auto autoSeleccionado = null;

	             if (claseSeleccionada.equals("Sedan")) {
	                 if (indiceAutoSeleccionado < sedanes.size()) {
	                     autoSeleccionado = sedanes.get(indiceAutoSeleccionado);
	                 }
	             } else if (claseSeleccionada.equals("Sport")) {
	                 if (indiceAutoSeleccionado < sports.size()) {
	                     autoSeleccionado = sports.get(indiceAutoSeleccionado);
	                 }
	             } else {
	                 if (indiceAutoSeleccionado < suvs.size()) {
	                     autoSeleccionado = suvs.get(indiceAutoSeleccionado);
	                 }
	             }

	             if (autoSeleccionado != null) {
	                 mostrarDetalleAuto(autoSeleccionado);
	             }
	         }
	    }
	    
	    
	    
  public void cargarFoto() {
	   	
	        JFileChooser fileChooser = new JFileChooser();
	        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imágenes", "jpg", "jpeg", "png", "gif");
	        fileChooser.setFileFilter(filter);

	        int result = fileChooser.showOpenDialog(this);
	        if (result == JFileChooser.APPROVE_OPTION) {
	        	
	            File selectedFile = fileChooser.getSelectedFile();
	            String imagePath = selectedFile.getPath();
	            
	            ImageIcon imageIcon = new ImageIcon(imagePath);
	            lblBackground.setIcon(imageIcon);

	            // Ajustar la imagen al tamaño del JLabel lblBackground
	            
	            Image image = imageIcon.getImage();
	            int panelWidth = lblBackground.getWidth();
	            int panelHeight = lblBackground.getHeight();
	            Image scaledImage = image.getScaledInstance(panelWidth, panelHeight, Image.SCALE_SMOOTH);
	            ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
	            lblBackground.setIcon(scaledImageIcon);

	            // Guardar la imagen en la carpeta images del proyecto
	            
	            String destinationPath = ".\\src\\images\\" + selectedFile.getName();
	            File destinationFile = new File(destinationPath);
	            try {
	                Files.copy(selectedFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
	            } catch (IOException e) {
	                e.printStackTrace();
	                JOptionPane.showMessageDialog(this, "Error al guardar la imagen.");
	            }
	        }
	        
	    	lblBackground.setIcon(backgroundImageIcon);
	    }
	    
	    private String getImagePath() {
	    	
	        JFileChooser fileChooser = new JFileChooser();
	        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imágenes", "jpg", "jpeg", "png", "gif");
	        fileChooser.setFileFilter(filter);

	        int result = fileChooser.showOpenDialog(this);
	        if (result == JFileChooser.APPROVE_OPTION) {
	            File selectedFile = fileChooser.getSelectedFile();
	            return selectedFile.getPath();
	        } else {
	        	
	            // Si el usuario cancela la selección, devolvemos null
	            return null;
	        }
	    }
}
