import javax.swing.JOptionPane;

public class EntreCemEDuzentos
{
   public static void main(String [] args)
   {
      int numero, i = 0;
      
      do
      {
      
         numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));
         
         if(numero >= 100 && numero <= 200)
         {
            i++;
         }
      
      }while(numero != 0);
      
      System.out.println("A quantidade de numeros digitados entre 100 e 200 foi: " + i);
   }

}