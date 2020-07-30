import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[]args){
        ArrayList<Person> contact = new ArrayList<Person>();
        contact.add(new Person("Betty Andersson", "0732972278", "Blomstervägen 20", "2330", "940206"));
        contact.add(new Person("Rachel Brown", "0733944471", "Klostergård 2", "2011", "921203"));
        contact.add(new Person("Adrian Smith", "0768031023", "Kallhall 10", "2133", "970921"));
        contact.add(new Person("Joe Johansen", "0734833188", "Ringblomman 8", "2933", "200624"));
        contact.add(new Person("Paul Olsen", "07348754667", "Roslagsgatan 31", "2549", "990303"));
        contact.add(new Person("Isabelle Aldrin", "0724472278", "Bolkavägen 3", "2330", "930401"));
        contact.add(new Person("Markus Larsen", "0735086651", "Stockholmsvägen 38", "2003", "911120"));
        contact.add(new Person("Taylor Richards", "0768035666", "Parkgatan 6", "2787", "880713"));
        contact.add(new Person("Jess Thompson", "0724859956", "Paketstigen 50", "2444", "830820"));
        contact.add(new Person("Audrey Lee", "0724912270", "Smultronskogen 20", "2809", "980514"));

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a name or phone number: "); //ask user for width value
        String input = scan.nextLine(); //store width value

        for (Person person : contact) {
            if (person.getName().equals(input) || person.getNumber().equals(input)) {
                System.out.println("Name: " + person.getName() + "\n" +
                        "Number: " + person.getNumber() + "\n" +
                        "Address: " + person.getAddress() + "\n" +
                        "Work number: " + person.getWorkNr() + "\n"
                        + "Date of birth: " + person.getDateOfBirth());
            }
        }
    }




}

