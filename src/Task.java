
import java.time.*;


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
	
	//Fields
	public static enum Status {NotStarted, InProgress, Completed}
	protected LocalDate dueDate;
	protected int timeToComplete = 0;
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
		if(estimatedTime > 0) this.timeToComplete = estimatedTime;
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
	 * Purpose: returns the estimated time to complete
	 * @return int: timeToComplete
	 */
	public int getTimeToComplete() {
		return timeToComplete;
	}
	/**
	 * Purpose: returns the status
	 * @return Status: status
	 */
	public Status getStatus() {
		return status;
	}
	/**
	 * Purpose: returns the completion date and time
	 * @return LocalDateTime: completedDate
	 */
	public LocalDateTime getCompletedDate() {
		return completedDate;
	}
	/**
	 * Purpose: changes value in taskName
	 * @param LocalDate: dueDate  
	 */
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}/**
	 * Purpose: changes value in taskName
	 * @param int: timeToComplete  
	 */
	public void setTimeToComplete(int timeToComplete) {
		this.timeToComplete = timeToComplete;
	}
	/**
	 * Purpose: changes value in status
	 * @param Status: status  
	 */
	public void setStatus(Status status) {
		this.status = status;
	}/**
	 * Purpose: changes value in completedDate
	 * @param LocalDateTime: completedDate  
	 */
	public void setCompletedDate(LocalDateTime completedDate) {
		this.completedDate = completedDate;
	}
}
