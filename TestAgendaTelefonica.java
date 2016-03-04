
/**
 * Write a description of class TestArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestAgendaTelefonica
{

    /**
     * Constructor for objects of class TestArrayListInt
     */
    public TestAgendaTelefonica()
    {   

        
        
        AgendaTelefonica agendaTelefonica1 = new AgendaTelefonica();

        
         
        if ((agendaTelefonica1.lookupNumber("uno")) == null) {
            System.out.println("No existen elementos");     

        }

        
        agendaTelefonica1.enterNumber("uno", "primero");
        if ((agendaTelefonica1.lookupNumber("uno")) != null) {
            System.out.println("se ha encontrado");     

        }

        AgendaTelefonica agendaTelefonica2 = new AgendaTelefonica();
        agendaTelefonica2.enterNumber("uno", "primero");
        if ((agendaTelefonica2.lookupNumber("dos")) == null) {
            System.out.println("Error no se ha encontrado");     

        }

    }
}
