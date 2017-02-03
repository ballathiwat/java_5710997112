/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatternDemo_Lab2;

/**
 *
 * @author SCM
 */
class Computer implements ComputterPart{
    
    ComputterPart[] parts;
    public Computer(){
         parts = new ComputterPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
        parts[i].accept(computerPartVisitor);
        
      }
    computerPartVisitor.visit(this);
    }
    
    
}
