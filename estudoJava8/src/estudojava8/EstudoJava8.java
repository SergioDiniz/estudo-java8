/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudojava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import modelo.Usuario;

/**
 *
 * @author sergiodiniz
 */
public class EstudoJava8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Usuario user1 = new Usuario("Sergio", 24);
        Usuario user2 = new Usuario("Bel", 27);
        Usuario user3 = new Usuario("Lu", 24);
        
//        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);
        
        Consumer<Usuario> mostrador =  u -> System.out.println(u.getNome());
        
        usuarios.forEach(u -> System.out.println(u.getNome()));
        
        usuarios.removeIf(u -> u.getIdade() < 25);
        usuarios.forEach(System.out::println);
        
        
    }
    
}
