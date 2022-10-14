package convenienceStore;

public class Stuff {
	String name;
	String barcode;
	int quantity;
	int price;
	String region;
	String disposalDate;
	boolean adult;
	
	Stuff(String name, String barcode, int quantity, int price, String region, String disposalDate, boolean adult){
		this.name=name;
		this.barcode=barcode;
		this.quantity=quantity;
		this.price=price;
		this.region=region;
		this.disposalDate=disposalDate;
		this.adult=adult;
	}
}
