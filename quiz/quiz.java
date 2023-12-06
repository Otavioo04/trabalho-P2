    package quiz;

    import java.util.Scanner;

    public class quiz {
        public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);


            cabecalho cabecalho1 = new cabecalho();
            System.out.println("===========================================================================================");
            cabecalho1.facudade = "FACUDADE: UNIFAN";
            cabecalho1.nome = "NOME: Otávio Henrique Alves";

            cabecalho1.professor = "PROFESSOR: Brenno Pimenta";

            cabecalho1.materia = "MATERIA: Algoritmos e programação II";

            cabecalho1.escrevaCabecalho();
            System.out.println("===========================================================================================");

            int acertos = 0;


            questoes questoes1 = new questoes();

            questoes1.pergunta = "Qual o menor e o maior país do mundo??";
            questoes1.opcaoA = "A-)Mônaco e Canadá";
            questoes1.opcaoB = "B-)Malta e Estados Unidos";
            questoes1.opcaoC = "C-)Vaticano e Rússia";
            questoes1.opcaoD = "D-)São Marino e Índia";
            questoes1.opcaoE = "E-)Nauru e China";
            questoes1.escrevaQuestoes();
            questoes1.correta = "c";
            System.out.println("digite a resposta correta");
            String resposta = leia.nextLine();
            if (resposta.equals(questoes1.iscorreta(resposta))) {
            } else {
            }
            if (resposta.equals(questoes1.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos :" + acertos);
            } else {
                System.out.println("acertos :" + acertos);

            }
            System.out.println("========================================================================================");

            questoes questoes2 = new questoes();

            questoes2.pergunta = "2-) Quem foi a primeira pessoa a viajar no Espaço?";
            questoes2.opcaoA = "A-)Yuri Gagarin ";
            questoes2.opcaoB = "B-)A cadela Laika";
            questoes2.opcaoC = "C-)Steven Spielberg";
            questoes2.opcaoD = "D-) Marcos Pontes";
            questoes2.opcaoE = "E-)Buzz Aldrin" ;
            questoes2.escrevaQuestoes();
            questoes2.correta = "a";
            System.out.println("digite a resposta correta");
            String resposta2 = leia.nextLine();
            if (resposta.equals(questoes2.iscorreta(resposta2))) {
            } else {

            }
            if (resposta2.equals(questoes2.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos :" + acertos);
            } else {
                System.out.println("acertos :" + acertos);

            }



            System.out.println("========================================================================================");

            questoes questoes3 = new questoes();

            questoes3.pergunta = "3-)Qual a montanha mais alta do mundo";
            questoes3.opcaoA = "A-)Mauna Kea";
            questoes3.opcaoB = "B-)Dhaulagiri";
            questoes3.opcaoC = "C-)Monte Chimborazo";
            questoes3.opcaoD = "D-)Monte Everest";
            questoes3.opcaoE = "E-)Pico da Neblina";
            questoes3.escrevaQuestoes();
            questoes3.correta = "d";
            System.out.println("digite a resposta correta");
            String resposta3 = leia.nextLine();
            if (resposta.equals(questoes3.iscorreta(resposta3))) {
            } else {

            }
            if (resposta3.equals(questoes3.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos :" + acertos);
            } else {
                System.out.println("acertos :" + acertos);

            }

            System.out.println("========================================================================================");

            questoes questoes4 = new questoes();

            questoes4.pergunta = "4-)Onde se localiza Machu Picchu??";
            questoes4.opcaoA = "A-) Colômbia";
            questoes4.opcaoB = "B-)Peru";
            questoes4.opcaoC = "C-)China";
            questoes4.opcaoD = "D-)Bolívia";
            questoes4.opcaoE = "E)Índia";
            questoes4.escrevaQuestoes();
            questoes4.correta = "b";
            System.out.println("digite a resposta correta");
            String resposta4 = leia.nextLine();
            if (resposta.equals(questoes4.iscorreta(resposta4))) {
            } else {

            }
            if (resposta4.equals(questoes4.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos :" + acertos);
            } else {
                System.out.println("acertos :" + acertos);

            }
            System.out.println("========================================================================================");

            questoes questoes5 = new questoes();

            questoes5.pergunta = "5-)Que país tem o formato de uma bota??";
            questoes5.opcaoA = "A-)Butão";
            questoes5.opcaoB = "B-)Brasil";
            questoes5.opcaoC = "C-)França";
            questoes5.opcaoD = "D-)Inlgaterra";
            questoes5.opcaoE = "E-)Itália";
            questoes5.escrevaQuestoes();
            questoes5.correta = "d";
            System.out.println("digite a resposta correta");
            String resposta5 = leia.nextLine();
            if (resposta.equals(questoes5.iscorreta(resposta5))) {
            } else {

            }
            if (resposta5.equals(questoes5.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos :" + acertos);
            } else {
                System.out.println("acertos :" + acertos);

            }
            System.out.println("========================================================================================");

            questoes questoes6 = new questoes();

            questoes6.pergunta = "6-)Quem inventou a lâmpada??";
            questoes6.opcaoA = "A-)Graham Bell";
            questoes6.opcaoB = "B-)Steve Jobs";
            questoes6.opcaoC = "C-)Thomas Edison";
            questoes6.opcaoD = "D-)Liam Neeson";
            questoes6.opcaoE = "E-)Chris Hemsworth";
            questoes6.escrevaQuestoes();
            questoes6.correta = "c";
            System.out.println("digite a resposta correta");
            String resposta6 = leia.nextLine();
            if (resposta.equals(questoes6.iscorreta(resposta6))) {
            } else {

            }
            if (resposta6.equals(questoes6.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos :" + acertos);
            } else {
                System.out.println("acertos :" + acertos);

            }
            System.out.println("========================================================================================");

            questoes questoes7 = new questoes();

            questoes7.pergunta = "7-)Quanto tempo a Terra demora para dar uma volta completa em torno dela mesma??";
            questoes7.opcaoA = "A-)Aproximadamente 24 horas";
            questoes7.opcaoB = "B-)365 dias";
            questoes7.opcaoC = "C-)7 dias";
            questoes7.opcaoD = "D-)365 ou 366 dias";
            questoes7.opcaoE = "E-)30 ou 31 dias";
            questoes7.escrevaQuestoes();
            questoes7.correta = "a";
            System.out.println("digite a resposta correta");
            String resposta7 = leia.nextLine();
            if (resposta.equals(questoes7.iscorreta(resposta7))) {
            } else {

            }
            if (resposta7.equals(questoes7.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos :" + acertos);
            } else {
                System.out.println("acertos :" + acertos);

            }
            System.out.println("========================================================================================");

            questoes questoes8 = new questoes();

            questoes8.pergunta = "8-A que temperatura a água ferve?? ";
            questoes8.opcaoA = "A-)200 ºC";
            questoes8.opcaoB = "B-)-10 ºC";
            questoes8.opcaoC = "C-)180 ºC";
            questoes8.opcaoD = "D-)0 ºC";
            questoes8.opcaoE = "E-)100 ºC";
            questoes8.escrevaQuestoes();
            questoes8.correta = "e";
            System.out.println("digite a resposta correta");
            String resposta8 = leia.nextLine();
            if (resposta.equals(questoes8.iscorreta(resposta8))) {
            } else {

            }
            if (resposta8.equals(questoes8.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos :" + acertos);
            } else {
                System.out.println("acertos :" + acertos);

            }
            System.out.println("========================================================================================");

            questoes questoes9 = new questoes();

            questoes9.pergunta = "9-Quais são as fases da Lua?? ";
            questoes9.opcaoA = "A-)Nova, cheia e superlua";
            questoes9.opcaoB = "B-)Penumbral, lunar parcial, lunar total e cheia";
            questoes9.opcaoC = "C-)Nova, cheia, minguante e lua de sangue";
            questoes9.opcaoD = "D-)Nova, crescente, cheia e minguante";
            questoes9.opcaoE = "E-)Nova, crescente, cheia, minguante e lua de sangue";
            questoes9.escrevaQuestoes();
            questoes9.correta = "d";
            System.out.println("digite a resposta correta");
            String resposta9 = leia.nextLine();
            if (resposta.equals(questoes9.iscorreta(resposta9))) {
            } else {

            }
            if (resposta9.equals(questoes9.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos :" + acertos);
            } else {
                System.out.println("acertos :" + acertos);

            }
            System.out.println("========================================================================================");

            questoes questoes10 = new questoes();

            questoes10.pergunta = "10-)Quantos ossos temos no nosso corpo?";
            questoes10.opcaoA = "A-)126";
            questoes10.opcaoB = "B-)206";
            questoes10.opcaoC = "C-)18";
            questoes10.opcaoD = "D-)300";
            questoes10.opcaoE = "E-)200";
            questoes10.escrevaQuestoes();
            questoes10.correta = "b";
            System.out.println("digite a resposta correta");
            String resposta10 = leia.nextLine();
            if (resposta.equals(questoes10.iscorreta(resposta10))) {
            } else {

            }
            if (resposta10.equals(questoes10.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos :" + acertos);
            } else {
                System.out.println("acertos :" + acertos);

            }
            System.out.println("========================================================================================");

            questoes questoes11 = new questoes();

            questoes11.pergunta = "11-)Qual o maior planeta do sistema solar??";
            questoes11.opcaoA = "A-)Saturno";
            questoes11.opcaoB = "B-)Neturno";
            questoes11.opcaoC = "C-)Terra";
            questoes11.opcaoD = "D-)Júpiter";
            questoes11.opcaoE = "E-)Marte";
            questoes11.escrevaQuestoes();
            questoes11.correta = "d";
            System.out.println("digite a resposta correta");
            String resposta11 = leia.nextLine();
            if (resposta.equals(questoes11.iscorreta(resposta11))) {
            } else {

            }
            if (resposta11.equals(questoes11.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos :" + acertos);
            } else {
                System.out.println("acertos :" + acertos);

            }
            System.out.println("========================================================================================");

            questoes questoes12 = new questoes();

            questoes12.pergunta = "12-Um anel tem 3 pedras preciosas. Quantas pedras preciosas têm 11 anéis?";
            questoes12.opcaoA = "A-)33";
            questoes12.opcaoB = "B-)110";
            questoes12.opcaoC = "C-)333";
            questoes12.opcaoD = "D-)30";
            questoes12.opcaoE = "E-)14";
            questoes12.escrevaQuestoes();
            questoes12.correta = "a";
            System.out.println("digite a resposta correta");
            String resposta12 = leia.nextLine();
            if (resposta.equals(questoes12.iscorreta(resposta12))) {
            } else {

            }
            if (resposta12.equals(questoes12.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos :" + acertos);
            } else {
                System.out.println("acertos :" + acertos);

            }
            System.out.println("========================================================================================");

            questoes questoes13 = new questoes();

            questoes13.pergunta = "13-)Qual o planeta mais próximo do Sol?";
            questoes13.opcaoA = "A-)Netuno";
            questoes13.opcaoB = "B-)Júpiter";
            questoes13.opcaoC = "C-)Mercúrio";
            questoes13.opcaoD = "D-)Terra";
            questoes13.opcaoE = "E-)Marte";
            questoes13.escrevaQuestoes();
            questoes13.correta = "c";
            System.out.println("digite a resposta correta");
            String resposta13 = leia.nextLine();
            if (resposta.equals(questoes13.iscorreta(resposta13))) {
            } else {

            }
            if (resposta13.equals(questoes13.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos :" + acertos);
            } else {
                System.out.println("acertos :" + acertos);

            }
            System.out.println("========================================================================================");

            questoes questoes14 = new questoes();

            questoes14.pergunta = "14-)Quantos continentes existem??";
            questoes14.opcaoA = "A-)2";
            questoes14.opcaoB = "B-)8";
            questoes14.opcaoC = "C-)4";
            questoes14.opcaoD = "D-)6";
            questoes14.opcaoE = "E-)3";
        questoes14.escrevaQuestoes();
        questoes14.correta = "d";
        System.out.println("digite a resposta correta");
        String resposta14 = leia.nextLine();
        if (resposta.equals(questoes14.iscorreta(resposta14))) {
        } else {

        }
        if (resposta14.equals(questoes14.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos :" + acertos);
        } else {
            System.out.println("acertos :" + acertos);

        }
        System.out.println("========================================================================================");

        questoes questoes15 = new questoes();

        questoes15.pergunta = "15-)Quais as duas línguas mais faladas no mundo??";
        questoes15.opcaoA = "A-)Inglês e espanhol";
        questoes15.opcaoB = "B-)Inglês e mandarim chinês";
        questoes15.opcaoC = "C-)Mandarim chinês e francês";
        questoes15.opcaoD = "D-)Inglês e português";
        questoes15.opcaoE = "E-)Inglês e espanhol";
        questoes15.escrevaQuestoes();
        questoes15.correta = "a";
        System.out.println("digite a resposta correta");
        String resposta15 = leia.nextLine();
        if (resposta.equals(questoes15.iscorreta(resposta15))) {
        } else {

        }
        if (resposta15.equals(questoes15.correta)) {
            acertos = acertos + 1;
            System.out.println("acertos :" + acertos);
        } else {
            System.out.println("acertos :" + acertos);

        }
        System.out.println("========================================================================================");

        System.out.println("você acertou " + acertos + " de 15 perguntas");
        if (acertos <= 5) {
            System.out.println("TENTE NOVAMENTE!!!! VOCÊ FOI MAL DEMAIS ");
        }
        if (acertos < 10 & acertos > 5) {
            System.out.println("VOCÊ FOI REGULAR");
        }
        if (acertos > 10 & acertos <= 14) {
            System.out.println("PAREBENS VOCÊ FOI MUITO BEM");
        }
        if (acertos > 14) {
            System.out.println("PAREBENS VOCÊ FOI  EXCELENTE");

        }


    }
}
