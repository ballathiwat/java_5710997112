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
class ComputerPartDisplayVisitor implements ComputerPartVisitor {
   public void visit(Computer computer) {
      System.out.println("Display  Computer.");
   }

   public void visit(Mouse mouse) {
      System.out.println("Display  Mouse.");
   }

   public void visit(Keyboard keyboard) {
      System.out.println("Display  Keyboard.");
   }

   public void visit(Monitor monitor) {
      System.out.println("Display  Monitor.");
   }
}
