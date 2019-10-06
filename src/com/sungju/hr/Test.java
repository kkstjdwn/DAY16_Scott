package com.sungju.hr;

public class Test {
	public static void main(String[] args) {
		HrDAO dao = new HrDAO();
		View view = new View();
		HrInput input = new HrInput();
		HrController controller = new HrController();


		controller.start();
	}
}
