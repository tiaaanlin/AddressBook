import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> book;

    public AddressBook(){
        book = new ArrayList<BuddyInfo>();

    }
    public void addBuddyInfo(BuddyInfo e){

        book.add(e);
    }
    public void removeBuddyInfo(int i){
        book.remove(i);
    }
 public static void main(String[] args){
        System.out.println("AddressBook");

        BuddyInfo buddy = new BuddyInfo();
        buddy.setName("Tom");
        AddressBook book = new AddressBook();
        book.addBuddyInfo(buddy);
        book.removeBuddyInfo(0);



 }
}
