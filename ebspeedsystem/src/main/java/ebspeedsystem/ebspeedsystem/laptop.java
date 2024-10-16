package ebspeedsystem.ebspeedsystem;

import org.springframework.stereotype.Component;

@Component
public class laptop {
     private int lid;
     private String Brand;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	@Override
	public String toString() {
		return "laptop [lid=" + lid + ", Brand=" + Brand + "]";
	}
     public void compile() {
    	 System.out.println("add");
     }
}
