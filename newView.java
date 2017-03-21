import javax.swing.JOptionPane;

public class newView {
	// JOptionPane
	studentDriver newDriver = new studentDriver ();
	String [] commands = {"Save","Load File","Add New Student",
			"Delete Student","Display Students Info",
			"Add Course","Quit"};
	
	public void start(){
		// Should I load the project into the Jframe from beginning?
		
	    String input = (String) JOptionPane.showInputDialog(null, 
	    		"Please select an Option...",
		        "List of Students", JOptionPane.QUESTION_MESSAGE, null, // Use
		                                                                // default
		                                                                // icon
		        commands, // Array of choices
		        commands[0]);
	    if(input == null){
	    	System.exit(0);
	    }
	    checkInput(input);
	}
	
	public void checkInput (String input){
		
		if(input.equalsIgnoreCase("Quit")){
			System.exit(0);
		}else if(input.equalsIgnoreCase("Load File")){
			newDriver.LoadData();
			newDriver.Display();
		}else if(input.equalsIgnoreCase("Add New Student")){
			newDriver.AddStudents();
			newDriver.Display();
		}else if(input.equalsIgnoreCase("Delete Student")){
			newDriver.DeleteStudent();
			newDriver.Display();
		}else if (input.equalsIgnoreCase("Save")){
			newDriver.writeToTextFile();
		}else if(input.equalsIgnoreCase("Display Students Info")){
			System.out.println(newDriver.displayInfo());
			newDriver.Display();
		}else if(input.equalsIgnoreCase("add Course")){
			newDriver.addCourse();
			newDriver.Display();
		}
	}

	
}
