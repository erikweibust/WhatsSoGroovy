public class GroovyPersonDemo {

	public static void main( String[] args ) {
		GroovyPerson p = new GroovyPerson();
		System.out.println( p );
		GroovyPerson p2 = new GroovyPerson( name:"Erik", dob:new Date() );
		System.out.println( p2 );
	}
}
