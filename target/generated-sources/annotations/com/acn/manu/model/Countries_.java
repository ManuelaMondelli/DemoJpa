package com.acn.manu.model;

import com.acn.manu.model.Locations;
import com.acn.manu.model.Regions;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-09T18:38:28")
@StaticMetamodel(Countries.class)
public class Countries_ { 

    public static volatile SingularAttribute<Countries, Regions> regionId;
    public static volatile CollectionAttribute<Countries, Locations> locationsCollection;
    public static volatile SingularAttribute<Countries, String> countryName;
    public static volatile SingularAttribute<Countries, String> countryId;

}