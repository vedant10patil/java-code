public class AndroidPhoneMain {

	public static void main(String[] args) {
		AndroidPhone phone1 = new AndroidPhone(6, "Purple", "Honor");
		AndroidPhone phone2 = new AndroidPhone(8, "Grey", "Oneplus");
		AndroidPhone phone3 = new AndroidPhone(10, "Black", "GooglePixel");
		
		AndroidPhone[] phonearr = new AndroidPhone[3];
		phonearr[0] = phone1;
		phonearr[1] = phone2;
		phonearr[2] = phone3;
		
		for (AndroidPhone phone : phonearr) {
			System.out.println("Phone Name: " + phone.name + ", Ram: " + phone.ram + ", Color: " + phone.color);
		}
	}

}