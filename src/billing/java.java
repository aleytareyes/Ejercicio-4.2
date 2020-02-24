
package billing;


public class java {

    
    public static void main(String[] args) {
        
        Billing p1= new Billing();
	
    
        System.out.println(p1.computeBill((float)10));
        System.out.println(p1.computeBill((float)10,(int)2));
        System.out.println(p1.computeBill((float)10,(int)2,(float)4));
    }
    
}
