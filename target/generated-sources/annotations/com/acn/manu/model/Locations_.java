package com.acn.manu.model;

import com.acn.manu.model.Countries;
import com.acn.manu.model.Departments;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-09T18:38:28")
@StaticMetamodel(Locations.class)
public class Locations_ { 

    public static volatile SingularAttribute<Locations, String> streetAddress;
    public static volatile SingularAttribute<Locations, String> city;
    public static volatile SingularAttribute<Locations, Short> locationId;
    public static volatile SingularAttribute<Locations, String> postalCode;
    public static volatile SingularAttribute<Locations, String> stateProvince;
    public static volatile CollectionAttribute<Locations, Departments> departmentsCollection;
    public static volatile SingularAttribute<Locations, Countries> countryId;

}