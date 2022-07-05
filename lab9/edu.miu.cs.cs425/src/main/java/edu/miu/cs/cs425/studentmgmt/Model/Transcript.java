package edu.miu.cs.cs425.studentmgmt.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.sql.Struct;

@Entity

@Data
public class Transcript {
    public Transcript(int transcript_id, String degreeTitle) {
        Transcript_id = transcript_id;
        this.degreeTitle = degreeTitle;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Transcript_id;
    private String degreeTitle;

}
