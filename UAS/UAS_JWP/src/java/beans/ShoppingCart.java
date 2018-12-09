/*
    *Enumeration adalah metode untuk mengembalikan sebuah pencacahan String objek yang berisi nama-nama dari semua 
    benda terikat untuk sesi ini.

    *removeAttribute adalah metode untuk menghapus objek yang terikat dengan nama tertentu dari sesi.

    *setAttribute adalah metode untuk mengikat objek untuk sesi ini dengan menggunakan nama tertentu.
 */

package beans;

import java.lang.String;
import java.lang.Integer;
import java.lang.Float;
import java.util.Hashtable;
import java.util.Enumeration;
/**
 *
 * @author Ratna
 */


public class ShoppingCart{

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected Hashtable items=new Hashtable();

public void addItem(String itemId, String nama, float price, int quantity, String brand, String kategori, String foto)
{
    String[] item = {itemId, nama, Float.toString(price), Integer.toString(quantity), brand, kategori, foto};

    if(items.containsKey(itemId))
    {
        String[] tmpItem = (String[])items.get(itemId);
        int tmpQuant = Integer.parseInt(tmpItem[3]);
        quantity += tmpQuant;
        tmpItem[3] = Integer.toString(quantity);
    }
    else
    {
        items.put(itemId, item);
    }
}

public void removeItem(String itemId)
{
    if(items.containsKey(itemId))
    {
        items.remove(itemId);
    }
}

public void updateQuantity(String itemId, int quantity)
{
    if(items.containsKey(itemId))
    {
        String[] tmpItem=(String[])items.get(itemId);
        tmpItem[3]=Integer.toString(quantity);
    }
}
    
public Enumeration getEnumeration()
{
    return items.elements();
}

public float getCost()
{
    Enumeration e = items.elements();
    String[] tmpItem;
    float totalCost=0.00f;
    while(e.hasMoreElements())
    {
        tmpItem=(String[])e.nextElement();
        totalCost += (Integer.parseInt(tmpItem[3])*Float.parseFloat(tmpItem[2]));
    }
    return totalCost;
}

public int getNumOfItems()
{
    Enumeration e = items.elements();
    String[] tmpItem;
    int numOfItems=0;
    while(e.hasMoreElements())
    {
        tmpItem=(String[])e.nextElement();
        numOfItems += (Integer.parseInt(tmpItem[3]));
    }
    return numOfItems;
}
}
