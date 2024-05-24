package com.castelo;

import com.castelo.dao.PessoaDao;
import com.castelo.dao.PessoaPojo;
import com.castelo.modelo.Pessoa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*  Inserindo pessoas no banco de dados.
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("pedro");
        pessoa.setEndereco("rua abc");
        pessoa.setIdade(18);


        PessoaPojo pessoaPojo = new PessoaPojo();
        pessoaPojo.setNome(pessoa.getNome());
        pessoaPojo.setIdade(pessoa.getIdade());
        pessoaPojo.setEndereco(pessoa.getEndereco());


        PessoaDao pessoaDao = new PessoaDao();
        pessoaDao.cadastrarPessoa(pessoaPojo);


        */
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Norberto");
        pessoa.setEndereco("Rua Puts, 123");
        pessoa.setIdade(68);
        pessoa.setId(2);
        


        PessoaPojo pessoaPojo = new PessoaPojo();
        pessoaPojo.setNome(pessoa.getNome());
        pessoaPojo.setIdade(pessoa.getIdade());
        pessoaPojo.setEndereco(pessoa.getEndereco());
        pessoaPojo.setId(pessoa.getId());


        PessoaDao pessoaDao = new PessoaDao();
        pessoaDao.atualizarPessoa(pessoaPojo);



        
    }
}
