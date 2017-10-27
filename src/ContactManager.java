public class ContactManager {
    // Fields:
    Contact [] myFriends;
    int friendsCount;

    // Constructor:
    public ContactManager(){
        friendsCount = 0;
        myFriends = new Contact[500];
    }

    // Methods:
    public void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    public Contact searchContact(String searchName){
        for(int i=0; i<friendsCount; i++){
            if(myFriends[i].name.equals(searchName)){
                return myFriends[i];
            }
        }
        return null;
    }
}



