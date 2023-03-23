import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*Main metoda treba omoguciti unos studenata, pretragu i ispis
    * pomocu scanner klase */
        Evidencija evidencija = new Evidencija();
        Scanner scanner = new Scanner(System.in);

        int option =0;

        do {
            try {


            evidencija.showOptions();
            option=scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    Student student = evidencija.userInput();
                    evidencija.addStudent(student);
                    System.out.println("student dodan");
                    break;
                case 2:
                    System.out.println("Unesite broj indeksa: ");
                    String brojIndeksa = scanner.nextLine();
                    evidencija.searchByIndeksNumber(brojIndeksa);
                    break;
                case 3:
                    evidencija.showStudentList();
                    break;
                case 4:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Netocan unos!");
            }}
            catch (InputMismatchException e){
                    System.out.println("Netocan unos!");
                    scanner.nextLine();
                }
        }while (option !=4);



          }
}