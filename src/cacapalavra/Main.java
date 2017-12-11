package cacapalavra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Igor Brum
 */
public class Main {
    private static ArrayList<String> words = new ArrayList();
    private static int valueMaiorPalavra = 0;
    private static int indexNomeCruzamento1 = 0;
    private static int indexNomeCruzamento2 = 0;
    
    private static String nomeBase = "";
    private static String nomePalavra1;
    private static String nomePalavra2;
    private static String nomePalavra3;
    private static String nomePalavra4;
    private static int IndexnomePalavra3;
    private static int IndexnomePalavra4;
    private static String nomePalavra5;
    private static String nomePalavra6;
    private static int IndexnomePalavra5;
    private static int IndexnomePalavra6;
    private static String nomePalavra7;
    private static String nomePalavra8;
    private static int IndexnomePalavra7;
    private static int IndexnomePalavra8;
    private static int indexPala;
    private static int indexBase2;
    private static int indexPala7;
    private static int indexBase4Posicao;
    private static int indexPala5;
    private static int indexBase3Posicao;
    private static int indexPala3;
    private static int indexBase2Posicao;
    private static int indexPa2;
    private static int indexBaseChave;
    private static int indexBase;
    
    public static void main(String[] args) {
        readFile();
        valueMaiorPalavra = getValueMaiorPalavra(words);
        
        String nomesCruzamentoDuplo[] = getNomesCruzamentoDuplo(words, nomeBase.charAt(1), nomeBase.charAt(nomeBase.length()-2));
        SetPalavrasComArray(nomesCruzamentoDuplo);
        GetNomesCruzamentosCompletos(words, nomePalavra1, nomePalavra2, nomesCruzamentoDuplo );
        
        char teste[][] = new char[valueMaiorPalavra][30];
        indexPala =2;
        indexBase2 = (indexNomeCruzamento1 + 2)-1;
        boolean t = false;
        
        for (int i = 0; i < teste.length; i++) {
             System.out.printf("%d. linha: ", (i));
            for (int j = 0; j < 30; j++) {
                if (i ==0) {
                    teste[i][j] =GetLetrasAlinhatorias() ;
                    System.out.print(teste[i][j]);    
                }
                else{
                    if (i == 3 && j == 19) {
                        int p = 0;
                    }
              if (j == 21 && i == indexPala7 + 3 && i != IndexnomePalavra7 + 3 ) {
                         if (indexPala7 < nomePalavra7.length()) {
                            teste[i][j] = nomePalavra7.charAt(indexPala7);
                            indexPala7++;
                            System.out.print(teste[i][j]); 
                        }else{
                                teste[i][j] = GetLetrasAlinhatorias();
                                System.out.print(teste[i][j]); 
                                t = false;
                        }  
                    }else if(i == IndexnomePalavra7 + 3 && j == 20 + indexBase4Posicao && indexPala7 != 0) {
                            if (indexBase4Posicao < nomePalavra8.length()) {
                                teste[i][j] = nomePalavra8.charAt(indexBase4Posicao);
                                indexBase4Posicao++;
                                if (indexBase4Posicao ==  IndexnomePalavra7 + 1) {
                                    indexPala7++;
                                }
                                System.out.print(teste[i][j]); 
                            }else{
                                teste[i][j] = GetLetrasAlinhatorias();
                                System.out.print(teste[i][j]); 
                                t = false;
                            }  
                    }else if (j == 16 && i == indexPala5 + 4 && i != IndexnomePalavra5 + 4 ) {
                         if (indexPala5 < nomePalavra5.length()) {
                            teste[i][j] = nomePalavra5.charAt(indexPala5);
                            indexPala5++;
                            System.out.print(teste[i][j]); 
                        }else{
                                teste[i][j] = GetLetrasAlinhatorias();
                                System.out.print(teste[i][j]); 
                                t = false;
                        }  
                    }else if(i == IndexnomePalavra5 + 4 && j == 15 + indexBase3Posicao && indexPala5 != 0) {
                            if (indexBase3Posicao < nomePalavra6.length()) {
                                teste[i][j] = nomePalavra6.charAt(indexBase3Posicao);
                                indexBase3Posicao++;
                                if (indexBase3Posicao ==  IndexnomePalavra5 + 1) {
                                    indexPala5++;
                                }
                                System.out.print(teste[i][j]); 
                            }else{
                                teste[i][j] = GetLetrasAlinhatorias();
                                System.out.print(teste[i][j]); 
                                t = false;
                            }  
                    }else if (j == 12 && i == indexPala3 + 1 &&  i != IndexnomePalavra3 +1) {
                         if (indexPala3 < nomePalavra3.length()) {
                            teste[i][j] = nomePalavra3.charAt(indexPala3);
                            indexPala3++;
                            System.out.print(teste[i][j]); 
                        }else{
                                teste[i][j] = GetLetrasAlinhatorias();
                                System.out.print(teste[i][j]); 
                                t = false;
                         }    
                        
                    }else if (i == IndexnomePalavra3 + 1 && j == 11 + indexBase2Posicao) {
                            if (indexBase2Posicao < nomePalavra4.length()) {
                                teste[i][j] = nomePalavra4.charAt(indexBase2Posicao);
                                indexBase2Posicao++;
                                if (indexBase2Posicao ==  IndexnomePalavra3 + 1) {
                                    indexPala3++;
                                }
                                System.out.print(teste[i][j]); 
                            }else{
                                teste[i][j] = GetLetrasAlinhatorias();
                                System.out.print(teste[i][j]); 
                                t = false;
                            }  
                    }else if(j == nomeBase.length() -1 && indexNomeCruzamento2 == 1 && i == indexBase2 ){
                        if (indexPa2 < nomePalavra2.length()) {
                            teste[i][j] = nomePalavra2.charAt(indexPa2);
                            indexPa2++;
                            indexBase2++;
                            System.out.print(teste[i][j]); 
                        }
                    }else if (j == nomeBase.length() -1 && indexNomeCruzamento2 == 2 && i == indexBase2-1) {
                        if (indexPa2 < nomePalavra2.length()) {
                            teste[i][j] = nomePalavra2.charAt(indexPa2);
                            if (indexPa2 == indexNomeCruzamento2) {
                                indexBaseChave ++;
                            }
                            indexPa2++;
                            indexBase2++;
                            System.out.print(teste[i][j]);
                            t = true;
                        }
                    }else if (i == indexNomeCruzamento1 +2) {
                        if (j > 0 && indexBaseChave < nomeBase.length()) {
                            teste[i][j] = nomeBase.charAt(indexBaseChave);
                            indexBaseChave++;
                             if (indexBaseChave == 1) {
                                indexPala++;
                                indexBase++;
                            }
                                System.out.print(teste[i][j]);  
                        }else{
                            teste[i][j] = GetLetrasAlinhatorias();
                            System.out.print(teste[i][j]); 
                            t = false;
                        }
                    }else if (j == 2 && i == indexPala && indexBase < nomePalavra1.length()) {
                        teste[i][j] = nomePalavra1.charAt(indexBase);
                        indexPala++;
                        indexBase++;
                        System.out.print(teste[i][j]);  
                    }else {
                        teste[i][j] = GetLetrasAlinhatorias();
                        System.out.print(teste[i][j]);
                        t = false;
                    }
                }
            }
          System.out.printf("\n");
        }
    }
    
