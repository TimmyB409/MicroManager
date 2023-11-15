

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
 * Responsibilities of class: represents a reminder with an optional habit field
 * 
 */

public class Reminder extends ListItem {
	
	//fields
	private String habit;
	
	//Methods
		/**
		 * Purpose: returns the habit
		 * @return String: habit
		 */
		public String getHabit() {
			return habit;
		}
		/**
		 * Purpose: changes value in taskName
		 * @param String: habit
		 */
		public void setHabit(String habit) {
			this.habit = habit;
		}

}
