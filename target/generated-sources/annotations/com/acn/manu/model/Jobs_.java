package com.acn.manu.model;

import com.acn.manu.model.Employees;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-04T15:12:46")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-24T16:16:02")
>>>>>>> origin/develop
@StaticMetamodel(Jobs.class)
public class Jobs_ { 

    public static volatile CollectionAttribute<Jobs, Employees> employeesCollection;
    public static volatile SingularAttribute<Jobs, String> jobId;
    public static volatile SingularAttribute<Jobs, Integer> maxSalary;
    public static volatile SingularAttribute<Jobs, String> jobTitle;
    public static volatile SingularAttribute<Jobs, Integer> minSalary;

}
