/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matheusgr;

/**
 *
 * @author mathe
 */
public class PacienteDAO extends Conexao{
    
    public String cadastrarPaciente(Paciente paciente)
    {
        try
        {
            String sentenca;
            sentenca = "INSERT INTO paciente VALUES (NULL, '" + paciente.getNome() 
                    + "','" + paciente.getCpf() 
                    + "','" + paciente.getIdade() + "')";
            
            return this.atualizarBanco(sentenca);
        }
        catch(Exception e)
        {
            return e.getMessage();
        }
    }
    
}
