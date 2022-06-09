/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matheusgr;

/**
 *
 * @author mathe
 */
public class MedicoDAO extends Conexao{
    
    public String cadastrarMedico(Medico medico)
    {
        try
        {
            String sentenca;
            sentenca = "INSERT INTO medico VALUES (NULL, '" + medico.getNome() 
                    + "','" + medico.getEspecialidade() 
                    + "','" + medico.getCrm() + "','" + medico.getCpf() + "')";
            
            return this.atualizarBanco(sentenca);
        }
        catch(Exception e)
        {
            return e.getMessage();
        }
    }
    
}
