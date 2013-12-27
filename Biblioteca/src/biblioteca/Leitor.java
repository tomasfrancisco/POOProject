package biblioteca;

class Leitor extends Utilizador {

        private static final int limite_itens_aluno = 2;    //2 itens
        private static final int limite_emprestimos_aluno = 5; //5 dias
        private static final int limite_itens_prof = 5; //5 itens
        private static final int limite_emprestimos_prof = 92; //92 dias = 3 meses
        
        /**
         * 
         * @param tipo
         */
        int getLimite_itens(int tipo) {
            if(tipo == ALUNO){
                return limite_itens_aluno;
            }
            else if(tipo == PROF){
                return limite_itens_prof;
            }
            else{   //Em caso nenhum dos valores anteriores
                return ERRO;
            }
        }
        
         /**
         * 
         * @param tipo
         */
        int getLimite_emprestimos(int tipo) {
            if(tipo == ALUNO){
                return limite_emprestimos_aluno;
            }
            else if(tipo == PROF){
                return limite_emprestimos_prof;
            }
             //Em caso nenhum dos valores anteriores
            return ERRO;         
        }

        Leitor(String nome, String genero, String morada, String codigo_postal, String localidade, String telefone, String email, String data_nascimento, String username, String password, int tipo)
        {
            super.setNome(nome);
            super.setGenero(genero);
            super.setMorada(morada);
            super.setCodigo_postal(codigo_postal);
            super.setLocalidade(localidade);
            super.setTelefone(telefone);
            super.setEmail(email);
            super.setData_nascimento(data_nascimento);
            super.setUsername(username);
            super.setPassword(password);
            super.setTipo(tipo);            
        }
}