package pl.coderslab.entity;


import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    @NotBlank
    @Size(min = 3)
    //@Pattern(regexp = "[a-zA-Z]*")
    private String name;

    @OneToMany(mappedBy = "city", cascade = CascadeType.REMOVE)
    private List<RunImport> runImports;

    public List<RunImport> getRunImports() {
        return runImports;
    }

    public void setRunImports(List<RunImport> runImports) {
        this.runImports = runImports;
    }

    @OneToMany
    private List<Run> runs = new ArrayList<Run>();


    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", runs=" + runs +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Run> getRuns() {
        return runs;
    }

    public void setRuns(List<Run> runs) {
        this.runs = runs;
    }
}
