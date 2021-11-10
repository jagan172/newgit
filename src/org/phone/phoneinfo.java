package org.phone;

public class phoneinfo {

	private void phoneName() {
System.out.println("phone name is : MI");
	}
	
	private void phonemodel() {
System.out.println("phone model is : 5");
	}
	
	private void camera() {
System.out.println("camera : 16");
	}
	
	private void storage() {
		System.out.println("storage : 64gb");
	}
	
	private void osname() {
		System.out.println("osname : android 11");
	}
	
	public static void main(String[] args) {
	
		phoneinfo c = new phoneinfo();
			
		c.phoneName();
		c.phonemodel();
		c.camera();
		c.storage();
		c.osname();
		
	}
	
}
