package com.sungju.scott;

import com.col.bo.BonusController;
import com.col.sal.SalgradeController;
import com.sungju.control.FrontController;

public class ScottMain {

	public static void main(String args[]) {

//		SalgradeController controller = new SalgradeController();
//		controller.start();
//		BonusController controller = new BonusController();
//		controller.start();
		FrontController controller = new FrontController();
		controller.start();

	}

}
