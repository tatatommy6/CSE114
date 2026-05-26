//Minkyeol Kim

public class ContactsEZ extends Contacts{
    public ContactsEZ(){
        super();
    }

    /* 
    Function: lookup 
    Return an array of all contacts that contain 
    the info string (contain in the sense of the  
    contains() method from the ContactEZ class.) 
    Returns null if no contacts contain the info. 
    */ 
    public ContactEZ [] lookup(String info) {
        // create a temporary array: the size is the same as the number of contacts.
        ContactEZ [] tempArray = new ContactEZ[this.length()];

        // matchcnt counts how many contacts match the info.
        int matchcnt = 0;

        for(int i = 0;i < this.length(); i++){
            Contact c = this.get(i);

            // check the type of contract in the database(ContactEZ type)
            if(c instanceof ContactEZ){
                ContactEZ cez = (ContactEZ) c;
                if(cez.contains(info)){
                    tempArray[matchcnt] = cez;
                    matchcnt++;
                }
            }
        }
        // if nothing matchs, return null
        if (matchcnt == 0) return null;

        // Create and copy an array with the exact size corresponding 
        // to the number of matching items.
        ContactEZ [] finalArray = new ContactEZ[matchcnt];
        for(int i = 0; i < matchcnt; i++){
            finalArray[i] = tempArray[i];
        }

        return finalArray;
    }
}