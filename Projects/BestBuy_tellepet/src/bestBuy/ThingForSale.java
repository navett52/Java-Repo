/******************************************************
 * Evan Tellep                                        *
 * In class exercise week 13                          *
 * 11/17/2015                                         *
 * IT1090C (Computer Programming 1)                   *
 * In class exercise                                  *
 * Ref:                                               *
 ******************************************************/

package bestBuy;

public class ThingForSale {
	//Property that defines the price of the ThingForSale
	private double price;
	//Property that defines the sku of the ThingForSale
	private String SKU;
	
	/**
	 * This is the constructor used to construct an object for ThingForSale
	 * @param price : This is the price of the ThingForSale
	 * @param sku : This is the sku of the ThingForSale
	 */
	public ThingForSale(double price, String SKU) {
		//Sets price for ThingForSale
		setPrice(price);
		//Sets sku for ThingForSale
		setSKU(SKU);
	}

	/**
	 * Gets the value entered for price
	 * @return
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * Sets the value for property price
	 * @param price : This is the property being defined
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Gets the value entered for sku
	 * @return
	 */
	public String getSKU() {
		return SKU;
	}
	/**
	 * Sets the value for property sku
	 * @param sku : This is the property being defined
	 */
	public void setSKU(String SKU) {
		this.SKU = SKU;
	}

}
