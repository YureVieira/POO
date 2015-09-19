/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Micro
 */
public class TableModel extends AbstractTableModel{
    private ArrayList lines = null;
    private String[] columns = null;

    public TableModel(ArrayList lin,String col[]){
        setLines(lin);
        setColumns(col);
    }
    public ArrayList getLines(){
        return lines;
    }
    
    public void setLines(ArrayList lin){
        lines = lin;
    }
    
    public String[] getColumns(){
        return columns;
    }
    
    public void setColumns(String[] col){
        columns = col;
    }
    
    @Override
    public int getRowCount() {
        return lines.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }
    
    @Override
    public String getColumnName(int num){
        return columns[num];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object[] line = (Object[])getLines().get(rowIndex);
        return columns[columnIndex];
    }
    
}
