package screenManager;

public class FunctionsPanel extends ScreenManager{
	
	private String function_type;
	private String function_description;
	private int function_timing;
	
	public String getFunction_type() {
		return function_type;
	}
	public String getFunction_description() {
		return function_description;
	}
	public int getFunction_timing() {
		return function_timing;
	}
	public void setFunction_type(String function_type) {
		this.function_type = function_type;
	}
	public void setFunction_description(String function_description) {
		this.function_description = function_description;
	}
	public void setFunction_timing(int function_timing) {
		this.function_timing = function_timing;
	}
}
