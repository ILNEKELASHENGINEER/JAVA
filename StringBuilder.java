class StringBuilderDemo{

	public static void main(String[] args){

		String firstName="Sachin";
		String lastName="Tendulkar";
		String fullName=firstName+lastName;
		//'+'operator concatenates the string but creates a new object in the heap memory as sting is immutable
		System.out.println(fullName);
		StringBuilder sb=new StringBuilder(firstName);
		String fName=sb.append(lastName).toString();//toString method converts StringBuilder to String
		//StringBuilder is mutable, it appends to a single object
		System.out.println(fName);

	}
}
