/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack_filter;
import java.util.List;
/**
 *
 * @author SCM
 */
public class AndCriteria implements Criteria {
  @Override
  public List<Person> meetCriteria(List<Person> person){return null;};
  
  private Criteria criteria;
  private Criteria otherCriteria;

}
