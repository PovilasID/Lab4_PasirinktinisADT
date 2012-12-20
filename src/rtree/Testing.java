package rtree;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BestBeast
 */
public class Testing {
    public static void main(String[] args) throws FileNotFoundException, IOException {
    RTree<Object> rt = new RTree<Object>(50,2,2);
    int numEntries = rt.getMaxEntries() * 4;
    float[] coords = new float[] { 0.0f, 0.0f };
    float[] dims = new float[] { 0.5f, 0.5f };
    Object[] entries = new Object[numEntries];
    
    for ( int i = 0; i < numEntries; i++ )
    {
      coords[0] = i;
      entries[i] = new Object();
      rt.insert(coords, dims, entries[i]);
    }
    String html = rt.visualize();
    System.err.println("Writing to " + System.getProperty("java.io.tmpdir"));
    OutputStream os = new FileOutputStream(System.getProperty("java.io.tmpdir") + "/rtree.html");
    os.write(html.getBytes());
    os.flush();
    os.close();
        
    }
    
}
