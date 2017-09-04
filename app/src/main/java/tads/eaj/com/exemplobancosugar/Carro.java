package tads.eaj.com.exemplobancosugar;

import com.orm.SugarRecord;

/**
 * Created by Taniro on 06/11/2016.
 */


public class Carro extends SugarRecord {

    String nome;
    String tipo;
    String desc;
    int ano;

    public Carro() {    }

    public Carro(int ano, String nome, String tipo, String desc) {
        this.ano = ano;
        this.nome = nome;
        this.tipo = tipo;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", desc='" + desc + '\'' +
                ", ano=" + ano +
                '}';
    }
}

