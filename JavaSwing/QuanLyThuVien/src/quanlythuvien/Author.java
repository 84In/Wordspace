import java.util.Scanner;

public class Author {
    private String name;
    private Date birthday;

    public Author() {
        this.name = new String();
        this.birthday = new Date();
    }

    public Author(String name, Date x) {
        this.name = new String(name);
        this.birthday = new Date(x);
    }

    public Author(Author x) {
        this.name = new String(x.name);
        this.birthday = new Date(x.birthday);
    }

    public void setAuthor() {
        System.out.println("Nhap tac gia: ");
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
        this.birthday.setDate();
    }

    public void getAuthor() {
        System.out.println("Name: " + this.name + "; Birthday: " + this.birthday);
    }

    public String toString() {
        return "(Name: " + this.name + "; Birthday: " + this.birthday + ")";
    }
}
