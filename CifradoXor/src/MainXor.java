
import java.math.BigInteger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kevin Carbajal
 */
public class MainXor {
    public static void main(String args[]) {
        
       String plaintext = "kevin jaja d";
       String descifrar = "ZWE][XR^TV";
       String key = "12345";
       Xor Xor = new Xor();
       String encrypted = Xor.xor_encrypt(plaintext, key);
       String decrypted = Xor.xor_encrypt(descifrar, key);
       //String decrypted = Xor.xor_decrypt(plaintext, key);
       System.out.println("Encrypted: "+encrypted);
       System.out.println("Decrypted: "+decrypted);
    }
    
    
    
    
    
    
    
    
    
    
    
    
     private String Binario(int Decimal) {
        int R, x = 0;//variables que se implementaran
        String Binario = ""; //guarda el contenido en codigo binario
        R = Decimal % 2;//resto del parametro 
        if (R == 1) {//si el resto es 1
            while (Decimal > 1) {//si el parametro es mas grande q el resto
                Decimal /= 2;//entonces decimal se divide en 2 y se guarda en decimal
                x = Decimal % 2;//x contendra el resto del decimal
                Binario = String.valueOf(x + Binario);//binario se ira formando de forma correcta y no alreves
            }
        } else {//si resto no es 1
            while (Decimal > 0) {//y decimal es mayor a 0
                Decimal /= 2;//decimal se divide en 2
                x = Decimal % 2;//x contendra el resto del decimal resultante
                Binario = String.valueOf(x + Binario);//se forma el numero en binario de forma correcta
            }
        }
        return String.valueOf(Binario + x);//devuelve el binario resultante mas el ultimo bit
    }
        
        private String separaPorDigito(String digitoBinario) {
        String frase = "";//almacena la frase completa

        for (int i = 0; i < digitoBinario.length(); i += 8) {//recorre la frase de 8 en 8
            /*separa la cadena cada 8 digitos con substring*/
            String cadenaSeparada = digitoBinario.substring(i, i + 8);
            /*entrega un numero decimal a partir de un numero binario de 8 bit*/
            int decimal = Integer.parseInt(cadenaSeparada, 2);
            /*concadena la drase y transfroma el decimal a Ascii*/
            frase = frase + (char) decimal;
        }
        return frase;//retorna la frase completa
    }
}
