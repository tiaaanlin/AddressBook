import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> book;

    public void AddressBook(){
        this.book = new ArrayList<>();

    }
    public void addBuddyInfo(BuddyInfo e){
        book.add(e);
    }
    public void removeBuddyInfo(int i){
        book.remove(i);
    }
 public static void main(String[] args){
        System.out.println("AddressBook");
 }
}
