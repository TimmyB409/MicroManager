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
 * Responsibilities of class: represents a repeating task with an interval for when the task will repeat
 * 
 */

public class RecurringTask extends Task {
	
	//fields
	private int interval;

	//constructors
	public RecurringTask(String name, String details, int estimatedTime, LocalDate dueDate, int interval) {
		super(name, details, estimatedTime, dueDate);
		this.interval = interval;
	}
	
	//methods
	/**
	 * Purpose: returns the interval
	 * @return int: interval
	 */
	public int getInterval() {
		return interval;
	}
	/**
	 * Purpose: changes value in interval
	 * @param int: interval  
	 */
	public void setInterval(int interval) {
		this.interval = interval;
	}
}
