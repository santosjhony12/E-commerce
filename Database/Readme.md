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

<h2>SQL</h2>

```
CREATE SCHEMA e_commerce;
USE e_commerce;

CREATE TABLE categoria (
    id_categoria BIGINT PRIMARY KEY AUTO_INCREMENT, 
    categoria VARCHAR(50) NOT NULL UNIQUE KEY
);

CREATE TABLE produto(
    id_produto BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL UNIQUE KEY, 
    descricao VARCHAR(255), 
    foto VARCHAR(255), 
    id_categoria BIGINT,
    CONSTRAINT
    FOREIGN KEY (id_categoria) REFERENCES categoria (id_categoria)
);

CREATE TABLE cliente(
    id_cliente BIGINT PRIMARY KEY AUTO_INCREMENT,
    cpf VARCHAR(11) NOT NULL UNIQUE KEY, 
    nome VARCHAR(100) NOT NULL
);

CREATE TABLE telefone(
    id_cliente BIGINT, 
    numero INT, 
    CONSTRAINT 
    PRIMARY KEY pk_telefone (id_cliente, numero),
    FOREIGN KEY fk_id_cliente (id_cliente) REFERENCES cliente (id_cliente)
);

CREATE TABLE pedido(
    id_pedido BIGINT PRIMARY KEY, 
    data_hora DATETIME NOT NULL, 
    id_cliente BIGINT NOT NULL, 
    CONSTRAINT 
    FOREIGN KEY fk_cliente (id_cliente) REFERENCES cliente (id_cliente)
);

CREATE TABLE pedido_produto(
    id_produto BIGINT, 
    id_pedido BIGINT,
    CONSTRAINT 
    PRIMARY KEY pk_pedido_produto (id_produto, id_pedido),
    CONSTRAINT 
    FOREIGN KEY fk_produto (id_produto) REFERENCES produto (id_produto),
    CONSTRAINT 
    FOREIGN KEY fk_pedido (id_pedido) REFERENCES pedido (id_pedido)
);
```
