//package br.com.aluraAPI;
//
//import javax.imageio.ImageIO;
//import java.awt.*;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//import java.io.OutputStream;
//
//public class Stikers {
//
//        public void cria () throws IOException {
//
//// leitura da imagem
//
//            BufferedImage imagemOriginal = ImageIO.read(new File("entrada/filme.jpg"));
//
//
//// cria nova imagem em memoria com transparencia e com tamanho novo
//
//
//            int altura = imagemOriginal.getHeight();
//            int largura = imagemOriginal.getWidth();
//            int novaAltura = altura + 200;
//            BufferedImage  novaImagem = new BufferedImage (largura, novaAltura, BufferedImage.TRANSLUCENT);
//
//
//// copiar a imagem original para novo imagem ( em memoria)
//
//            Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
//            graphics.drawImage(imagemOriginal, 0, 0,null );
//
//
//// escrever uma frase na nova imagem
//
//
//// escrever a nova imagem em um arquivo
//
//            ImageIO.write(novaImagem,"png", new File("saida/figurinha.png");
//
//                    void criarPasta{
//                if ()
//            }
//
//        }
//}
