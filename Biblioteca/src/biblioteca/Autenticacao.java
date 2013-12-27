/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca;

import java.util.*;

/**
 *
 * @author tomas
 */
abstract class Autenticacao {
    
    public static boolean login(ArrayList <Utilizador> utilizadores, String username, String password)
    {
        for(int i = 0; i < utilizadores.size(); i++)
        {
            if(utilizadores.get(i).getUsername().equals(username) || utilizadores.get(i).getEmail().equals(username))
            {
                if(utilizadores.get(i).getPassword().equals(password))
                {
                    System.out.println("Login efectuado com sucesso!");
                    return true;
                }
            }
        }
        System.out.println("Login falhado!");
        return false;
    }
    
}
