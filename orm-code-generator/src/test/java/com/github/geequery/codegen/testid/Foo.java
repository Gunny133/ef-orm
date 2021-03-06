package com.github.geequery.codegen.testid;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.github.geequery.orm.annotation.InitializeData;

@Entity
@Table(name = "foo")
@InitializeData(charset = "GB18030", value = "/test.txt")
public class Foo extends jef.database.DataObject {
    @Id
    @GeneratedValue
    private int id;
    
    private int ii;

    private String name;
    
    
 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public enum Field implements jef.database.Field {
        id, name;
    }
}
