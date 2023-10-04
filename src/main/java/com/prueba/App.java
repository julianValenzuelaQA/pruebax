package com.prueba;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class App {

    private void invertString1(String text){

        String[] array = text.split("");
        StringBuilder newText = new StringBuilder();

        for (int i = array.length; i > 0; i--){
            newText.append(array[i - 1]);
        }
        System.out.println(newText);
    }

    private void invertString2(String text){

        String newString = new StringBuilder(text).reverse().toString();
        System.out.println(newString);
    }

    private void capicua(int num){

        String numText = String.valueOf(num);
        String reverseNum = new StringBuilder(numText).reverse().toString();

        if(numText.equals(reverseNum)){
            System.out.println("capicua");
        } else {
            System.out.println("no capicua");
        }
    }

    private void multipleOf2(int num){

        if(num % 2 == 0){
            System.out.println("es multiplo");
        }else{
            System.out.println("no es multiplo");
        }
    }

    private void anoBiciesto(int ano){

        boolean biciesto = LocalDate.of(ano, 1, 1).isLeapYear();
        System.out.println(biciesto);
    }

    private void desorden(String text){

        String[] array = text.split("");
        List<String> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.forEach(System.out::println);
    }

    private void triuangulo(int filas){

        int i,j;

        for (i=0; i<= filas; i++){
            System.out.print(i + ": ");
            for (j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private void triuanguloDer(int filas){

        int i,j,k;

        for (i=0; i<= filas; i++){
            System.out.print(i + ": ");

            for (k=0; k<= filas-i; k++){
                System.out.print(" ");
            }

            for (j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        App app = new App();
        app.invertString1("un texto cualquiera");
        app.invertString2("un texto cualquiera");
        app.capicua(121);
        app.multipleOf2(11);
        app.anoBiciesto(2016);
        app.desorden("abcdefghi");
        app.triuangulo(5);
        app.triuanguloDer(5);
    }
}
