package br.com.microservice.fornecedor.controller;

import br.com.microservice.fornecedor.model.InfoFornecedor;
import br.com.microservice.fornecedor.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private InfoService infoService;

    @GetMapping("/{estado}")
    public InfoFornecedor getInforPorEstado(@PathVariable String estado){
        return infoService.getInfoPorEstado(estado);
    }
}
