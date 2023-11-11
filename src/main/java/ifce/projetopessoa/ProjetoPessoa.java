/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ifce.projetopessoa;

import modelo.Pessoa;

/**
 *
 * @author Usuario
 */
public class ProjetoPessoa {

    public static void main(String[] args) {
         Pessoa pessoa = new Pessoa("Maria", 25);
        System.out.println("Nome: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade());
         // Fazendo alguns aniversários
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();

        System.out.println("Nome: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade());
    }
}