    private static char GetLetrasAlinhatorias() {
       String alphabet = "ABCDEFGHIJLMNOPQRSTUVXZ";
       int N = alphabet.length();
       Random rd = new Random();
       
       return  alphabet.charAt(rd.nextInt(N));
    }

    private static void readFile() {
        String pathToFile = "files/wordslist.txt";
        
        try {
            Scanner fileToRead = new Scanner(new FileInputStream(pathToFile));
            while (fileToRead.hasNext()) {
                String next = fileToRead.next();
                words.add(next);
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Arquivo nao encontrado");
        }
    }

    private static int getValueMaiorPalavra(ArrayList<String> words) {
        String palavra = "";
        int valueBase = 0;
        int value = 0;
        ListIterator<String> itWord = words.listIterator();
        
        while (itWord.hasNext()) {
            palavra = itWord.next();
            value = palavra.length();
            if (value > valueBase) {
                valueBase = value;
                nomeBase = palavra;
            }
        }
        
        if (valueBase % 2 == 0) {
            return valueBase+2;
        }
        return valueBase+1;
    }

    private static String[] getNomesCruzamentoDuplo(ArrayList<String> words, char charAt, char charAt0) {
        String palavra = "";
        String a[] = new String[10];
        int i = 0;
        ListIterator<String> itWord = words.listIterator();
        
        while (itWord.hasNext()) {
            palavra = itWord.next();
            if (!palavra.equals(nomeBase)) {
                for (int j = 0; j < palavra.length(); j++) {
                    if (j != 0) {
                        if (palavra.charAt(j) == charAt) {
                            if (a[i] == null) {
                                a[i] = palavra;
                                i++;
                                indexNomeCruzamento1 = j;
                                break;
                            }
                        }
                        if (palavra.charAt(j) == charAt0) {
                            if (a[i] == null) {
                                a[i] = palavra;
                                i++;
                                indexNomeCruzamento2 = j;
                            }
                        }
                    }
                }
            }
            if (a[1] != null) {
                break;
            }
        }
        return a;
    }

    private static void SetPalavrasComArray(String[] NomesCruzamento) {
        if (NomesCruzamento[0] != null) {
            nomePalavra1 = NomesCruzamento[0];
        }
        
        if (NomesCruzamento[1]!=null) {
            nomePalavra2 = NomesCruzamento[1];
        }
    }

    private static void GetNomesCruzamentosCompletos(ArrayList<String> words, String nomePalavra1, String nomePalavra2, String[] nomesCruzamentoDuplo) {
        int index = 0;
        ListIterator<String> itWord = words.listIterator();
        
        while (itWord.hasNext()) {
            String nome = itWord.next();
            if (nomesCruzamentoDuplo[index]== null) {
                if (nome.equals(nomePalavra1) || nome.equals(nomePalavra2) || nome.equals(nomeBase))
                    index--;
                else
                    nomesCruzamentoDuplo[index] = nome;
            }
            index++;
        }
        String nome2p = "";
        for (int i = 0; i < nomesCruzamentoDuplo.length; i++) {
            if (!nomesCruzamentoDuplo[i].equals(nomePalavra1) && !nomesCruzamentoDuplo[i].equals(nomePalavra2)  && !nomesCruzamentoDuplo[i].equals(nomeBase)) {
                String nome = nomesCruzamentoDuplo[i];
                if (!nome.equals(nome2p)) {
                    for (int j = 0; j < nome.length(); j++) {
                        for (int k = 0; k < nomesCruzamentoDuplo[i + 1].length(); k++) {
                            String nome2 = nomesCruzamentoDuplo[i + 1];
                            nome2p="";
                            if (nome.charAt(j)== nome2.charAt(k)) {
                                 nome2p = nomesCruzamentoDuplo[i + 1];
                                System.out.println("contem");
                                salvaCruzamentosSimples(nome2p,nome,k,j );
                                break;
                            }
                        }
                        if (nome2p!= "") {
                            break;
                        }
                    }                    
                }
            }
        }
    }

    private static void salvaCruzamentosSimples(String nome2p, String nome, int k, int j) {
        if (nomePalavra3 ==null && nomePalavra4== null) {
            nomePalavra3 = nome;
            nomePalavra4 = nome2p;
            IndexnomePalavra3 = j;
            IndexnomePalavra4 = k;
        }else if(nomePalavra5 ==null && nomePalavra6== null){
            nomePalavra5 = nome;
            nomePalavra6 = nome2p;
            IndexnomePalavra5 = j;
            IndexnomePalavra6 = k;
        }else if(nomePalavra7 ==null && nomePalavra8== null){
            nomePalavra7 = nome;
            nomePalavra8 = nome2p;
            IndexnomePalavra7 = j;
            IndexnomePalavra8 = k;
        }
    }
}
