
import java.time.*;
import javax.swing.*;

/**
 * Lead Author(s):
 * Evens Brunel
 * <<add additional lead authors here, with a full first and last name>>
 * 
 * Other contributors:
 * <<add additional contributors (mentors, tutors, friends) here, with contact information>>
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * <<add more references here>>
 *  
 * Version/date: 11/15/23
 * 
 * Responsibilities of class: represents a task with an optional due date, estimated completion time, status and completed date
 * 
 */

//TODO: implement and remove all TODOs

/**
 * add future functionality when base app is finished
*/
public class Task extends ListItem {
	
	/**Fields*/
	public static enum Status {NotStarted, InProgress, Completed}
	protected LocalDate dueDate;
	protected int estimatedTimeToComplete = 0;
	protected Status status;
	protected LocalDateTime completedDate;
	
	//Constructors
	/**
	 * Purpose: construct a task 
	 * @return nothing
	 */
	public Task(String name, String details, int estimatedTime, LocalDate dueDate) {
		this.name = name;
		if(!details.equals(null)) this.details = details;
		if(estimatedTime > 0) this.estimatedTimeToComplete = estimatedTime;
		if(dueDate != null) this.dueDate = dueDate;
	}
	
	//Methods
	/**
	 * Purpose: returns the due date
	 * @return LocalDate: dueDate
	 */
	public LocalDate getDueDate() {
		return dueDate;
	}
	/**
	 * Purpose: changes value in taskName
	 * @return nothing
	 */
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
}
