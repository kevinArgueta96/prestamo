package Front;

import java.awt.Component;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Render extends DefaultTableCellRenderer {

    int cambio;

    public Component getTableCellRendererComponent(JTable table,
            Object value,
            boolean isSelected,
            boolean hasFocus,
            int row,
            int column) {
        JLabel cell = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (value instanceof String) {
            String valor = (String) value;
            if (column == 5) {
                cambio = Integer.parseInt(valor);
                System.out.println(cambio);
                if (cambio > 5) {
                    cell.setBackground(Color.RED);
                    cell.setForeground(Color.BLACK);
                }
                if (cambio > 11) {
                    cell.setBackground(Color.YELLOW);
                    cell.setForeground(Color.BLACK);

                }
                if (cambio > 20) {
                    cell.setBackground(Color.GREEN);
                    cell.setForeground(Color.BLACK);
                }

            } else {
                cell.setBackground(Color.WHITE);
                cell.setForeground(Color.BLACK);

            }

        }

        return cell;

    }
}
