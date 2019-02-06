
package calculoimc;



public class Imc {
    
    

    //calcula o IMC
    
    public double calcular(double peso, double altura){
        
        return peso / (altura*altura);   
    }

    //retorna situacao IMC
    
    
    
     public String pública  ( double imc ) { 
        
        String situacao =  " " ;
        
        if (imc < 18.5 ) {
            
            situacao =  " Abaixo do Peso! " ;
            
        } else  if( imc >=18.5  && imc <= 24.9 ) {
            
            situacao =  " Peso Normal! " ;
            
        } if (imc >= 24.9  && imc <= 29.9 ) {
            
            situacao =  " Sobrepeso! " ;
            
        } if ( imc >= 30 && imc <= 35 ) {
            
            situacao =  " Obesidade Grau 1! " ;
            
        }  if ( imc >=35  && imc <=  40 ) {
        
        situacao =  " Obesidade Severa! " ;
        
        }  if (imc > 40 ) {
            
            situacao =  " Obesidade Mórbida !!! " ;
            
        }
        return situacao;
       
    }
    public String Identidade(String nome){
        
        
        return nome;
        
        
    }
    
     }
     
