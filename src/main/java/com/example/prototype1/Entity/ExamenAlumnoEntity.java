package com.example.prototype1.Entity;

import javax.persistence.*;

@Entity
@Table (name = "userexamen")
public class ExamenAlumnoEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Long iduserexam;

    @ManyToOne(fetch = FetchType.EAGER)
    private UsuariosEntity examenunico;

    @ManyToOne(fetch = FetchType.EAGER)
    private ExamenEntity userusuario;

    public Long getIduserexam() {
        return iduserexam;
    }

    public void setIduserexam(Long iduserexam) {
        this.iduserexam = iduserexam;
    }

    public UsuariosEntity getExamenunico() {
        return examenunico;
    }

    public void setExamenunico(UsuariosEntity examenunico) {
        this.examenunico = examenunico;
    }

    public ExamenEntity getUserusuario() {
        return userusuario;
    }

    public void setUserusuario(ExamenEntity userusuario) {
        this.userusuario = userusuario;
    }
}
