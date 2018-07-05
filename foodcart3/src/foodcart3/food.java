package foodcart3;
public class food 
{
  private int    id;
  private String item;
  private int    price;
    public food(int id, String item, int price) 
    {
	this.id = id;
	this.item = item;
	this.price = price;
    }
	public int getId() {
		return id;
	}	 
	public String getItem() {
		return item;
	}
	public int getPrice() {
		return price;
	}
	
 }
