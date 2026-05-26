// Minkyeol Kim

public class ContactEZ extends Contact{
    public ContactEZ(String name, String surname){
        super(name, surname);
    }
    
    /* 
    Function: contains 
    Returns true if the argument info appears as a  
    substring of the name, surname, email, phone or  
    address 
    */ 
    public boolean contains(String info) {
        if(info == null) return false;
        
        // function getName() returns "surname name" so we can check both name at the same time.
        if(getName() != null && getName().indexOf(info) != -1) return true;
        if(getEmail() != null && getEmail().indexOf(info) != -1) return true;
        if(getPhone() != null && getPhone().indexOf(info) != -1) return true;
        if(getAddress() != null && getAddress().indexOf(info) != -1) return true;   

        return false;
    }   

    @Override
    public boolean equals(Object o){
        //check the type of o
        if(! (o instanceof ContactEZ)) return false;

        // call the parent`s 'equals' method to check the name and surname is same.
        if(!super.equals(o))return false;

        // check the other information

        ContactEZ other = (ContactEZ) o;
        if(!safeEquals(this.getEmail(), other.getEmail())) return false;
        if(!safeEquals(this.getPhone(), other.getPhone())) return false;
        if(!safeEquals(this.getAddress(), other.getAddress())) return false;

        return true;
    }

    // helper method to prevent error when comparing null values.
    private boolean safeEquals(String s1, String s2){
        if(s1 == null && s2 == null) return true;
        if(s1 == null || s2 == null) return false;
        return s1.equals(s2);
    }
}
