package de.hsb.softw2muebase;

import com.fasterxml.jackson.annotation.JsonProperty;
<<<<<<< HEAD
=======

>>>>>>> origin/master
import javax.persistence.*;

@Entity
@Table(name="Filme")
public class Film {
<<<<<<< HEAD
     @Id
    @TableGenerator(name = "tabgenerator", allocationSize = 1,initialValue= -1)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "tabgenerator" )
    private
    int id;
=======
        private @Id
        @GeneratedValue(generator = "mysec", strategy = GenerationType.SEQUENCE)
        @SequenceGenerator(name="mysec", initialValue = 0, allocationSize = 1)
        int id;
>>>>>>> origin/master
    private @JsonProperty("name")
    String name;


    Film() {

    }
    Film(String name) {

        this.name=name;
    }

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
    @Override
    public String toString() {
        return ("{ \n" + "id: " + this.id + ",\nname: " + this.name + "\n}");
    }
}
