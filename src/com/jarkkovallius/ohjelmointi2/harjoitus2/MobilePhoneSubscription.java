package com.jarkkovallius.ohjelmointi2.harjoitus2;

/**
	Tehtävä 1
	
	puhelinliittym�n tietojen tallennusluokka
		
	
*/
public class MobilePhoneSubscription {
	
	public static final int PHONE_CALL_BILLING_TYPE_PER_MINUTE = 111;
	public static final int PHONE_CALL_BILLING_TYPE_PACKAGE = 222;
	
	public static final int TEXT_MESSAGE_BILLING_TYPE_PER_MESSAGE = 333;
	public static final int TEXT_MESSAGE_BILLING_TYPE_PACKAGE = 444;
	
	public static final int MOBILE_DATA_BILLING_TYPE_PER_MEGABYTE = 555;
	public static final int MOBILE_DATA_BILLING_TYPE_MONTHLY = 666;
	
	
	public float phoneCallPricePerMinute ;
	public float textMessagePrice ; 
	public float mobileDataPricePerMegabyte ;
	public float mobileDataPriceMonthly ;
	
	public PhoneCallPackage[] availablePhoneCallPackages ;
	public TextMessagePackage[] availableTextMessagePackages ;
	
	
	public int selectedPhoneCallBillingType ;
	public PhoneCallPackage selectedPhoneCallPackage ;
	
	public int selectedTextMessageBillingType ;
	public TextMessagePackage selectedTextMessagePackage ;
	
	public boolean mobileDataEnabled ;
	public int selectedMobileDataBillingType ;
	
	
	public class TextMessagePackage {
		
		public TextMessagePackage(int messages, float price) {
			this.messages = messages ;
			this.price = price ;
		}

		public int messages ;
		public float price ;
		
	}
	
	public class PhoneCallPackage {
		
		public PhoneCallPackage(int minutes, float price) {
			this.minutes = minutes ;
			this.price = price ;
		}

		public int minutes ;
		public float price ;
	}
	
	
	
	
	
}
