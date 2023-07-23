package controlador;

import controlador.otros.RoundedLabel;
import controlador.otros.Validar;
import java.awt.Color;
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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modelo.mCliente;
import modelo.mEmpleado;
import modelo.mImagen;
import modelo.mPersona;
import modelo.tablas.Cliente;
import vista.vCliente;

public class cCliente {
    private final mCliente modelo;
    mPersona modelop=new mPersona(); 
    mEmpleado modeloemp=new mEmpleado();
    private final vCliente vista;
    public static ResultSet rs = null;
    List<Cliente> clientes = new ArrayList<>();
    DefaultTableModel dtm;
    String[] columnas = {"Codigo", "Cedula","Nombre","Apellido","Correo","Telefono"};
    String id;
    String mod = null;
    String ruta = "";
    mImagen mi = new mImagen();
    RoundedLabel rl = new RoundedLabel();
    

    public cCliente(mCliente modelo, vCliente vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        visualizar(0);
        seleccionar(vista.getJtClientes());
        iniciarCtrlBtn();
        controlKey();
        crearmodo();
    }
      public void iniciarCtrlBtn() {
        vista.getJb_ModoEditar().addActionListener(l -> editarmodo());
        vista.getJb_ModoNuevo().addActionListener(l -> crearmodo());
        vista.getJb_ModoVista().addActionListener(l -> eliminarver());
        vista.getJbOK().addActionListener(l -> accionboton());
        vista.getBtnExaminar().addActionListener(l->examinarImagen());

    }
    private void visualizar(int id) {
        try {
            dtm = new DefaultTableModel(null, columnas);
            rs = modelo.jointabla();
            while(rs.next()){
             dtm.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(5),rs.getString(7),rs.getString(12),rs.getString(10)});   
            }
            
//        clientes.stream().forEach(p -> dtm.addRow(new Object[]{p.getId(), p.getCedula_per(), p.getContraseña()}));

vista.getJtClientes().setModel(dtm);
vista.getJtClientes().setRowHeight(30);
        } catch (SQLException ex) {
            Logger.getLogger(cCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void editarmodo() {       
        desckboton();
        vista.getTxtCedula().setEditable(false);
        vista.getJbOK().setText("ACTUALIZAR");
        vista.getLbModo().setText("Actualizar clientes");
    }
     public void crearmodo() {
       vaciarperfil();
         desckboton();
         vista.getTxtCedula().setEditable(true);
         vista.getJbOK().setText("REGISTRAR");
         vista.getLbModo().setText("Registrar clientes");
        
    }
     public void eliminarver() {
        blockboton();
        vista.getJbOK().setText("ELIMINAR");
        vista.getLbModo().setText("Eliminar clientes");
        
    }
     
      public void accionboton() {

          if (vista.getJbOK().getText().equals("ACTUALIZAR")) {
              if (lleno()) {
                  if (fechavalida() == null||!emailcorrect()||!EDADCORRECTA()) {
                  } else {
                      setearDatosmod();
                      modelop.actualizar();
                      modelo.actualizar();
                      visualizar(0);
                      JOptionPane.showMessageDialog(null, "Actualizado correctamente");
                  }
              }
          }
          if (vista.getJbOK().getText().equals("REGISTRAR")) {
              if (lleno()) {
                  if (fechavalida() == null || !cedcorrect() || !emailcorrect() || !EDADCORRECTA()) {

                  } else {
                      if (existecli() == 1) {
                          JOptionPane.showMessageDialog(null, "Ya se encuentra registrado");
                      } else {
                          if (existeperso() == 1) {
                              setearDatoscre();
                              modelop.actualizar();
                              modelo.crear();
                              visualizar(0);
                              JOptionPane.showMessageDialog(null, "Registrado correctamente");
                          } else {
                              mi.crear();
                              setearDatoscre();
                              modelop.crear();
                              modelo.crear();
                              visualizar(0);
                              JOptionPane.showMessageDialog(null, "Registrado correctamente");

                          }

                      }
                      
                   

                      
                      
//                     if (existeperso()==1&&existecli()==0){
//                      JOptionPane.showMessageDialog(null, "ENTRA AL IF PARA SOLO INGRESAR CLIENTES");    
//                      setearDatoscre();
//                      modelop.actualizar();
//                      modelo.crear();
//                      visualizar(0);
//                      JOptionPane.showMessageDialog(null, "Ingresado correctamente");                   
//                  }
//                  if (existecli()==0) {  
//                      JOptionPane.showMessageDialog(null, "ENTRA AL IF INGRESAR CLIENTES Y PERSONAS"); 
//                      mi.crear();
//                      setearDatoscre();
//                      modelop.crear();
//                      modelo.crear();
//                      visualizar(0);
//                      JOptionPane.showMessageDialog(null, "Registrado correctamente");                     
//                  }else{
//                      JOptionPane.showMessageDialog(null, "Ya se encuentra registrado"); 
//                  }  
                      
                      
                  }
              }
          }
        if (vista.getJbOK().getText().equals("ELIMINAR")) {
            if (llenoeli()){ 
                modelo.setId(Integer.parseInt(vista.getTxtIdCliente().getText()));
                modelo.eliminar();
//                modelop.setCedula(vista.getTxtCedula().getText());
//                modelop.eliminar(id);
                visualizar(0);
                vaciarperfil();
                JOptionPane.showMessageDialog(null, "Eliminado correctamente");
                 
            }
        }
    }
    public void seleccionar(JTable t) {
        t.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 1) {
                    id = t.getValueAt(t.getSelectedRow(), 1).toString();
//                    blockboton();
                    llenarPerfil();
                    editarmodo();
                    blockboton();
                    
                }
            }
        });
    }

    public void llenarPerfil() {
        rs = modelo.obtener_cliente(id);

        if (rs != null) {
            try {
                while (rs.next()) {
                    vista.getTxtIdCliente().setText(String.valueOf(rs.getInt(1)));
                    vista.getTxtCedula().setText(rs.getString(2));//cedula
                    vista.getTxtContraseña().setText(rs.getString(3));//CONTRA
                    vista.getTxtNombre1().setText(rs.getString(5));//nombe1
                    vista.getTxtNombre2().setText(rs.getString(6));//NOMBRE2
                    vista.getTxtApellido1().setText(rs.getString(7));//apellido1
                    vista.getTxtApellido2().setText(rs.getString(8));//apellido2
                    vista.getJdcFechaNac().setDate(rs.getDate(9));//FECHA
                    vista.getTxtTelefono().setText(rs.getString(10));//TELEFONO
                    vista.getTxtDireccion().setText(rs.getString(11));//DIRECCION
                    vista.getTxtCorreo().setText(rs.getString(12));//CORREO
                    if (rs.getString(13).equals("Masculino")) {
                        vista.getCbSexo().setSelectedIndex(1);
                    } else {
                        vista.getCbSexo().setSelectedIndex(2);
                    }
                    mi.setId(rs.getInt(14));
                    mi.setNombre(rs.getString(16));
                    mi.setValor(rs.getBytes(17));
                    getIcon();
                    
                    
                    
                    int idfoto = rs.getInt(14);

                }
            } catch (SQLException ex) {
                Logger.getLogger(cCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    
       public void blockboton() {
           vista.getTxtCedula().setEditable(false);//cedula
           vista.getTxtContraseña().setEditable(false);//CONTRA
           vista.getTxtNombre1().setEditable(false);//nombe1
           vista.getTxtNombre2().setEditable(false);//NOMBRE2
           vista.getTxtApellido1().setEditable(false);//apellido1
           vista.getTxtApellido2().setEditable(false);//apellido2
           vista.getJdcFechaNac().setEnabled(false);//FECHA
           vista.getTxtTelefono().setEditable(false);//TELEFONO
           vista.getTxtDireccion().setEditable(false);//DIRECCION
           vista.getTxtCorreo().setEditable(false);//CORREO
           vista.getCbSexo().setEnabled(false);//SEXO

    }
          public void desckboton() {
           vista.getTxtCedula().setEditable(true);//cedula
           vista.getTxtContraseña().setEditable(true);//CONTRA
           vista.getTxtNombre1().setEditable(true);//nombe1
           vista.getTxtNombre2().setEditable(true);//NOMBRE2
           vista.getTxtApellido1().setEditable(true);//apellido1
           vista.getTxtApellido2().setEditable(true);//apellido2
           vista.getJdcFechaNac().setEnabled(true);//FECHA
           vista.getTxtTelefono().setEditable(true);//TELEFONO
           vista.getTxtDireccion().setEditable(true);//DIRECCION
           vista.getTxtCorreo().setEditable(true);//CORREO
           vista.getCbSexo().setEnabled(true);//SEXO

    }
        public void vaciarperfil() {

        vista.getTxtIdCliente().setText("Autoasignado");//cedula     
        vista.getTxtCedula().setText("");//cedula
        vista.getTxtContraseña().setText("");//CONTRA
        vista.getTxtNombre1().setText("");//nombe1
        vista.getTxtNombre2().setText("");//NOMBRE2
        vista.getTxtApellido1().setText("");//apellido1
        vista.getTxtApellido2().setText("");//apellido2
        vista.getJdcFechaNac().setCalendar(null);//FECHA
        vista.getTxtTelefono().setText("");//TELEFONO
        vista.getTxtDireccion().setText("");//DIRECCION
        vista.getTxtCorreo().setText("");//CORREO
        vista.getCbSexo().setSelectedIndex(0);//SEXO
        vista.getLbFoto().setIcon(null);
        mi = new mImagen();

    }
          
      public void setearDatosmod() {
        modelo.setId(Integer.parseInt(vista.getTxtIdCliente().getText()));
        modelo.setCedula_per(vista.getTxtCedula().getText());
        modelo.setContraseña(String.valueOf(vista.getTxtContraseña().getPassword()));
        modelop.setCedula(vista.getTxtCedula().getText());
        modelop.setNombre1(vista.getTxtNombre1().getText());
        modelop.setNombre2(vista.getTxtNombre2().getText());
        modelop.setApellido1(vista.getTxtApellido1().getText());
        modelop.setApellido2(vista.getTxtApellido2().getText());
        Date fecha = vista.getJdcFechaNac().getDate();
        Long d = fecha.getTime();
        java.sql.Date fecha_via = new java.sql.Date(d);
        modelop.setFecha_nac(fecha_via); 
        modelop.setTelefono(vista.getTxtTelefono().getText());
        modelop.setDireccion(vista.getTxtDireccion().getText());
        modelop.setCorreo(vista.getTxtCorreo().getText());
        modelop.setSexo(vista.getCbSexo().getSelectedItem().toString());
        mi.actualizar();
        modelop.setId_imagen(mi.getId());
    }
       public void setearDatoscre() {    
        modelo.setCedula_per(vista.getTxtCedula().getText());
        modelo.setContraseña(String.valueOf(vista.getTxtContraseña().getPassword()));
        modelop.setCedula(vista.getTxtCedula().getText());
        modelop.setNombre1(vista.getTxtNombre1().getText());
        modelop.setNombre2(vista.getTxtNombre2().getText());
        modelop.setApellido1(vista.getTxtApellido1().getText());
        modelop.setApellido2(vista.getTxtApellido2().getText());
        Date fecha = vista.getJdcFechaNac().getDate();
        Long d = fecha.getTime();
        java.sql.Date fecha_via = new java.sql.Date(d);
        modelop.setFecha_nac(fecha_via); 
        modelop.setTelefono(vista.getTxtTelefono().getText());
        modelop.setDireccion(vista.getTxtDireccion().getText());
        modelop.setCorreo(vista.getTxtCorreo().getText());
        modelop.setSexo(vista.getCbSexo().getSelectedItem().toString());
        modelop.setId_imagen(mi.ultimoID());
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
      
    public boolean lleno() {
        boolean llen = false;
        if (vista.getTxtNombre1().getText().isEmpty() || vista.getTxtNombre2().getText().isEmpty() || vista.getTxtApellido1().getText().isEmpty() || vista.getTxtApellido2().getText().isEmpty()
                || vista.getTxtCedula().getText().isEmpty() || vista.getTxtContraseña().getText().isEmpty() || vista.getTxtTelefono().getText().isEmpty() || vista.getTxtDireccion().getText().isEmpty()
                || vista.getTxtCorreo().getText().isEmpty()||vista.getCbSexo().getSelectedIndex()==0 ){
            llen = false;
                JOptionPane.showMessageDialog(null, "COMPLETE TODOS LOS CAMPOS"); 
        } else {
            
            llen = true;
            
        }
        return llen;
    }
     public boolean llenoeli() {
        boolean llen = false;
        if (vista.getTxtNombre1().getText().isEmpty() || vista.getTxtNombre2().getText().isEmpty() || vista.getTxtApellido1().getText().isEmpty() || vista.getTxtApellido2().getText().isEmpty()
                || vista.getTxtCedula().getText().isEmpty() || vista.getTxtContraseña().getText().isEmpty() || vista.getTxtTelefono().getText().isEmpty() || vista.getTxtDireccion().getText().isEmpty()
                || vista.getTxtCorreo().getText().isEmpty()||vista.getCbSexo().getSelectedIndex()==0 ){
            llen = false;
                JOptionPane.showMessageDialog(null, "Seleccione un registro"); 
        } else {
            
            llen = true;
            
        }
        return llen;
    }
    public Date fechavalida() {
        Date fecha;
        fecha = vista.getJdcFechaNac().getDate();
        if (fecha == null) {
            JOptionPane.showMessageDialog(null, "Fecha incorrecta");
           
        }
        return fecha;

    }
      public int existecli() {
       int ex=modelo.existecliente(vista.getTxtCedula().getText());
          if (ex==1) {
//               JOptionPane.showMessageDialog(null, "Ya se encuentra registrado");    
          }
        return ex;
         
        
    }
       public int existeperso() {
       int ex=modelop.existeper(vista.getTxtCedula().getText());
          if (ex==1) {
          }
        return ex;
         
        
    }
       public int empleado() {
       int ex=modeloemp.existemple(vista.getTxtCedula().getText());
          if (ex==1) {
          }
        return ex;
         
        
    }    
    public boolean cedcorrect() {
        boolean valid = Validar.cedula(vista.getTxtCedula().getText());
        if (valid) {

        } else {
            JOptionPane.showMessageDialog(null, "Cedula invalida");
        }

        return valid;

    }
        public boolean emailcorrect() {
        boolean valid = Validar.correo(vista.getTxtCorreo());
        if (valid) {
        } else {
            JOptionPane.showMessageDialog(null, "Correo invalido");
        }
        return valid;

    }
        public boolean EDADCORRECTA() {
        Date fecha =vista.getJdcFechaNac().getDate();
        boolean valid = Validar.edad(fecha);
        if (valid) {
            
        } else {
            JOptionPane.showMessageDialog(null, "Edad invalida");
        }
        return valid;

    }
    
          public void controlKey() {
        vista.getTxtCedula().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.numero(vista.getTxtCedula(), 10); 
            }
        });
        vista.getTxtNombre1().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.letras(vista.getTxtNombre1(), 30); 
            }
        });
        vista.getTxtNombre2().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.letras(vista.getTxtNombre2(), 30); 
            }
        });
        vista.getTxtApellido1().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.letras(vista.getTxtApellido1(), 30); 
            }
        });
        vista.getTxtApellido2().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.letras(vista.getTxtApellido2(), 30); 
            }
        });
        vista.getTxtDireccion().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.nombre_compuesto(vista.getTxtDireccion(), 60); 
            }
        });
        vista.getTxtTelefono().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.numero(vista.getTxtTelefono(), 10); 
            }
        });

    }
    
}
