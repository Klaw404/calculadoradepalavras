package calculadoradepalavras;

public class Main {
    public static void main(String[] args){
        if(args.length == 0){
            return;
        }

        int quantidadedepalavras = args.length;
        int impares = 0;
        int pares = 0;

        int qtdA = 0;
        int qtdE = 0;
        int qtdI = 0;
        int qtdO = 0;
        int qtdU = 0;

        for(String palavra: args){
            if(palavra.length() % 2 == 0)
                pares++;
            else
                impares++;

            for(char letra: palavra.toLowerCase().toCharArray()){
                switch(letra){
                    case 'a':
                        qtdA++;
                        break;
                    case 'e':
                        qtdE++;
                        break;
                    case 'i':
                        qtdI++;
                        break;
                    case 'o':
                        qtdO++;
                        break;
                    case 'u':
                        qtdU++;
                        break;
                    default:
                        break;
                }
            }
        }

        System.out.println("Relatório:");
        System.out.println("- quantidade de palavras: "+quantidadedepalavras);
        System.out.println("- quantidade de pares: "+pares);
        System.out.println("- quantidade de impares: "+impares);
        System.out.println("- quantidade de a: "+qtdA);
        System.out.println("- quantidade de a: "+qtdE);
        System.out.println("- quantidade de a: "+qtdI);
        System.out.println("- quantidade de a: "+qtdO);
        System.out.println("- quantidade de a: "+qtdU);
    }
}
