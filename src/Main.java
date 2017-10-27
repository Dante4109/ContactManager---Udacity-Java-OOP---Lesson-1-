public class Main {
    public static void main(String [] args) {


        ContactManager myContactManager = new ContactManager();

        Contact searchResult;

        Contact Mike = new Contact();

        Mike.name = "Mike";
        Mike.phoneNumber = "570-555-5555";

        Contact Anthony = new Contact();

        Anthony.name = "Anthony";
        Anthony.phoneNumber = "570-555-5558";

        Contact Maria = new Contact();

        Maria.name = "Maria";
        Maria.phoneNumber = "570-555-5559";

        myContactManager.addContact(Mike);
        myContactManager.addContact(Anthony);
        myContactManager.addContact(Maria);

        searchResult = myContactManager.searchContact("Mike");
        System.out.print(searchResult.name + " : " + searchResult.phoneNumber + "\n");

        searchResult = myContactManager.searchContact("Anthony");
        System.out.print(searchResult.name + " : " + searchResult.phoneNumber + "\n");

        searchResult = myContactManager.searchContact("Maria");
        System.out.print(searchResult.name + " : " + searchResult.phoneNumber + "\n");



    }
}

