package reggie.org.car;

public class Tesla {

	String ceo;
	String employ;
	double price;
	
	public Tesla(String ceo,String empoly,double price)
	{
		this.ceo = ceo;
		this.employ = empoly;
		this.price = price;
	}
	
	public boolean dismiss()
	{
		System.out.println("Tesla byebye");	
		return true;
	}
	
	private void doubleprice(int time)
	{
		price = price*time;
	}
	
	public double marketPublic()
	{
		doubleprice(10);
		System.out.println("Tesla price :" + price);
		return price;
	}
	
	//FIXME there was bugs
	
	
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getEmploy() {
		return employ;
	}
	public void setEmploy(String employ) {
		this.employ = employ;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	//TODO Add Autopilot
}
