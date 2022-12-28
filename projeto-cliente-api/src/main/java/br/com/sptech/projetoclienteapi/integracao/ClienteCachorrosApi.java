package br.com.sptech.projetoclienteapi.integracao;

import br.com.sptech.projetoclienteapi.modelo.Cachorro;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "cachorrosApi", url = "https://5f861cfdc8a16a0016e6aacd.mockapi.io/bandtec-api/")
public interface ClienteCachorrosApi {

    @GetMapping("/cachorros")
    List<Cachorro> get();
    @GetMapping("/cachorros/{id}")
    Cachorro get(@PathVariable int id);

    @DeleteMapping("/cachorros/{id}")
    void delete(@PathVariable int id);

    @PostMapping("/cachorros")
    void post(@RequestBody Cachorro novoCachorro);

    @PutMapping("/cachorros/{id}")
    void put(@RequestBody Cachorro novoCachorro, @PathVariable int id);

}
