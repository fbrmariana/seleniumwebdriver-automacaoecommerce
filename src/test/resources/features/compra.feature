# language: pt

@compra
Funcionalidade: Realizar compra
  Eu um cliente cadastrado no site automationpractice.com
  quero realizar uma compra de 3 produtos
  Para que eu possa estar bem vestida

  @compra-sucesso
  Cenario: Compra de produto
    Dado que eu estou logada no site automationpractice.com
    E pesquiso por um produto
    Quando eu selecionar o produto pesquisado e adicona-lo ao carrinho
    Então vejo o produto no carrinho para finalizar a minha compra
