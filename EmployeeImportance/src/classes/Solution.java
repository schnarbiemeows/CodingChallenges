package classes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 690
 * ok! this was my first submission, and it beat 100%!
 * memory was only 13.33% though
 */
public class Solution {

	public int getImportance(List<Employee> employees, int id) {
		Map<Integer,Employee> employeemap = new HashMap<Integer,Employee>();
		for(Employee person : employees) {
			employeemap.put(person.id,person);
		}
		return getTotal(employeemap,id);
    }
	
	public int getTotal(Map<Integer,Employee> items, int employeeNum) {
		int total = items.get(employeeNum).importance;
		for(Integer item : items.get(employeeNum).subordinates) {
			total += getTotal(items,item.intValue());
		}
		return total;
	}
}
