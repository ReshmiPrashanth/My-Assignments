package week3.HomeAssignment;

public class TextField extends WebElement {
	    private String text;

	    public void setText(String text) {
	        this.text = text;
	        System.out.println("TextField text set to: " + text);
	    }

	    public String getText() {
	        return text;
	    }
}
