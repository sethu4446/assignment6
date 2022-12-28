package assignmentautomation;

public abstract class Automation extends MultipleLanguage implements Language,TestTool {
 public void Selenium() {
	 System.out.println("Selenium");
 }
public void Java() {
	System.out.println("Java");
}
public void Algroithm() {
	System.out.println("Algroithm");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Automation obj=new Automation();
obj.Algorithm();
obj.Java();
obj.Selenium();

	}

}
