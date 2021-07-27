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
}
