import java.util.Scanner;

public class Date {
    private int day, month, year;

    public Date() {
        this.day = this.month = this.year = 1;
    }

    public Date(Date d) {
        this.day = d.day;
        this.month = d.month;
        this.year = d.year;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        if (!check())
            System.out.println("Loi dinh dang");
    }

    protected boolean check() {
        int[] monthTrue = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (this.year % 4 == 0 && this.year % 100 != 0 || this.year % 400 == 0) {
            monthTrue[2] = 29;
        }
        if (this.year > 0) {
            if (this.month < 13 && this.month > 0) {
                if (this.day > 0 && this.day <= monthTrue[this.month]) {
                    return true;
                }
            }
        }
        return false;
    }

    public void setDate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay thang nam!!");
        this.day = sc.nextInt();
        this.month = sc.nextInt();
        this.year = sc.nextInt();
    }

    public void getDate() {
        System.out.println(this.day + "/" + this.month + "/" + this.year);
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return this.day + "/" + this.month + "/" + this.year;
    }
}
