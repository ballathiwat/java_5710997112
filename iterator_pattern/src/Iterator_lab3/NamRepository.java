/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator_lab3;

/**
 *
 * @author SCM
 */
public class NamRepository implements Container {
    
    private String name[]={};
    public Iterator getInterator(){
      return new NameIterator();
    }
    private class NameIterator implements Iterator {
        public boolean hasNext() {
            return true;
        }
        public Object next() {
            return null;
        }
    }
  
}
