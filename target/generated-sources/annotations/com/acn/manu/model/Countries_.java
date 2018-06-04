package com.acn.manu.model;

import com.acn.manu.model.Locations;
import com.acn.manu.model.Regions;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-04T15:12:46")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-24T16:16:02")
>>>>>>> origin/develop
@StaticMetamodel(Countries.class)
public class Countries_ { 

    public static volatile SingularAttribute<Countries, Regions> regionId;
    public static volatile CollectionAttribute<Countries, Locations> locationsCollection;
    public static volatile SingularAttribute<Countries, String> countryName;
    public static volatile SingularAttribute<Countries, String> countryId;

}
