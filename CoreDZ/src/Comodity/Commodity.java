package Comodity;

public class Commodity {
	
	 private String name_of_commodity;
	 private double lenght_of_commodity;
	 private double width_of_commodity;
	 private double weight_of_commodity;
	 
	public Commodity(String name_of_commodity, double lenght_of_commodity, double width_of_commodity,
			double weight_of_commodity) {
		super();
		this.name_of_commodity = name_of_commodity;
		this.lenght_of_commodity = lenght_of_commodity;
		this.width_of_commodity = width_of_commodity;
		this.weight_of_commodity = weight_of_commodity;
	}
	public String getName_of_commodity() {
		return name_of_commodity;
	}
	public void setName_of_commodity(String name_of_commodity) {
		this.name_of_commodity = name_of_commodity;
	}
	public double getLenght_of_commodity() {
		return lenght_of_commodity;
	}
	public void setLenght_of_commodity(double lenght_of_commodity) {
		this.lenght_of_commodity = lenght_of_commodity;
	}
	public double getWidth_of_commodity() {
		return width_of_commodity;
	}
	public void setWidth_of_commodity(double width_of_commodity) {
		this.width_of_commodity = width_of_commodity;
	}
	public double getWeight_of_commodity() {
		return weight_of_commodity;
	}
	public void setWeight_of_commodity(double weight_of_commodity) {
		this.weight_of_commodity = weight_of_commodity;
	}
	@Override
	public String toString() {
		return "Commodity [name_of_commodity=" + name_of_commodity + ", lenght_of_commodity=" + lenght_of_commodity
				+ ", width_of_commodity=" + width_of_commodity + ", weight_of_commodity=" + weight_of_commodity + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(lenght_of_commodity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name_of_commodity == null) ? 0 : name_of_commodity.hashCode());
		temp = Double.doubleToLongBits(weight_of_commodity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width_of_commodity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commodity other = (Commodity) obj;
		if (Double.doubleToLongBits(lenght_of_commodity) != Double.doubleToLongBits(other.lenght_of_commodity))
			return false;
		if (name_of_commodity == null) {
			if (other.name_of_commodity != null)
				return false;
		} else if (!name_of_commodity.equals(other.name_of_commodity))
			return false;
		if (Double.doubleToLongBits(weight_of_commodity) != Double.doubleToLongBits(other.weight_of_commodity))
			return false;
		if (Double.doubleToLongBits(width_of_commodity) != Double.doubleToLongBits(other.width_of_commodity))
			return false;
		return true;
	}
	 
}
