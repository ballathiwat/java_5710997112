/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack_prototype;
import java.util.Hashtable;
/**
 *
 * @author SCM
 */
public class ShapeCache {
    
    private Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();
    //ยังไม่มีข้อมูลให้ clone
    public Shape getShape(){return null;};
    public void loadCache(){};
    
}
