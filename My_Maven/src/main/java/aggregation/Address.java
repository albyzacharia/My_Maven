package aggregation;

public class Address {
	int pincode,houseNumber;
	String houseName,streetName;
	
	public Address(String houseName,String streetName,int pincode,int houseNumber)
	{
		this.houseName=houseName;
		this.houseNumber=houseNumber;
		this.streetName=streetName;
		this.pincode=pincode;			
				
	}

}
