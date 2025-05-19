package dev.java10x.CadastroDeNinja.Missoes;


import dev.java10x.CadastroDeNinja.Ninjas.Controller.Service.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missao")
public class MissaoModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private  int id;
  private String nome;
  private String dificuldade;

  //@oneToMany uma missao pode ter varios ninjas
  @OneToMany(mappedBy = "missoes")
  private List<NinjaModel> Ninja;

    public MissaoModel() {
    }

    public MissaoModel(int id, String nome, String dificuldade) {
        this.id = id;
        this.nome = nome;
        this.dificuldade = dificuldade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }
}
