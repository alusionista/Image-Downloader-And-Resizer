# Image Downloader

Este projeto em Kotlin/Java é um exemplo simples de como baixar imagens a partir de URLs e redimensioná-las de acordo com parâmetros pré-definidos.

## Funcionalidades

- Baixar imagens a partir de URLs fornecidas.
- Redimensionar imagens para largura e altura pré-definidas.
- Salvar as imagens redimensionadas no disco.

## Requisitos

- JDK 8 ou superior instalado.
- Kotlin/Java SDK configurado.

## Como usar

1. Clone o repositório:

   ```shell
   git clone https://github.com/seu-usuario/image-downloader.git
   ```

2. Acesse o diretório do projeto:

   ```shell
   cd image-downloader
   ```

3. Execute o código:

    - Kotlin

      ```shell
      kotlinc ImageDownloader.kt -include-runtime -d ImageDownloader.jar
      java -jar ImageDownloader.jar
      ```

    - Java

      ```shell
      javac ImageDownloader.java
      java ImageDownloader
      ```

Certifique-se de substituir `https://example.com/image.jpg` pelo URL da imagem desejada e `path/to/save/image.jpg` pelo caminho de destino onde a imagem deve ser salva no seu sistema.

Ao executar o código, a imagem será baixada, redimensionada e salva no local especificado.

Espero que isso ajude!