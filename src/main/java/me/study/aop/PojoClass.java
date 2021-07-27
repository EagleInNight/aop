package me.study.aop;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author Władysław Kapciuk
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@Accessors(chain = true)
public class PojoClass {

    private long id;
    private String shortName;
    private String name;

//    public long getId() {
//        return id;
//    }
//
//    public PojoClass setId(long id) {
//        this.id = id;
//        return this;
//    }
//
//    public String getShortName() {
//        return shortName;
//    }
//
//    public PojoClass setShortName(String shortName) {
//        this.shortName = shortName;
//        return this;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public PojoClass setName(String name) {
//        this.name = name;
//        return this;
//    }
}
