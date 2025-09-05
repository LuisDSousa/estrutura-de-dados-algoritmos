PRAGMA foreign_keys = ON;
CREATE TABLE participante (
id INTEGER PRIMARY KEY  AUTOINCREMENT,
nome TEXT NOT NULL,
email TEXT NOT NULL UNIQUE,
telefone TEXT
);

CREATE TABLE evento (
id INTEGER PRIMARY KEY AUTOINCREMENT,
nome TEXT NOT NULL,
descricao TEXT,
local TEXT NOT NULL,
data TEXT NOT NULL
);

CREATE TABLE pagamento(
id INTEGER PRIMARY KEY AUTOINCREMENT,
id_inscricao INTEGER NOT NULL UNIQUE,
valor REAL,
data_pagamento TEXT,
status TEXT,
FOREIGN KEY (id_inscricao) REFERENCES inscricao(id)
);

CREATE TABLE inscricao (
id INTEGER PRIMARY KEY AUTOINCREMENT,
id_evento INTEGER NOT NULL,
id_participante INTEGER NOT NULL,
data_inscricao TEXT,
status TEXT,
FOREIGN KEY (id_evento) REFERENCES evento(id),
FOREIGN KEY (id_participante) REFERENCES participante(id)
);

INSERT INTO participante (nome,email,telefone) VALUES
('Luis','luis510felipe@gmail.com','(34)99999-9999'),
('Carlos','luis610felipe@gmail.com','(34)99999-9999'),
('Fernanda','luis710felipe@gmail.com','(34)99999-9999');

INSERT INTO evento (nome,descricao,local,data) VALUES
('Aula','Banco de dado','Unipam','05/09/2025'),
('Show','Jorge e Mateus','Centro de Convencao','09/11/2025');

INSERT INTO pagamento (id_inscricao,valor,data_pagamento,status) VALUES
(1,20,'04/09/2025','Pago'),
(2,120,'05/11/2025','Pendente'),
(3,20,'03/09/2025','Pendente'),
(4,120,'01/09/2025','Pago');

INSERT INTO inscricao (id_evento,id_participante,data_inscricao,status) VALUES
(1,1,'10/08/2025','Confirmada'),
(2,2,'01/10/2025','Cancelada'),
(2,3,'03/10/2025','Confirmada'),
(1,3,'15/08/2025','Cancelada');