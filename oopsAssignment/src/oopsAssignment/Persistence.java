package oopsAssignment;

abstract class Persistence {
	abstract void persist();

     }
class FilePersistence extends Persistence{

	@Override
	void persist() {
		System.out.println("FilePersistence called");
	}
	
}
class DatabasePersistence extends Persistence{

	@Override
	void persist() {
		System.out.println("DatabasePersistence called");
			
	}
	
}
class TestAbstractClass {
	public static void main(String[] args)
	{
		Persistence p=new FilePersistence();
		p.persist();
		Persistence p1=new DatabasePersistence();
		p1.persist();
		
	}
}
