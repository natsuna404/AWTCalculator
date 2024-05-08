package org.example;

public class Main {
	public static void main(String[] args) {
		CalWindow window  = new CalWindow(500, 600);
		
		
		CalButton btnNegate = new CalButton(10 ,530, "+/-");
		CalButton btn0 = new CalButton(130,530, "0");
		CalButton btnDot = new CalButton(250,530, ".");
		CalButton btnEquals = new CalButton(370,530, "=");

		CalButton btn1 = new CalButton(10,460, "1");
		CalButton btn2 = new CalButton(130,460, "2");
		CalButton btn3 = new CalButton(250,460, "3");
		CalButton btnPlus = new CalButton(370,460, "+");
		
		
		CalButton btn4 = new CalButton(10,390, "4");
		CalButton btn5 = new CalButton(130,390, "5");
		CalButton btn6 = new CalButton(250,390, "6");
		CalButton btnMinus = new CalButton(370,390, "-");
		
		
		CalButton btn7 = new CalButton(10,320, "7");
		CalButton btn8 = new CalButton(130,320, "8");
		CalButton btn9 = new CalButton(250,320, "9");
		CalButton btnMultiply = new CalButton(370,320, "X");
		
		
		CalButton btnDivide = new CalButton(370, 250, "/");
		CalButton btnPercent = new CalButton(250, 250, "%");
		CalButton btnC = new CalButton(130, 250, "C");
		CalButton btnCE = new CalButton(10, 250, "CE"); // Clear Entry
		
		
		
		
		window.add(btnNegate);
		window.add(btn0);
		window.add(btnDot);
		window.add(btnEquals);
		
		window.add(btn1);
		window.add(btn2);
		window.add(btn3);
		window.add(btnPlus);
		
		window.add(btn4);
		window.add(btn5);
		window.add(btn6);
		window.add(btnMinus);
		
		window.add(btn7);
		window.add(btn8);
		window.add(btn9);
		window.add(btnMultiply);
		
		window.add(btnDivide);
		window.add(btnPercent);
		window.add(btnC);
		window.add(btnCE);
		
		
		
	}
}