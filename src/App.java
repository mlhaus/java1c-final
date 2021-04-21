import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String menuTitle = "Main Menu";
        String prompt = "Select an option:";
        String[] menuOptions = {"Test Data","Option 2","Option 3"};
        int choice = 0;
        while (true) {
            choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, scanner);
            if (choice == 0)
                continue;
            if (choice == menuOptions.length + 1)
                break;
            UIUtility.showSectionTitle(menuOptions[Integer.valueOf(choice) - 1]);
            switch (choice) {
                case 1:
                    testData(scanner);
                    break;
                case 2:

                    break;
                case 3:

                    break;
            }
        }
       System.out.println("\nProgram complete. Goodbye.\n");
       scanner.close();
    } 
    
    public static void testData(Scanner scanner) {
        Book b1 = new Book();
        Book b2 = new Book("Java 1", "Marc Hauschildt", "2021-02-06", 300, true);
        Book b3 = new ChildrensBook();
        Book b4 = new ChildrensBook("Java for Kids", "Marc Hauschildt", "Dr. Suess", "2021-03-14", 50, false);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        UIUtility.pressEnterToContinue(scanner);
    }
    

}