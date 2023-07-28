package reportes;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import modelo.Conexion;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Reporte {
    Map<String, Object> map;
    String url;
    
    public void print_cliente() {
        map = new HashMap<>();
        url = "/reportes/Clientes.jasper";
        map.put("par", "d");
        print(map, url);
    }
    
    public void print_empleado() {
        map = new HashMap<>();
        url = "/reportes/Empleados.jasper";
        map.put("par", "d");
        print(map, url);
    }
    
    public void print_conductor() {
        map = new HashMap<>();
        url = "/reportes/Conductores.jasper";
        map.put("par", "d");
        print(map, url);
    }
    
    public void print_auto() {
        
        url = "/reportes/Autostabla.jasper";
        map.put("Logo grande", "src/vista/img/logo.png");
        map.put("Logo pequeño", "src/vista/img/llave.png");
        print(map, url);
    }
    public void print_alquilerescli() {
               
            map = new HashMap<>();
            map.put("cedula","0104305008" );
            map.put("par","g");
            url = "/reportes/PRESTAMOS.jasper";
            print(map, url);      
      
    }
       public void print_devolucionescli() {
               
            map = new HashMap<>();
            map.put("cedula","0104305008" );
            map.put("par","g");
            url = "/reportes/devoluciones.jasper";
            print(map, url);      
      
    }
           public void print_contratoscli() {
               
            map = new HashMap<>();
            map.put("cedula","0104305008" );
            map.put("par","g");
            url = "/reportes/CONTRATOS.jasper";
            print(map, url);      
      
    }   
    
       
    

    public void print(Map<String, Object> map, String url) {
        try {
            map.put("imagen", "src/vista/img/logo.png");
            Conexion con = new Conexion();
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource(url));
            JasperPrint print = JasperFillManager.fillReport(jr, map, con.connection());
            JasperViewer pv = new JasperViewer(print, false);
            pv.setVisible(true);
            pv.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        } catch (JRException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Archivo de reporte no encontrado", null, JOptionPane.ERROR_MESSAGE);
        }
    }
}