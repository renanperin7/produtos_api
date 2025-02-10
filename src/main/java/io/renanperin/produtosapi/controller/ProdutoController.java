package io.renanperin.produtosapi.controller;

import io.renanperin.produtosapi.model.Produto;
import io.renanperin.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;


    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public String salvar(@RequestBody Produto produto) {
        System.out.println("Produto recebido: " + produto );

        var id = UUID.randomUUID().toString();
        produto.setId(id);

        produtoRepository.save(produto);
        return produto.getId();
    }

    @GetMapping("/{id}")
    public Produto obterProduto(@PathVariable("id") String id) {
        return produtoRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable("id") String id) {
        produtoRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable("id") String id, @RequestBody Produto produto) {
        produto.setId(id);
        produtoRepository.save(produto);
    }

    @GetMapping
    public List<Produto> buscar(@RequestParam("nome") String nome) {
        return produtoRepository.findByNome(nome);
    }
}
