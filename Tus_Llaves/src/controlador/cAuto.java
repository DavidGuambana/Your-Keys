package controlador;

import controlador.otros.RoundedLabel;
import controlador.otros.Validaciones;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.System.Logger;
import java.sql.SQLException;
import java.util.logging.Level;
import modelo.mAuto;
import vista.vAuto;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modelo.mCategoria;
import modelo.mEstado;
import modelo.mImagen;
import modelo.mMarca;
import modelo.mModelo;
import modelo.tablas.Auto;
import modelo.tablas.Categoria;
import modelo.tablas.Estado;
import modelo.tablas.Marca;
import modelo.tablas.Modelo;

public  class cAuto {
    private final mAuto modeloAuto;
    private final mCategoria combobox1 = new mCategoria();
    private final mMarca combobox2 = new mMarca();
    private final mModelo combobox3 = new mModelo();
    private final vAuto vista;
    private final mEstado modesta =new mEstado();
    mImagen mi = new mImagen();
    public static ResultSet rs = null;
    List<Auto> autos = new ArrayList<>();
    List<Categoria> categorias = new ArrayList<>();
    List<Marca> marcas = new ArrayList<>();
    List<Modelo> modelos = new ArrayList<>();
    List<Estado> estados = new ArrayList<>();
    DefaultTableModel dtm;
    String[] columnas = {"Matrícula", "ID_categoría", "ID_modelo","Color","Precio diario","ID_estado","Capacidad","Potencia"};
    String ruta = "";
    Validaciones validar = new Validaciones();
    String id = "";
    RoundedLabel rl = new RoundedLabel();
    
    
    public cAuto(mAuto modeloAuto,vAuto vista) {
        this.modeloAuto = modeloAuto;
        this.vista = vista;
        vista.setVisible(true);
        visualizar("");
        mostrarCategoria();
        mostrarMarcas();
        modesta.llenarComboBox(vista.getCbEstado());
        seleccionar(vista.getJtAutos()); 
         controlKey();
       
    }
    
    private void visualizar(String id) {
        dtm = new DefaultTableModel(null, columnas);
        autos = modeloAuto.listar(id);
        autos.stream().forEach(p -> dtm.addRow(new Object[]{p.getMatricula(), p.getId_categoria(), p.getId_modelo(),p.getColor(),p.getPrecio_diario(),p.getId_estado(),p.getCapacidad(),p.getPotencia()}));
        vista.getJtAutos().setModel(dtm);
        vista.getJtAutos().setRowHeight(30);
    }
    
