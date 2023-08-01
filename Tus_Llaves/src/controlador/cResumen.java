package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelo.mActividad;
import modelo.mAuto;
import modelo.mCliente;
import modelo.mConductor;
import modelo.mExtra;
import vista.vPrincipal;

public class cResumen {
    
    vPrincipal vista;
    ResultSet rs;
    mCliente cliente = new mCliente();
    mAuto auto = new mAuto();
    mConductor conductor = new mConductor();
    mExtra extra = new mExtra();
    mActividad actividad = new mActividad();
    DefaultListModel<String> modList;
    public cResumen(vPrincipal vista) {
        this.vista = vista;
    }
    
    public void setTOPS() {
        int posicion = 0;
        try {
            //TOP CLIENTES
            rs = cliente.top();
            while (rs.next()) {
                posicion += 1;
                switch (posicion) {
                    case 1:
                        vista.getT1_A1().setText(rs.getString(1));
                        vista.getT1_B1().setText("" + rs.getInt(3));
                        break;
                    case 2:
                        vista.getT1_A2().setText(rs.getString(1));
                        vista.getT1_B2().setText("" + rs.getInt(3));
                        break;
                    case 3:
                        vista.getT1_A3().setText(rs.getString(1));
                        vista.getT1_B3().setText("" + rs.getInt(3));
                        break;
                    case 4:
                        vista.getT1_A4().setText(rs.getString(1));
                        vista.getT1_B4().setText("" + rs.getInt(3));
                        break;
                    case 5:
                        vista.getT1_A5().setText(rs.getString(1));
                        vista.getT1_B5().setText("" + rs.getInt(3));
                        break;
                }
            }
            posicion = 0;
            //TOP CONDUCTORES
            rs = conductor.top();
            while (rs.next()) {
                posicion += 1;
                switch (posicion) {
                    case 1:
                        vista.getT2_A1().setText(rs.getString(1));
                        vista.getT2_B1().setText("" + rs.getInt(3));
                        break;
                    case 2:
                        vista.getT2_A2().setText(rs.getString(1));
                        vista.getT2_B2().setText("" + rs.getInt(3));
                        break;
                    case 3:
                        vista.getT2_A3().setText(rs.getString(1));
                        vista.getT2_B3().setText("" + rs.getInt(3));
                        break;
                    case 4:
                        vista.getT2_A4().setText(rs.getString(1));
                        vista.getT2_B4().setText("" + rs.getInt(3));
                        break;
                    case 5:
                        vista.getT2_A5().setText(rs.getString(1));
                        vista.getT2_B5().setText("" + rs.getInt(3));
                        break;
                }
            }
            posicion = 0;
            //TOP AUTOS
            rs = auto.top();
            while (rs.next()) {
                posicion += 1;
                switch (posicion) {
                    case 1:
                        vista.getT3_A1().setText(rs.getString(2) + " - " + rs.getString(1));
                        vista.getT3_B1().setText("" + rs.getInt(3));
                        break;
                    case 2:
                        vista.getT3_A2().setText(rs.getString(2) + " - " + rs.getString(1));
                        vista.getT3_B2().setText("" + rs.getInt(3));
                        break;
                    case 3:
                        vista.getT3_A3().setText(rs.getString(2) + " - " + rs.getString(1));
                        vista.getT3_B3().setText("" + rs.getInt(3));
                        break;
                    case 4:
                        vista.getT3_A4().setText(rs.getString(2) + " - " + rs.getString(1));
                        vista.getT3_B4().setText("" + rs.getInt(3));
                        break;
                    case 5:
                        vista.getT3_A5().setText(rs.getString(2) + " - " + rs.getString(1));
                        vista.getT3_B5().setText("" + rs.getInt(3));
                        break;
                }
            }
            posicion = 0;
            //TOP EXTRAS
            rs = extra.top();
            while (rs.next()) {
                posicion += 1;
                switch (posicion) {
                    case 1:
                        vista.getT4_A1().setText(rs.getString(1));
                        vista.getT4_B1().setText("" + rs.getInt(3));
                        break;
                    case 2:
                        vista.getT4_A2().setText(rs.getString(1));
                        vista.getT4_B2().setText("" + rs.getInt(3));
                        break;
                    case 3:
                        vista.getT4_A3().setText(rs.getString(1));
                        vista.getT4_B3().setText("" + rs.getInt(3));
                        break;
                    case 4:
                        vista.getT4_A4().setText(rs.getString(1));
                        vista.getT4_B4().setText("" + rs.getInt(3));
                        break;
                    case 5:
                        vista.getT4_A5().setText(rs.getString(1));
                        vista.getT4_B5().setText("" + rs.getInt(3));
                        break;
                }
            }

        } catch (SQLException ex) {
        }
    }

    public void setActividadHoy() {
        try {
            modList = new DefaultListModel<>();
            rs = actividad.actividad_hoy();
            while (rs.next()) {
                String date = rs.getString(1) != null ? rs.getString(1) : "";
                String string2 = rs.getString(2) != null ? rs.getString(2) : "";
                String string3 = rs.getString(3) != null ? rs.getString(3) : "";
                String string4 = rs.getString(4) != null ? rs.getString(4) : "";
                String elemento = date + " " + string2 + " " + string3 + " by " + string4 + ".";
                modList.addElement(elemento);
            }
            vista.getJlActividad().setModel(modList);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void setActividadFiltrada() {
        try {
            java.util.Date fecha1 = null, fecha2 = null;
            java.sql.Date fecha_ini, fecha_fin;

            try {
                fecha1 = vista.getJdcFechaIni().getDate();
                Long d = fecha1.getTime();
                fecha_ini = new java.sql.Date(d);
            } catch (Exception e) {
                fecha_ini = null;
                JOptionPane.showMessageDialog(null, "Fecha de inicio incorrecta!", null, JOptionPane.ERROR_MESSAGE);
            }
            try {
                fecha2 = vista.getJdcFechaFin().getDate();
                Long d = fecha2.getTime();
                fecha_fin = new java.sql.Date(d);
            } catch (Exception e) {
                fecha_fin = null;
                JOptionPane.showMessageDialog(null, "Fecha de fin incorrecta!", null, JOptionPane.ERROR_MESSAGE);
            }

            if (fecha_ini != null && fecha_fin != null) {
                modList = new DefaultListModel<>();
                rs = actividad.actividad_filtrada(fecha_ini, fecha_fin);
                while (rs.next()) {
                    String date = rs.getString(1) != null ? rs.getString(1) : "";
                    String string2 = rs.getString(2) != null ? rs.getString(2) : "";
                    String string3 = rs.getString(3) != null ? rs.getString(3) : "";
                    String string4 = rs.getString(4) != null ? rs.getString(4) : "";
                    String elemento = date + " " + string2 + " " + string3 + " by " + string4 + ".";
                    modList.addElement(elemento);
                }
                vista.getJlActividadFiltrada().setModel(modList);
                vista.getLblFechas().setText("Actividad entre ("+fecha_ini+" y "+fecha_fin+")");
            }
        } catch (SQLException ex) {
        }
    }
}
