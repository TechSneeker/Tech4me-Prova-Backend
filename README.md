<h1>Tech4music</h1>

<h2>Sobre</h2>
<p>Primeira avaliação do modulo fundamentos de desenvolvimento backend</p>

<h2>1) Descreva o comando para criação do banco(utilizado no Mongosh ou Compass), que deverá ser chamado de tech4music</h2>
<p>Resposta: Utilize o comando<code>use tech4music</code>no Mongosh para criação do banco.</p>

<h2>2) Descreva o comando para criar a coleção musicas inserindo três na mesma</h2>
<p>Resposta: Primeiro defina o banco que pretende criar as coleções</p>
<ol> 
<li>Utilize o seguinte comando: <code>use tech4music</code></li>
<li>Logo após ter definido, utilize o comando para criação de coleções:
<code>db.musicas.insert([{<br>
    "titulo": "Forever",<br>
    "artista": "Kiss",<br>
    "album": "Hot in the Shade",<br>
    "genero": "Rock",<br>
    "anoLancamento": "1989",<br>
    "compositor": "Paul Stanley",{ <br>
    "titulo": "Algo parecido",<br>
    "artista": "Skank",<br>
    "album": "Os três primeiros",<br>
    "genero": "Pop",<br>
    "anoLancamento": "2018",<br>
    "compositor": "Samuel Rosa",{ <br>
    "id": "622a053a9227540189c1bc9b",
    "titulo": "O que me importa",<br>
    "artista": "Marisa Monte",<br>
    "album": "Memórias, crônicas e declarações de amor",<br>
    "genero": "MPB",<br>
    "anoLancamento": 2000,<br>
    "compositor": "Jose de Ribamar Cury"<br>
    }}]})</code></li></ol>


