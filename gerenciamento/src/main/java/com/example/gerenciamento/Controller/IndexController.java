package com.example.gerenciamento.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/home")
    public String acessoHomePage() {
        return "index";
    }
    // @GetMapping("/patrimonio")
    // public String acessoPatrimonio() {
    //     return "patrimonio";
    // }
    @GetMapping("/login")
    public String acessoLoginFuncionario() {
        return "login/login-funcionario";
    }
    @GetMapping("/cadastro-funcionario")
    public String acessoCadastroFuncionario() {
        return "cadastro/cadastro-funcionario";
    }
}
