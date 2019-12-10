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
            // --- pmazariegos | Rangos para colores en pagos pendientes | 09/12/2019 ---
            if (column == 7) {
                cambio = Integer.parseInt(valor);
                
                if (cambio <= 1) {
                    cell.setBackground(Color.RED);
                    cell.setForeground(Color.BLACK);
                    
                }else{
                    if (cambio <= 5) {
                        cell.setBackground(Color.YELLOW);
                        cell.setForeground(Color.BLACK);

                    }else{                            
                        cell.setBackground(Color.GREEN);
                        cell.setForeground(Color.BLACK);                   
                        
                    }
                }

            } else {
                cell.setBackground(Color.WHITE);
                cell.setForeground(Color.BLACK);

            }

        }

        return cell;

    }
}
