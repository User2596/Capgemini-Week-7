package currency.example;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyDriver {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Currency inr = Currency.getInstance("INR");
		Currency usd = Currency.getInstance("USD");
		
		System.out.println("INR Code: " + inr.getCurrencyCode());
		System.out.println("USD Symbol: " +usd.getSymbol());
		
		BigDecimal amount = new BigDecimal("125000.75");
		
		NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		NumberFormat rootFormat = NumberFormat.getCurrencyInstance();
		NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat ukFormat = NumberFormat.getCurrencyInstance(Locale.UK);
		
		System.out.println("India Format: " + indiaFormat.format(amount));
		System.out.println("System Format: " + rootFormat.format(amount));
		System.out.println("US Format: " + usFormat.format(amount));
		System.out.println("UK Format: " + ukFormat.format(amount));
	}
}
