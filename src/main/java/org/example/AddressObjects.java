package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class AddressObjects {

    @JsonProperty("OBJECT")
    @JacksonXmlElementWrapper(useWrapping = false)
    List<Object> object;
}
