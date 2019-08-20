package bankmanager;

public class Account {
	String type;
	String holderName;
	int amount;
	@Override
	public String toString() {
		return "Account [type=" + type + ", holderName=" + holderName + ", amount=" + amount + "]";
	}
	
}
