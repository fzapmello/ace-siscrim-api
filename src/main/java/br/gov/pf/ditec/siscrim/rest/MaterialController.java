package br.gov.pf.ditec.siscrim.rest;

import br.gov.pf.ditec.siscrim.entidades.Material;
import br.gov.pf.ditec.siscrim.infra.http.Contexto;
import br.gov.pf.ditec.siscrim.servicos.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/material")
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @GetMapping("/{codigo}")
    public ResponseEntity<?> obterMaterial(@PathVariable("codigo") Long cod) {
        return ResponseEntity.ok(materialService.obterMaterial(getContexto(), cod));
    }

    @PostMapping("excluir/{codigo}/{motivo}")
    public ResponseEntity<?> excluirMaterial(@PathVariable("codigo") Long cod, @PathVariable("motivo") String motivo) {
        return ResponseEntity.ok(materialService.excluirMaterial(getContexto(), cod,motivo));
    }

    @PutMapping
    public ResponseEntity<?> alterarMaterial(@RequestBody Material material ) {
        return ResponseEntity.ok(materialService.alterarMaterial(getContexto(), material));
    }

    @PutMapping("/alterar-descricao")
    public ResponseEntity<?> alterarDescricaoMaterial(@RequestBody Material material) {
        return ResponseEntity.ok(materialService.alterarDescricaoMaterial(getContexto(), material));
    }

    @GetMapping("obter-lacre/{codigo}")
    public ResponseEntity<?> obterLacreAtualMaterial(@PathVariable("codigo") Long cod) {
        return ResponseEntity.ok(materialService.obterLacreAtualMaterial(getContexto(), cod));
    }

    @PostMapping("deslacrar-material/{codigo}/{comentario}")
    public ResponseEntity<?> deslacrarMaterialPorCodigo(@PathVariable("codigo") Long cod, @PathVariable("comentario") String comentario) {
        return ResponseEntity.ok(materialService.deslacrarMaterialPorCodigo(getContexto(), cod, comentario));
    }

    @PostMapping("lacrar-material/{codigo}/{lacre}/{comentario}/")
    public ResponseEntity<?> lacrarMaterialPorCodigo(@PathVariable("codigo") Long cod, @PathVariable("lacre") String lacre, @PathVariable("comentario") String comentario) {
        return ResponseEntity.ok(materialService.lacrarMaterialPorCodigo(getContexto(), cod, lacre, comentario));
    }

    private Contexto getContexto() {
        return new Contexto(null, "");
    }
}
