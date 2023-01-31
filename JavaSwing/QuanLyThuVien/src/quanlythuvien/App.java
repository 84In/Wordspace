public class App {
    public static void main(String[] args) throws Exception {
        Date ngay1 = new Date(23, 04, 2003);
        Date ngay2 = new Date(23, 07, 2003);
        Date ngay3 = new Date(04, 04, 2003);
        Author tg1 = new Author("Ni", ngay1);
        Author tg2 = new Author("Na", ngay2);
        Author tg3 = new Author("Ia", ngay3);
        Book sach1 = new Book("Lap Trinh Java", 5000, 2023, tg1);
        Book sach2 = new Book("Lap Trinh C++", 10000, 2029, tg2);
        Book sach3 = new Book("Lap Trinh Mang", 15000, 2029, tg3);
        sach1.printNameBook();
        sach2.printNameBook();
        sach3.printNameBook();
        System.out.println("Kiem tra nam xuat ban sach 1 va 2: " + sach1.checkPushLishDate(sach2));
        System.out.println("Kiem tra nam xuat ban sach 2 va 3: " + sach2.checkPushLishDate(sach3));
        System.out.println("Sach 1 giam 10%: " + sach1.priceDiscount(10));
        System.out.println("Sach 2 giam 20%: " + sach1.priceDiscount(20));
        System.out.println("Sach 3 giam 30%: " + sach1.priceDiscount(30));
    }
}
