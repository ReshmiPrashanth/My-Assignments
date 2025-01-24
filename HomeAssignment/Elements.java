package week3.HomeAssignment;

public class Elements {

	public static void main(String[] args) {
	        // Create and test WebElement
	        WebElement webElement = new WebElement();
	        webElement.click();
	        webElement.setText("Sample Text");

	        // Create and test Button
	        Button button = new Button();
	        button.click();
	        button.submit();

	        // Create and test TextField
	        TextField textField = new TextField();
	        textField.setText("Hello World");
	        System.out.println("TextField content: " + textField.getText());

	        // Create and test CheckBoxButton
	        CheckBoxButton checkBoxButton = new CheckBoxButton();
	        checkBoxButton.click();
	        checkBoxButton.clickCheckButton();

	        // Create and test RadioButton
	        RadioButton radioButton = new RadioButton();
	        radioButton.click();
	        radioButton.selectRadioButton();
	    }
	
}


