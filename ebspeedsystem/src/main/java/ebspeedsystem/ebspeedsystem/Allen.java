package ebspeedsystem.ebspeedsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Allen {
      private int id;
      private String name;
      
      @Autowired
      private laptop lab;
      
	public laptop getLab() {
		return lab;
	}
	public void setLab(laptop lab) {
		this.lab = lab;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
     
	public void show() {
		System.out.println("hello");
		lab.compile();
	}
}
