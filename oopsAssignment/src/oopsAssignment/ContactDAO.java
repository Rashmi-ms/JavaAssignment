package oopsAssignment;

public class ContactDAO {
		   private static ContactDAO contactDAO = null;

		   private ContactDAO() {      
		   }

		   public static ContactDAO getInstance() {

		      // create object if it's not already created
		      if(contactDAO == null) {
		    	  contactDAO = new ContactDAO();
		      }

		       // returns the singleton object
		       return contactDAO;
		   }

		   public void getContactDetails() {
		       System.out.println("Contact Details");
		   }
		
		   public static void main(String[] args) {
			   ContactDAO obj1 = contactDAO.getInstance();
			   System.out.println(obj1);

		      // refers to the only object of Database
		      obj1= ContactDAO.getInstance();
		      
		      obj1.getContactDetails();
		   }
		}