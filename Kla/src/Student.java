public class Student extends Person{
    private int fachsemester;
    public Student(String vorname, String nachname,
                   String adresse, int fachsemester){
        super(vorname, nachname, adresse);
        this.fachsemester = fachsemester;
    }

    public static void main(String[] args) {
        try {
            Person p1 = new Person("Max", "Mustermann", "Musterstrasse");
            System.out.println(p1);
        }
        catch (Exception e) {
            System.out.println("Error parsing data, variables are private. Please fix it or create getter method");
        }
    }
}