
import java.util.*;

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
 * Responsibilities of class: Run the MicroManager Program
 * 
 */

//TODO: implement and remove all TODOs

/**
* create program base
*/
public class Main {
	
	public static void main(String[] args) {
		
		//runs the gui
		
	}
	
	//internal classes
	/** 
	 * Responsibilities of class: hold a list of tasks and prioritize them as needed 
	 */
	public static class TaskList implements Prioritizable{
		
		//fields
		private ArrayList<Task> tasks;

		//methods
		@Override
		public ArrayList<Object> prioritizeList(ArrayList<Object> list) {
			//TODO add functionality to prioritize tasks by due date and then priority
			ArrayList<Object> tempList = (ArrayList<Object>)list.clone();
			ArrayList<Task> sortedList;
			Task task = (Task)tempList.get(0);
			
			/* recursively calls the method if there are any more members of the list to compare, 
			 * returns a list with the last member when it reaches the end*/
			if(tempList.size() > 1) {
				tempList.remove(0);
				sortedList = prioritizeList(tempList); 
			}else{
				sortedList = new ArrayList<Task>();
				sortedList.add(task);
				return sortedList;
			}
			
			int indexInList = 0;
			while(true) {
				Task comparingTask = sortedList.get(indexInList);
				if(task.getDueDate().isBefore(comparingTask.getDueDate())) {
					sortedList.add(indexInList, task);
					return sortedList;
				}else{
					indexInList++;
				}
			}
		}
		
	}
	/** 
	 * Responsibilities of class: hold a list of reminders and prioritize them as needed 
	 */
	public static class ReminderList implements Prioritizable{
		
		//fields
		private ArrayList<Reminder> reminders;

		//methods
		@Override
		public ArrayList<Object> prioritizeList(ArrayList<Object> list) {
			//TODO add functionality to prioritize tasks by due date and then priority
			ArrayList<Object> tempList = (ArrayList<Object>)list.clone();
			ArrayList<Object> sortedList;
			Reminder reminder = (Reminder)tempList.get(0);
			
			/* recursively calls the method if there are any more members of the list to compare, 
			 * returns a list with the last member when it reaches the end*/
			if(tempList.size() > 1) {
				tempList.remove(0);
				sortedList = prioritizeList(tempList); 
			}else{
				sortedList = new ArrayList<Object>();
				sortedList.add(reminder);
				return sortedList;
			}
			
			/*adds current member into its position in the sorted list*/
			int indexInList = 0;
			while(true) {
				Reminder comparingReminder = (Reminder)sortedList.get(indexInList);
				if(reminder.getPriority().ordinal() < comparingReminder.getPriority().ordinal()) {
					sortedList.add(indexInList, reminder);
					return sortedList;
				}else{
					indexInList++;
				}
			}
		}
	}

}
