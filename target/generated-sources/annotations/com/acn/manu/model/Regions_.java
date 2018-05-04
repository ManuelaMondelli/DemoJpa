package com.acn.manu.model;

import com.acn.manu.model.Countries;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-09T18:38:28")
@StaticMetamodel(Regions.class)
public class Regions_ { 

    public static volatile SingularAttribute<Regions, BigDecimal> regionId;
    public static volatile SingularAttribute<Regions, String> regionName;
    public static volatile CollectionAttribute<Regions, Countries> countriesCollection;

}