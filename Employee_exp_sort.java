import java.util.*;
class Recruitment implements Comparable<Recruitment>
{ 
	public String name, qualification, gender;
	public int experiance;

	public int compareTo(Recruitment m) 
	{ 
		return m.experiance - this.experiance; 
	} 


	public Recruitment(String nm, String qua, String gender, int exp) 
	{ 
		this.name = nm;
		this.experiance = exp;
		this.qualification = qua;
		this.gender = gender;
	} 


	public String getName() { 
        return name; 
	} 
} 


class Main 
{ 
	public static void main(String[] args) 
	{ 
		ArrayList<Recruitment> emp_list = new ArrayList<Recruitment>(); 
		Scanner in = new Scanner(System.in);
		
		int num_of_emp;
		
		num_of_emp = in.nextInt();
		
		
		for (int i=0;i<num_of_emp;i++) {
		    int exp;
		    String name, qua, gender;
		    
		    name = in.nextLine();
		    qua = in.nextLine();
		    gender = in.nextLine();
		    in.nextLine();
		    exp = in.nextInt();
		    
		    emp_list.add(new Recruitment(name, qua, gender, exp));
		}

		Collections.sort(emp_list);
 
		for (Recruitment each: emp_list) 
		{ 
			System.out.print(each.name);
			System.out.println(each.qualification);
			System.out.println(each.gender);
			System.out.println(each.experiance);
		} 
	} 
} 
/* input 
2                                                   
ram
Be cse
male
2
pravin
Be ece
male
3

output

pravin
Be ece
3
ram
Be cse
2
*/
