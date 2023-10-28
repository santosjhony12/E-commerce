## Database E-commerce - MySQL

<h3>Descrição: Este banco de dados contém informações sobre Categoria, Produto, Pedido, Cliente, Telefone.</h3>

<h2>Data Model</h2>

![image](https://github.com/santosjhony12/E-commerce/assets/123211025/b074c33a-f563-40ca-b045-939c6e122629)

<h2>Map</h2>

<p>
  
> tbCategoria (id_categoria: int, categoria: varchar(25))

> tbProduto (id_produto: int, nome: varchar(50), descricao: varchar(255), foto: varchar(255), id_categoria: int)<br>
id_categoria referencia tbCategoria

> tbProductoPedido (id_produto: int, id_pedido, quantidade: int)<br>
id_produto referencia tbProduto <br>
id_categoria referencia tbPedido

> tbPedido (id_pedido: int, data_hora: Date, id_cliente: int)<br>
id_cliente referencia tbCliente

> tbCliente (id_cliente: int, nome: varchar(255))

> tbTelefone (id_cliente: int, numero: int)<br>
id_cliente referencia tbCliente

</p>
