package dev.java10x.CadastroDeNinja.Ninjas.Controller.Service;

import dev.java10x.CadastroDeNinja.Missoes.MissaoModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name= "tb_cadastro")
public class NinjaModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    //@ManyToOne um ninja tem uma unica missão
    @ManyToOne
    @JoinColumn(name = "missoes") //Fareing key ou Chave estrangeira
    private MissaoModel missoes;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
