package PhoneBIll;

public class User {

	private String name;
	private String plan;
	private int numSub;
	private double usage;
	
	User(String name, String plan, int numSub, double usage) {
		
		this.name = name;
		this.plan = plan;
		this.numSub = numSub;
		this.usage = usage;
	}

	public void billPrint() {
		
		Bill bill = new Bill(plan, usage, numSub);
		bill.print();
	}
}

/*
class test {

	public static void main(String[] args) {
		
		User user = new User("name", "Goldplan", 2333, 4);
		user.billPrint();
		
    }
}
*/
