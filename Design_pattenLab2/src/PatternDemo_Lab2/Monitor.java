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
class Monitor implements ComputterPart {
     //public void accept(){};
     @Override
     public void accept(ComputerPartVisitor computerPartVisitor){
     computerPartVisitor.visit(this);
     }
}