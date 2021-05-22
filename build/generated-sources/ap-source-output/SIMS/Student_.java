package SIMS;

import SIMS.Department;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-02T17:46:05")
@StaticMetamodel(Student.class)
public class Student_ { 

    public static volatile SingularAttribute<Student, String> studentid;
    public static volatile SingularAttribute<Student, String> image;
    public static volatile SingularAttribute<Student, String> address;
    public static volatile SingularAttribute<Student, String> studentname;
    public static volatile SingularAttribute<Student, Department> dept;
    public static volatile SingularAttribute<Student, Integer> age;

}