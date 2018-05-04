package com.acn.manu.model;

import com.acn.manu.model.Employees;
import com.acn.manu.model.Locations;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-09T18:38:28")
@StaticMetamodel(Departments.class)
public class Departments_ { 

    public static volatile SingularAttribute<Departments, String> departmentName;
    public static volatile CollectionAttribute<Departments, Employees> employeesCollection;
    public static volatile SingularAttribute<Departments, Locations> locationId;
    public static volatile SingularAttribute<Departments, Short> departmentId;
    public static volatile SingularAttribute<Departments, Employees> managerId;

}