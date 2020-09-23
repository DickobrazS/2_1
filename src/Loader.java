import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        Book book = new Book();
        Scanner in = new Scanner(System.in);
        String type;
        System.out.println("Введите наименование и автора книги:");
        type = in.nextLine();
        book.setWright(type);
        type = in.nextLine();
        book.setName(type);
        System.out.println("Введите количество глав и колиячество страниц:");
        int a = in.nextInt();
        book.setSect(a);
        a = in.nextInt();
        book.setNumb(a);

        System.out.println("Сравните введенные данные с полученными:");
        System.out.println(book.getWright() + " " + book.getName() + " " + book.getSect() + " " + book.getNumb());
    }
}
