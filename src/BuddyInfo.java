public class BuddyInfo {// this class is for creating a buddy object
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public static void main(String[] args) {

        BuddyInfo buddy = new BuddyInfo();
        buddy.setName("Tian");

        BuddyInfo buddy2 = new BuddyInfo();
        buddy2.setName("Alex");
        System.out.println("Hello, "+buddy.getName());
        System.out.println("Hello,"+buddy2.getName());
    }

}
