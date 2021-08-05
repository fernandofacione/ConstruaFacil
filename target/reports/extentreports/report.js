$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("comprarCursoPO.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 2,
  "name": "Comprar Curso PO",
  "description": "",
  "id": "comprar-curso-po",
  "keyword": "Funcionalidade"
});
formatter.before({
  "duration": 101800,
  "status": "passed"
});
formatter.before({
  "duration": 2216124300,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Pesquisar Curso com Clique e Incluir no Carrinho PO",
  "description": "",
  "id": "comprar-curso-po;pesquisar-curso-com-clique-e-incluir-no-carrinho-po",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 4,
  "name": "que acesso o site da Iterasys  PO",
  "keyword": "Dado "
});
formatter.step({
  "line": 5,
  "name": "pesquiso por \"Mantis\" PO",
  "keyword": "Quando "
});
formatter.step({
  "line": 6,
  "name": "clico na Lupa PO",
  "keyword": "E "
});
formatter.step({
  "line": 7,
  "name": "vejo a lista de resultados para o curso \"Mantis\" PO",
  "keyword": "Entao "
});
formatter.step({
  "line": 8,
  "name": "clico em Matricule-se PO",
  "keyword": "Quando "
});
formatter.step({
  "line": 9,
  "name": "confirmo o nome do curso como \"Mantis\" e o preco de \"R$ 49,99\" PO",
  "keyword": "Entao "
});
formatter.match({
  "location": "comprarCursoPO.queAcessoOSiteDaIterasysPO()"
});
formatter.result({
  "duration": 3710075600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mantis",
      "offset": 14
    }
  ],
  "location": "comprarCursoPO.pesquisoPorPO(String)"
});
formatter.result({
  "duration": 197749500,
  "status": "passed"
});
formatter.match({
  "location": "comprarCursoPO.clicoNaLupaPO()"
});
formatter.result({
  "duration": 2056832300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mantis",
      "offset": 41
    }
  ],
  "location": "comprarCursoPO.vejoAListaDeResultadosParaOCursoPO(String)"
});
formatter.result({
  "duration": 58381100,
  "status": "passed"
});
formatter.match({
  "location": "comprarCursoPO.clicoEmMatriculeSePO()"
});
formatter.result({
  "duration": 2244342700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mantis",
      "offset": 31
    },
    {
      "val": "R$ 49,99",
      "offset": 53
    }
  ],
  "location": "comprarCursoPO.confirmoONomeDoCursoComoEOPrecoDePO(String,String)"
});
formatter.result({
  "duration": 127500,
  "status": "passed"
});
formatter.after({
  "duration": 59600,
  "status": "passed"
});
formatter.after({
  "duration": 646337200,
  "status": "passed"
});
});