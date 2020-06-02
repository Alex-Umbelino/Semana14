import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;
import java.util.ArrayList;
import java.awt.*;

public class JTabela extends JFrame
{
 private JTable nomes;
 private DefaultTableModel nomesModel;
  
 
 public JTabela ()
 {
  super ("Tabela JTable");
 String cols[] = {"Nome", "Idade", "Sexo", "Endereço", "Vegetariana(o)", "Esportes"};
  nomesModel=new DefaultTableModel(cols,6);
  nomes=new JTable (nomesModel);
 
 }
 public void init()
 {
  setSize(900,600);
  setLocation(300,400);
  //Os elementos são manoseados por meio do MODEL.
  // é aqui que incluimos na tabela
  
  
  
       String numer="";
       Pessoa pessoa;
       Pessoa auxiliar=new Pessoa();
      ArrayList<Pessoa> lista = auxiliar.listar();
     
       //-----------------
      
      
      String resp="";
      for(int i = 0; i < lista.size(); i++)
      {
         pessoa = lista.get(i);
         numer=""+i;
         
         if(pessoa.getVegetariano())
         {
          resp="Sim";
         }
         else
         {
          resp="Não";
         }
             
         Object[] row1={pessoa.getNome(),pessoa.getIdade(),pessoa.getSexo(),pessoa.getEndereco(), resp  ,pessoa.getEsportes()};
         nomesModel.insertRow(1,row1);
         
      }
     

  //Incluindo um scroll
  JScrollPane auxNomes=new JScrollPane(nomes,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
  getContentPane().add(auxNomes,BorderLayout.CENTER);
  getContentPane().add(new JLabel("Informações"),BorderLayout.NORTH);
  setVisible(true);
  
 }
 
 public static void main(String [] args)
 {
   new  JTabela().init();
 }
  
}
