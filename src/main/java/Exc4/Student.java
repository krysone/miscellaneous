package Exc4;


import java.util.ArrayList;
import java.util.List;

public class Student {
    /*
    *     - posiadać listę ocen studenta (List<Double>)
    - posiadać (pole) numer indeksu studenta (String)
    - posiadać (pole) imię studenta
    - posiadać (pole) nazwisko studenta

    * */

    private String index;
    private String name;
    private String surname;
    private ArrayList<Double> marks;

    private Student(final String index, final String name, final String surname, final ArrayList<Double> marks) {
        this.index = index;
        this.name = name;
        this.surname = surname;
        this.marks = marks;
    }

    public static class Builder{
       String index;
       String name;
       String surname;
       ArrayList<Double> marks;


       public Builder setIndex(final String index) {
           this.index = index;
           return this;
       }

       public Builder setName(final String name) {
           this.name = name;
           return this;
       }

       public Builder setSurname(final String surname) {
           this.surname = surname;
           return this;
       }

       public Builder setMarks(final Double ... marks) {
           ArrayList<Double> m = new ArrayList<>();
           m.add(... marks);
           this.marks = m;
           return this;
       }
       public Student build(){
           return new Student(index,name,surname,marks);
       }
   }
}


