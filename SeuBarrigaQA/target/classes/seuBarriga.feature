#language: pt
  Funcionalidade: Cadastro de Usuario e Movimentacao Financeira
    Cenario: Cadastrar um usuario
      Dado que esteja na pagina "https://seubarriga.wcaquino.me/login"
      Quando eu cadastro um novo usuario na aba "Novo Usuário?"
      Entao o usuario é cadastrado com sucesso

      Cenario: Cadastro de conta
        Dado que eu estou logado na aplicação
        Quando eu cadastro uma nova conta
        Entao a conta é cadastrada com sucesso

        Cenario: Cadastro de movimentacao financeira
          Dado que estou logado na aplicação e possuo uma conta cadastrada
          Quando eu incluo uma nova movimentação financeira associando a conta cadastrada
          Entao a movimentacao financeira é cadastrada com sucesso

          Cenario: Confirmacao do cadastro da movimentacao financeira
            Dado que estou logado na aplicacao e possuo uma movimentacao financeira cadastada
            Quando eu filtro a movimentacao pela data do pagamento
            Então a movimentacao financeira é exibida corretamente

          Cenario: Exclusão de movimentação financeira
          Dado que estou logado na aplicação e possuo uma movimentação financeira cadastrada
          Quando eu excluo a movimentação financeira
          Entao a movimentação financeira é excluída com sucesso

          Cenario: Exclusão de conta
          Dado que estou logado na aplicação e possuo uma conta cadastrada
          Quando eu excluo a conta cadastrada
          Entao a conta é excluída com sucesso

          Cenario: Reset
          Dado que estou logado na aplicação
          Quando eu clico em "reset"
          Entao a aplicação é resetada com sucesso

          Cenario: Logout
          Dado que estou logado na aplicação
          Quando eu efetuo o logout
          Entao sou redirecionado para a página de login
