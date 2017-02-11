/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack_filter;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author SCM
 */
public interface Criteria {
    
    public List<Person> meetCriteria(List<Person> person);
    
}
