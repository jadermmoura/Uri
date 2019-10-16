package main;

/**

/**
 *
 * @author daione
// */
//@RestController
//@RequestMapping(path = "/api")
//public class RequisicoesControle {
//
//    @Autowired
//    RequisicaoDAO rDao;
//
//    @Autowired
//    RequisicaoCertificacaoDAO requisicaoCertificacaoDAO;
//
//    @Autowired
//    RequisicaoAproveitamentoDAO requisicaoAproveitamentoDAO;
//
//    @GetMapping(path = "/requisicoes/")
//    @ResponseStatus(HttpStatus.OK)
//    public ArrayList<Requisicao> listarRequisicao() {
//        ArrayList<Requisicao> requisicoes = new ArrayList<>();
//        Iterable<RequisicaoAproveitamento> apro = requisicaoAproveitamentoDAO.findAll();
//        Iterable<RequisicaoCertificacao> cert = requisicaoCertificacaoDAO.findAll();
//        apro.forEach((aproveitamento) -> {
//            requisicoes.add(aproveitamento);
//        });
//        cert.forEach((certificacao) -> {
//            requisicoes.add(certificacao);
//        });
//        requisicoes.sort(Comparator.comparing(Requisicao::getId));
//        return requisicoes;
//    }
//
//    @PostMapping(path = "/requisicoes/")
//    @ResponseStatus(HttpStatus.CREATED)
//    public Requisicao insere(@RequestBody Requisicao c) {
//        return rDao.save(c);
//
//    }
//
//    @GetMapping("/requisicoes/certificacao/")
//    @ResponseStatus(HttpStatus.OK)
//    public Iterable<RequisicaoCertificacao> listarCertificacao() {
//        return requisicaoCertificacaoDAO.findAll();
//    }
//
//    @GetMapping("/requisicoes/aproveitamento/")
//    @ResponseStatus(HttpStatus.OK)
//    public Iterable<RequisicaoAproveitamento> listarAproveitamento() {
//        return requisicaoAproveitamentoDAO.findAll();
//    }
//
//    @GetMapping("/requisicoes/aproveitamento/{id}/")
//    @ResponseStatus(HttpStatus.OK)
//    public Iterable<RequisicaoAproveitamento> listarAproveitamentoID(@PathVariable long id) {
//        return requisicaoAproveitamentoDAO.findById(id);
//    }
//    @GetMapping("/requisicoes/certificacao/{id}/")
//    @ResponseStatus(HttpStatus.OK)
//    public Iterable<RequisicaoCertificacao> listarCertificacaoID(@PathVariable long id) {
//        return requisicaoCertificacaoDAO.findById(id);
//    }
//        
//
//}
//
// * @author jader
// */
public class NewClass {
    
}
