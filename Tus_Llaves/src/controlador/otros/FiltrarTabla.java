
package controlador.otros;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class FiltrarTabla {
    //filtrar registros de cualquier tabla:
    public static void filtrar(JTable t, JTextField txt, JComboBox cb) {
        DefaultTableModel dtml = (DefaultTableModel) t.getModel();
        TableRowSorter sorter = new TableRowSorter<>(dtml);
        t.setAutoCreateRowSorter(true);
        t.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(txt.getText(), cb.getSelectedIndex()));
    }
}
