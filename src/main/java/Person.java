public class Person {

    public String name;
    public String number;
    public String address;
    public String workNr;
    public String dateOfBirth;

    public Person(String name, String number, String address, String workNr, String dateOfBirth) {
        this.name = name;
        this.number = number;
        this.address = address;
        this.workNr = workNr;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }
    public String getNumber(){
        return number;
    }
    public String getAddress() {
        return address;
    }
    public String getWorkNr(){
        return workNr;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    @Override
    public String toString() {
        return name + " " + number + " " + address + " " + workNr + " " + dateOfBirth;
    }



}





