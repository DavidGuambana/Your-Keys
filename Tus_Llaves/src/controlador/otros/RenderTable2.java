package controlador.otros;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class RenderTable2 extends DefaultTableCellRenderer{
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        try {
            if (table.getValueAt(row, 6).equals("Finalizado")) {
                c.setForeground(Color.RED);
            } else {
                c.setForeground(table.getForeground());
            }
        } catch (Exception e) {
        }

        if (value instanceof JButton) {
            JButton boton = (JButton)value;
            return boton;
        }
        if (value instanceof JLabel) {
            JLabel label = (JLabel)value;
            return label;
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
