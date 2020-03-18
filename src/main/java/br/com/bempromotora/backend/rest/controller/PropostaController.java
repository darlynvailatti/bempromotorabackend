package br.com.bempromotora.backend.rest.controller;

import br.com.bempromotora.backend.domain.proposta.PropostaEntity;
import br.com.bempromotora.backend.rest.converter.*;
import br.com.bempromotora.backend.rest.dto.proposta.*;
import br.com.bempromotora.backend.service.IPropostaService;
import br.com.bempromotora.backend.service.dto.CreatePropostaRequest;
import br.com.bempromotora.backend.service.dto.CreatePropostaResponse;
import br.com.bempromotora.backend.service.dto.SubmissaoPropostaRequest;
import br.com.bempromotora.backend.service.dto.SubmissaoPropostaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/propostas")
public class PropostaController {

    @Autowired
    private CreatePropostaRequestDTOConverter createPropostaRequestDTOConverter;

    @Autowired
    private CreatePropostaResponseConverter createPropostaResponseConverter;

    @Autowired
    private PropostaEntityToDTOConverter propostaEntityToDTOConverter;

    @Autowired
    private SubmissaoPropostaRequestDTOToEntityConverter submissaoPropostaRequestDTOToEntityConverter;

    @Autowired
    private SubmissaoPropostaResponseDTOToEntityConverter submissaoPropostaResponseDTOToEntityConverter;

    @Autowired
    private IPropostaService propostaService;


    @GetMapping
    public ResponseEntity<List<PropostaDTO>> getAllPropostas() {
        List<PropostaEntity> allPropostas = propostaService.getAllPropostas();
        return ResponseEntity.ok(allPropostas.stream().map(p -> propostaEntityToDTOConverter.convert(p)).collect(Collectors.toList()));
    }


    @PostMapping
    public ResponseEntity<CreatePropostaResponseDTO> createProposta(@Valid @RequestBody CreatePropostaRequestDTO createPropostaRequestDTO) {
        CreatePropostaRequest createPropostaRequest = createPropostaRequestDTOConverter.convert(createPropostaRequestDTO);
        CreatePropostaResponse createPropostaResonse = propostaService.createProposta(createPropostaRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(createPropostaResponseConverter.convert(createPropostaResonse));
    }

    @GetMapping(value = "/{propostaId}")
    public ResponseEntity<PropostaDTO> getProposta(@PathVariable("propostaId") Long idProposta) {
        PropostaEntity proposta = propostaService.getProposta(idProposta);
        return ResponseEntity.ok(propostaEntityToDTOConverter.convert(proposta));
    }

    @PostMapping(value = "/submissao")
    public ResponseEntity<SubmissaoPropostaResponseDTO> submeterProposta(@Valid @RequestBody final SubmissaoPropostaRequestDTO submissaoDTO) {
        SubmissaoPropostaRequest submissaoPropostaRequest = submissaoPropostaRequestDTOToEntityConverter.convert(submissaoDTO);
        SubmissaoPropostaResponse submissaoPropostaResponse = propostaService.submeterProposta(submissaoPropostaRequest);
        return ResponseEntity.ok(submissaoPropostaResponseDTOToEntityConverter.convert(submissaoPropostaResponse));
    }

}
