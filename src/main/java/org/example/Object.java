package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Object {

    @JsonProperty("ID")
    private String id;

    @JsonProperty("OBJECTID")
    private String objectId;

    @JsonProperty("OBJECTGUID")
    private String objectGuid;

    @JsonProperty("CHANGEID")
    private String changeId;

    @JsonProperty("NAME")
    private String name;

    @JsonProperty("TYPENAME")
    private String typeName;

    @JsonProperty("LEVEL")
    private String level;

    @JsonProperty("OPERTYPEID")
    private String operTypeId;

    @JsonProperty("PREVID")
    private String prevId;

    @JsonProperty("NEXTID")
    private String nextId;

    @JsonProperty("UPDATEDATE")
    private String updateDate;

    @JsonProperty("STARTDATE")
    private String startDate;

    @JsonProperty("ENDDATE")
    private String endDate;

    @JsonProperty("ISACTUAL")
    private String isActual;

    @JsonProperty("ISACTIVE")
    private String isActive;
}
