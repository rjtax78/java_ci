package tp;

import tp.Money;

class Money {
	private int fAmount;
	private String fCurrency;
	public Money(int amount, String currency) {
		fAmount = amount;
		fCurrency = currency;
	}
	public int amount() {
		return fAmount;
	}
	public String currency() {
		return fCurrency;
	}
	public Money add(Money m) {
		return new Money(amount() + m.amount(), currency());
	}
//	public Money add(Money m) {
//		if (m.currency().equals(currency()))
//		return new Money(amount() + m.amount(), currency());
//		return new MoneyBag(this, m);
//	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true;
	    }
	    if (!(obj instanceof Money)) {
	        return false;
	    }
	    Money other = (Money) obj;
	    return fAmount == other.amount() && fCurrency.equals(other.currency());
	}

}
