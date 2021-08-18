
class Q3 {
    public static void main(String[] args) {
        var m1 = new Mobile(40000, "Sony", "Udbhav Misra");
        var m2 = new Mobile(75000, "Zeiss", "Himanshu");
        var m3 = new Mobile(105000, "Apple", "P1xxx3L");

        m1.print();
        m2.print();
        m3.print();
    }
}


class Mobile {
    private int cost;
    private String camera;
    public String username;

    public Mobile(int cost, String camera, String username) {
        this.cost = cost;
        this.camera = camera;
        this.username = username;
    }

    public void print() {
        System.out.println("Cost: " + cost + "\nCamera: " + camera + "\nUsername: " + username);
        System.out.println("------------------------------------------------------------");
    }
}
