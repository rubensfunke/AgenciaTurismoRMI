Desenvolver um sistema cliente
-
servidor para uma ag�ncia de turismo. 
Requisitos da aplica��o:

�Utilizar a middleware Java RMI (Remote Invocation Method) para prover a comunica��o entre os clientes e o servidor
da ag�ncia de turismo

.M�todos dispon�veis no servidor (valor 2,0):
�Consulta e   compra de passagens   a�reas. Ser�o fornecidos os seguintes dados:
�somente ida� ou �ida e volta�, origem, destino, data da ida, data da volta e n�mero de pessoas (valor 0,4);

�Consulta e  compra de  hospedagem. Ser�o fornecidos os seguintes dados: destino (nome da cidade ou do hotel), data 
da entrada e data da sa�da, n�mero de quartos e n�mero de pessoas (valor 0,4);

�Consulta  e  compra  de  pacotes(passagem  a�rea  + hospedagem). Ser�o fornecidos os dados acima (valor 0,4).

�Registro de interesse em eventos: o processo servidor tem a tarefa de permitir  que cada cliente  registre interesse 
em um  ou  mais eventos (novos  voos,  novas  vagas  em  hot�is,  novos  pacotes). No momento do registro, o  cliente 
deve informar o(s) evento(s) desejado(s), o destino desejado, um  pre�o  m�ximo  que  ele  deseja  pagar e sua refer�ncia
de objeto remoto (valor 0,4).

�Remover registro de interesse (valor 0,1).

�Observa��o sobre  o  evento  pacote: se um  cliente  registrar  interesse em  pacote  para  um  destino  X  e  surgir  
apenas um voo, mas n�o uma hospedagem (ou vice-versa), o servidor n�o enviar� uma notifica��o ao cliente. A notifica��o 
ser� enviada apenas se um pacote completo for encontrado (pattern of events). Servidor mant�m registro de um evento e 
espera o pr�ximo ocorrer para enviar a notifica��o.
Implementar um mecanismo que controle o acesso concorrente aos m�todos do servidor (valor 0,3).

M�todo dispon�vel no cliente (valor 0,5):
�Notifica��o de evento: o processo servidor tem a tarefa de enviar, via chamada de m�todo, notifica��es ass�ncronas de
eventos aos clientes interessados.



�Observa��es:

�Desenvolva uma interface gr�fica com recursos de intera��o apropriados;
�Utilize a ferramenta JavaDoc para gerar a documenta��o completa de todas as classes e m�todos de sua aplica��o;
�Equipe: dois programadores.