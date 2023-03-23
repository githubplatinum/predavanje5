import java.util.ArrayList;
import java.util.Scanner;

public class Evidencija {
    /* atributi; lista studenata ArrayList<Student>*
    -metode: dodavanje studenata, pretraga po broju indexa, ispis svih studenata
        /
     */
    private  ArrayList<Student> studentList = new ArrayList<>();
    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void searchByIndeksNumber(String indeksNumber){
        boolean studentPronaden = false;
        for (Student student: studentList){
            if(student.getBrojIndeksa().equals(indeksNumber)) {
                System.out.println("------------------------");
                System.out.println("Student je pronaden: " + student.getIme());
                studentPronaden = true;
            }
        }
        if(!studentPronaden) {
            System.out.println("Student nije pronaden");
        }
    }

    public void showStudentList(){
        System.out.println("------------------------");
        System.out.println("Popis svih studenata: ");
        for (Student student: studentList) {
            System.out.println(student.getIme() + " "+ student.getPrezime());
        }
    }
    public void showOptions() {
        System.out.println("Odaberite opciju: ");
        System.out.println("1. Dodaj studenta");
        System.out.println("2. Pretraga po indeksu");
        System.out.println("3. Ispisi sve studente");
        System.out.println("4. Izlaz");
    }

    public Student userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite ime: ");
        String ime = scanner.nextLine();

        System.out.println("Unesite prezime: ");
        String prezime = scanner.nextLine();

        System.out.println("Unesite godinu studija: ");
        int godina = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Unesite broj indeksa: ");
        String brojIndeksa = scanner.nextLine();

        Student newStudent = new Student(ime, prezime, godina, brojIndeksa);
        return newStudent;

    }

}
