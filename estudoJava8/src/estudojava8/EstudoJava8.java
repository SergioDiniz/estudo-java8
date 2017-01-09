/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudojava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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
        
//        usuarios.removeIf(u -> u.getIdade() > 25);
        usuarios.forEach(System.out::println);
        
        
        System.out.println("------ ORDENAR ------");
        
        Collections.sort(usuarios, (u1, u2) -> {
//            return u1.getNome().compareTo(u2.getNome);
            return String.CASE_INSENSITIVE_ORDER.compare(u1.getNome(), u2.getNome());
        });
        
        usuarios.forEach(System.out::println);
        
        System.out.println("------");
        
        usuarios.sort((u1, u2) -> u1.getNome().compareTo(u2.getNome()));
        usuarios.forEach(System.out::println);
        
        System.out.println("------");
        
        usuarios.sort(Comparator.comparing(Usuario::getNome));
        usuarios.forEach(System.out::println);
        
        System.out.println("------");
        
        usuarios.sort(Comparator.comparingInt(Usuario::getIdade));
        usuarios.forEach(System.out::println);
        
        
        System.out.println("------");
        
        usuarios.sort(Comparator.nullsLast(
                    Comparator
                        .comparingInt(Usuario::getIdade)
                        .thenComparing(Usuario::getNome)
                    )
        );
        
        usuarios.forEach(System.out::println);
        
    }
    
}
