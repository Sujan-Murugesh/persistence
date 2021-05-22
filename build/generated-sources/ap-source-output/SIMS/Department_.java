package SIMS;

import SIMS.Student;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-02T17:46:05")
@StaticMetamodel(Department.class)
public class Department_ { 

    public static volatile SingularAttribute<Department, String> departmentname;
    public static volatile SingularAttribute<Department, Integer> departmentid;
    public static volatile CollectionAttribute<Department, Student> studentCollection;

}