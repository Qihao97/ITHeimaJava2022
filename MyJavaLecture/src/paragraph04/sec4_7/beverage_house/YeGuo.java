package paragraph04.sec4_7.beverage_house;

public class YeGuo extends TiaoLiao{
	Beverage beverage;
	
	public YeGuo(Beverage b){
		beverage = b;
	}
	
	public String getDescription(){
		return beverage.getDescription() + "加椰果";
	}
	
	public double price(){
		if(getCapacity() == Beverage.SMALL)
			return 1 + beverage.price();
		else if(getCapacity() == Beverage.MEDIUM)
			return 1.5 + beverage.price();
		else if(getCapacity() == Beverage.LARGE)
			return 2 + beverage.price();
		else 
			return 0;
	}
}