    public void seleccionar(JTable t) {
        t.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 1) {
                    id = t.getValueAt(t.getSelectedRow(), 0).toString();
                    llenarPerfil();
                    editarmodo();
                    blockydesblck(false);

                }
            }
        });
    }
    
    public void iniciarCtrlBtn() {
        vista.getBtn_ModoEditar().addActionListener(l -> editarmodo());
        vista.getBtn_ModoNuevo().addActionListener(l -> crearmodo());
        vista.getBtn_ModoVista().addActionListener(l -> eliminarver());
        vista.getJbOK().addActionListener(l-> accionboton());
        vista.getCbMarca().addActionListener(l-> ObtenerModelos());
        vista.getBtnExaminar().addActionListener(l->examinarImagen());
         


        
       
    }
        public void controlKey() {
               
        vista.getTxtMatricula().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
              controlador.otros.Validar.nombre_compuesto(vista.getTxtMatricula(), 7);      
                
            }
        });

        vista.getTxtPrecio().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
              controlador.otros.Validar.dinero(vista.getTxtPrecio(), 6);
            }
        });
        
        vista.getTxtColor().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
             controlador.otros.Validar.letras(vista.getTxtColor(), 20);    
            }
        });
        
        vista.getTxtPotencia().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                controlador.otros.Validar.numero(vista.getTxtPotencia(), 4); 
               
            }
        });
    }
  
    public void editarmodo() {
        blockydesblck(true);
        vista.getTxtMatricula().setEditable(false);
        vista.getJbOK().setText("ACTUALIZAR");
        vista.getLbModo().setText("Actualizar autos");
    }

    public void crearmodo() {
        vaciarperfil();
        blockydesblck(true);
        vista.getJbOK().setText("REGISTRAR");
        vista.getLbModo().setText("Registrar autos");
    }

    public void eliminarver() {
        blockydesblck(false);
        vista.getJbOK().setText("ELIMINAR");
        vista.getLbModo().setText("Eliminar autos");
    }

    public void accionboton() {

        if (vista.getJbOK().getText().equals("ACTUALIZAR")) {
            if (lleno()) {
                if (valiprecio()) {
                    setearautoMOD();
                    modeloAuto.actualizar();
                    visualizar("");
                    JOptionPane.showMessageDialog(null, "Actualizado correctamente");
                } else {

                }
            }
        }
        if (vista.getJbOK().getText().equals("REGISTRAR")) {
            if (lleno()) {
                if (!valiprecio()||existep()==1||!valimatri()){  
                } else {
                    setearauto();
                    modeloAuto.crear();
                    visualizar("");
                    JOptionPane.showMessageDialog(null, "Registrado correctamente");
                }
            }
        }
        if (vista.getJbOK().getText().equals("ELIMINAR")) {
            if (lleno()) {
                modeloAuto.eliminar(vista.getTxtMatricula().getText());
                visualizar("");
                vaciarperfil();
                JOptionPane.showMessageDialog(null, "Eliminado correctamente");
            }
        }
    }
       
 public void examinarImagen() {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Seleccione una imagen JPG, PNG & GIF", "jpg", "png", "gif");
        fileChooser.setFileFilter(extensionFilter);
        if (fileChooser.showOpenDialog(vista) == JFileChooser.APPROVE_OPTION) {
            ruta = fileChooser.getSelectedFile().getAbsolutePath();
            Image image = new ImageIcon(ruta).getImage();
            ImageIcon icon = new ImageIcon(image.getScaledInstance(vista.getLbFoto().getWidth(), vista.getLbFoto().getHeight(), 0));
            vista.getLbFoto().setIcon(icon);
            mi.setNombre(fileChooser.getSelectedFile().getName());
            mi.setValor(getByte(ruta));
            getIcon();
        }
    }
       public byte[] getByte(String ruta) {
        File imagen = new File(ruta);
        try {
            byte[] icono = new byte[(int) imagen.length()];
            InputStream input = new FileInputStream(imagen);
            input.read(icono);
            return icono;
        } catch (IOException e) {
            return null;
        }
    }
     public void getIcon() {
    if (mi.getValor() == null) {
        vista.getLbFoto().setIcon(null);
    } else {
        try {
            byte[] valor = mi.getValor();
            InputStream inputStream = new ByteArrayInputStream(valor);
            BufferedImage bufferedImage = ImageIO.read(inputStream);
            // Llama al método setRoundedImage
            rl.setRoundedImage2(bufferedImage, vista.getLbFoto());
        } catch (IOException ex) {
            vista.getLbFoto().setIcon(null);
        }
    }
}
    
     public void llenarPerfil() {
        rs = modeloAuto.join(id);
        if (rs != null) {
            try {
                vista.getTxtMatricula().setText((rs.getString(1)));
                vista.getTxtColor().setText(rs.getString(4));
                vista.getTxtPrecio().setText(String.valueOf(rs.getDouble(5)));
                vista.getTxtPotencia().setText(String.valueOf(rs.getInt(8)));
                vista.getTxtCapacidad().setText(String.valueOf(rs.getInt(7)));
                estados = modesta.listar(rs.getInt(6));
                vista.getCbEstado().setSelectedItem(estados.get(0).getNombre());
                categorias = combobox1.listar(rs.getInt(2));
                vista.getCbCategoria().setSelectedItem(categorias.get(0).getNombre());
                modelos = combobox3.listar(rs.getInt(3));
                vista.getCbMarca().setSelectedItem(rs.getString(14));
                vista.getCbModelo().setSelectedItem(rs.getString(11));
                mi.setId(rs.getInt(15));
                mi.setNombre(rs.getString(16));
                mi.setValor(rs.getBytes(17));
                getIcon();
                int idfoto = rs.getInt(15);
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(cAuto.class.getName()).log(Level.SEVERE, null, ex);
            }
          
        }

    }
    
    public void setearauto(){
        
            int ID_Categoria=combobox1.idcate(vista.getCbCategoria().getSelectedItem().toString());
            int ID_Marca = buscarMarca();
            int ID_modelo = combobox3.idmodelo(vista.getCbModelo().getSelectedItem().toString());
            int id_estado=modesta.obtenerID(vista.getCbEstado().getSelectedItem().toString());
            modeloAuto.setMatricula(vista.getTxtMatricula().getText());
            modeloAuto.setId_categoria(ID_Categoria);     
            modeloAuto.setId_modelo(ID_modelo);
            modeloAuto.setId_estado(id_estado);
            modeloAuto.setCapacidad(Integer.parseInt(vista.getTxtCapacidad().getText()));
            modeloAuto.setColor(vista.getTxtColor().getText());
            modeloAuto.setPrecio_diario(Double.parseDouble(vista.getTxtPrecio().getText()));
            modeloAuto.setPotencia(Integer.parseInt(vista.getTxtPotencia().getText()));   
            mi.crear();
            modeloAuto.setId_imagen(mi.ultimoID());
           
    }
     public void setearautoMOD(){
         
            int ID_Categoria=combobox1.idcate(vista.getCbCategoria().getSelectedItem().toString());
            int ID_Marca = buscarMarca();
            int ID_modelo = combobox3.idmodelo(vista.getCbModelo().getSelectedItem().toString());
            int id_estado=modesta.obtenerID(vista.getCbEstado().getSelectedItem().toString());
            modeloAuto.setMatricula(vista.getTxtMatricula().getText());
            modeloAuto.setId_categoria(ID_Categoria);     
            modeloAuto.setId_modelo(ID_modelo);
            modeloAuto.setId_estado(id_estado);
            modeloAuto.setCapacidad(Integer.parseInt(vista.getTxtCapacidad().getText()));
            modeloAuto.setColor(vista.getTxtColor().getText());
            modeloAuto.setPrecio_diario(Double.parseDouble(vista.getTxtPrecio().getText()));
            modeloAuto.setPotencia(Integer.parseInt(vista.getTxtPotencia().getText()));   
            mi.crear();
            modeloAuto.setId_imagen(mi.ultimoID());
           
    }

    
    public void mostrarCategoria(){
        categorias = combobox1.listar(0);
        vista.getCbCategoria().removeAllItems();
        vista.getCbCategoria().addItem("Seleccione...");
        categorias.stream().forEach(p -> vista.getCbCategoria().addItem(p.getNombre()));
    }
    public void mostrarMarcas(){
        marcas = combobox2.listar(0);
        vista.getCbMarca().removeAllItems();
        vista.getCbMarca().addItem("Seleccione...");
        marcas.stream().forEach(p -> vista.getCbMarca().addItem(p.getNombre()));
    }
    
    public boolean ValiMatricula(){
        boolean matricula = false;
        if (vista.getTxtMatricula().getText().matches("^[A-Z]{3}-[0-9]{4}$")) {
            System.out.println("La matrícula es correcta");
            matricula = true;
        } else {
            System.out.println("La matrícula es incorrecta");
            matricula = false;
        }
        return matricula;
    }
    
    public int buscarIDCategoria(){
        int regreso = 0;
        for (Categoria categoria : categorias) {
            if (categoria.getNombre().equals(vista.getCbCategoria().getSelectedItem().toString())) {
                regreso = categoria.getId();
            }
        }
        return regreso;
    }
    
    public int buscarMarca(){
        int regreso = 0;
        for (Marca marcas : marcas) {
            if (marcas.getNombre().equals(vista.getCbMarca().getSelectedItem().toString())) {
                regreso = marcas.getId();
            }
        }
        return regreso;
    }
    
    public void ObtenerModelos() {
        try {
            int regreso = 0;
            for (Marca marcas : marcas) {
                if (marcas.getNombre().equals(vista.getCbMarca().getSelectedItem().toString())) {
                    regreso = marcas.getId();
                }
            }
            modelos = combobox3.listar(regreso);
            vista.getCbModelo().removeAllItems();
            vista.getCbModelo().addItem("Seleccione...");
            modelos.stream().forEach(p -> vista.getCbModelo().addItem(p.getNombre()));
        } catch (Exception e) {
        }

    }
    
    public int buscarModelo(){
        int regreso = 0;
        for (Modelo marcas : modelos) {
            if (marcas.getNombre().equals(vista.getCbMarca().getSelectedItem().toString())) {
                regreso = marcas.getId();
            }
        }
        return regreso;
    }
        public void vaciarperfil() {
        vista.getTxtMatricula().setText("");
        vista.getTxtColor().setText("");
        vista.getTxtPrecio().setText("");
        vista.getTxtPotencia().setText("");
        vista.getTxtCapacidad().setText("");
        vista.getCbEstado().setSelectedIndex(0);
        vista.getCbModelo().setSelectedIndex(0);
        vista.getCbCategoria().setSelectedIndex(0);
        vista.getLbFoto().setIcon(null);
        mi = new mImagen();
        vista.getCbMarca().setSelectedIndex(0);
    }

    public void blockydesblck(boolean modo) {
        vista.getTxtMatricula().setEditable(modo);
        vista.getTxtColor().setEditable(modo);
        vista.getTxtPrecio().setEditable(modo);
        vista.getTxtPotencia().setEditable(modo);
        vista.getTxtCapacidad().setEditable(modo);
        vista.getCbEstado().setEnabled(modo);
        vista.getCbModelo().setEnabled(modo);
        vista.getCbCategoria().setEnabled(modo);
        vista.getCbMarca().setEnabled(modo);
        vista.getBtnExaminar().setEnabled(modo);
    }

    public boolean lleno() {
        boolean llen;
        if (vista.getTxtMatricula().getText().isEmpty() || vista.getTxtColor().getText().isEmpty() || vista.getTxtPrecio().getText().isEmpty() || vista.getTxtPotencia().getText().isEmpty()
                || vista.getTxtCapacidad().getText().isEmpty() || vista.getCbCategoria().getSelectedIndex() == 0 || vista.getCbEstado().getSelectedIndex() == 0 || vista.getCbMarca().getSelectedIndex() == 0 || vista.getCbModelo().getSelectedIndex() == 0) {
            llen = false;
            JOptionPane.showMessageDialog(null, "COMPLETE TODOS LOS CAMPOS");
        } else {
            llen = true;
        }
        return llen;
    }
      public boolean valiprecio(){
         boolean f;
         try {  
         Double salario = Double.valueOf(vista.getTxtPrecio().getText()); 
         f=true;
         } catch (HeadlessException | NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Precio invalido");
         f=false;  
         }
        return f;      
     }
    public boolean valimatri() {
        boolean f = controlador.otros.Validar.matricula(vista.getTxtMatricula().getText());
        if (f == true) {
        } else {
            JOptionPane.showMessageDialog(null, "Formato de matricula invalido");
        }
        return f;
    }
       public int existep() {
       int ex=modeloAuto.existeAuto(vista.getTxtMatricula().getText());
          if (ex==1) {
               JOptionPane.showMessageDialog(null, "Ya se encuentra registrado");    
          }
        return ex;
    }

}

