import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Pessoa
{//Atributos
 private String nome; 
 private int idade;
 private String sexo;
 private String endereco;
 private boolean vegetariano;
 private String esportes;
 
 
 //Metodo construtor
 public Pessoa(String nome,int idade,String sexo,String endereco,boolean vegetariano,String esportes)
 {
   this.nome=nome;
   this.idade=idade;
   this.sexo=sexo;
   this.endereco=endereco;
   this.vegetariano=vegetariano;
   this.esportes=esportes;
 }
 //construtor padrão
 public Pessoa(){};
 
 //Metodos modificadores
 public void setNome(String nome)
 {
   this.nome=nome;
 }
 public void setIdade(int idade)
 {
    this.idade=idade;
 }
 public void setSexo(String sexo)
 {
    this.sexo=sexo;
 }
 public void setEndereco(String endereco)
 {
  this.endereco=endereco;
 }
 public void setVegetariano(boolean vegetariano)
 {
      this.vegetariano=vegetariano;
 }
 public void setEsportes(String esportes)
 {
  this.esportes=esportes;
 }
 //metodos de acesso
 public String getNome()
 {
  return nome;
 }
 public int getIdade()
 {
  return idade;
 }
 public String getSexo()
 {
  return sexo;
 }
public String getEndereco()
{
  return endereco;
}

 public boolean getVegetariano()
 {
  return vegetariano;
 }
 public String getEsportes()
 {
  return esportes;
 }
 
 
  //Mostrar tudo
   public ArrayList <Pessoa> listar()
   {
      ArrayList <Pessoa> pessoas=new ArrayList<>();
     //try with resources
      try
        (
         Connection conn=new ConexaoBD().obtemConexao();
         PreparedStatement ps=conn.prepareStatement("SELECT nome,idade,sexo,endereco,vegetariano,esporte_preferido FROM pessoas;");
         
         ResultSet rs= ps.executeQuery())
      {    
         while (rs.next())
         {   
            
            String nome   =rs.getString("nome");
            int idade = rs.getInt("idade");
            String sexo =rs.getString("sexo");
            String endereco =rs.getString("endereco");
            boolean vegetariano   =rs.getBoolean("vegetariano");
            String esportes  =rs.getString("esporte_preferido");
         
            
            Pessoa p =new Pessoa (nome,idade,sexo,endereco,vegetariano,esportes);
            pessoas.add(p); 
         }
         return pessoas;
      }
      catch (Exception e)
      {
         e.printStackTrace();
         return null;
      }
        
   }
 
 
 
 
} 