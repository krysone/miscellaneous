package Exc4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dziennik {

    /*
    * Klasa Dziennik powinna:
    - posiadać (jako pole) mapę Studentów.  //#(co powinno być kluczem?)
    - posiadać metodę 'dodajStudenta(Student):void' do dodawania nowego studenta do dziennika
    - posiadać metodę 'usuńStudenta(Student):void' do usuwania studenta
    - posiadać metodę 'usuńStudenta(String):void' do usuwania studenta po jego numerze indexu
    - posiadać metodę 'zwróćStudenta(String):Student' która jako parametr przyjmuje numer indexu studenta,
    *  a w wyniku zwraca konkretnego studenta.
    - posiadać metodę 'podajŚredniąStudenta(String):double' która przyjmuje indeks studenta i zwraca średnią ocen studenta.
    - posiadać metodę 'podajStudentówZagrożonych():List<Student>'
    - posiadać metodę 'posortujStudentówPoIndeksie():List<Student>' - która sortuje listę studentów po numerach indeksów,
    * a następnie zwraca posortowaną listę.

    * */

    Map<String, String> Students = new HashMap();

    public void addStudent(Student student) {

    }
    public void removeStudent(Student student) {

    }
    public void removetudent(Student index) {

    }

    public Student printOutStudent(String index) {
        return student;
    }
    public Double avg (String index) {
        return Average;
    }
    public List<Student> endangeredStudents() {
        return list;
    }
    public List<Student> getSortedList(){
        return sortedList;
    }

}
