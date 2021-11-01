package com.company;

import javax.swing.*;
import java.util.Scanner;
import java.util.regex.*;



public class Utils {

    public static int lerinteiro(String metodo){
         int INTEIRO = 0;
        if(metodo == "scanner") {
            System.out.printf("Informe o inteiro \n");
            Scanner ler = new Scanner(System.in);
            INTEIRO = ler.nextInt();

        }else if(metodo == "joptionpane"){
            INTEIRO = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o inteiro"));
        }
        System.out.printf(String.valueOf(INTEIRO));
        return INTEIRO;
    }
    public static float lerfloat(String metodo){
        float NUMERO = 0;
        if(metodo == "scanner") {
            System.out.printf("Informe o float \n");
            Scanner ler = new Scanner(System.in);
            NUMERO = ler.nextFloat();

        }else if(metodo == "joptionpane"){
            NUMERO = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o float"));
        }
        System.out.printf(String.valueOf(NUMERO));
        return NUMERO;
    }
    public static double lerdouble(String metodo){
        double NUMERO = 0;
        if(metodo == "scanner") {
            System.out.printf("Informe o Double \n");
            Scanner ler = new Scanner(System.in);
            NUMERO = ler.nextDouble();

        }else if(metodo == "joptionpane"){
            NUMERO = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o Double"));
        }
        System.out.printf(String.valueOf(NUMERO));
        return NUMERO;
    }
    public static String lerstring(String metodo){
        String leitura = null;
        if(metodo == "scanner") {
            System.out.printf("Informe a string \n");
            Scanner ler = new Scanner(System.in);
            leitura = ler.nextLine();

        }else if(metodo == "joptionpane"){
            leitura = JOptionPane.showInputDialog(null, "Informe a string");
        }
        System.out.printf(leitura);
        return leitura;
    }
    public static char lerchar(String metodo){
        char leitura = 0;
        if(metodo == "scanner") {
            System.out.printf("Informe o Char \n");
            Scanner ler = new Scanner(System.in);
            leitura = ler.next().charAt(0);

        }else if(metodo == "joptionpane"){
            leitura = JOptionPane.showInputDialog(null, "Informe a Char").charAt(0);
        }
        System.out.printf(String.valueOf(leitura));
        return leitura;
    }

    public static int lerinteiromensagem(String metodo, String mensagem){
        int INTEIRO = 0;
        if(metodo == "scanner") {
            System.out.printf(mensagem);
            Scanner ler = new Scanner(System.in);
            INTEIRO = ler.nextInt();

        }else if(metodo == "joptionpane"){
            INTEIRO = Integer.parseInt(JOptionPane.showInputDialog(null, mensagem));
        }
        System.out.printf(String.valueOf(INTEIRO));
        return INTEIRO;
    }
    public static float lerfloatmenssagem(String metodo, String mensagem){
        float NUMERO = 0;
        if(metodo == "scanner") {
            System.out.printf(mensagem);
            Scanner ler = new Scanner(System.in);
            NUMERO = ler.nextFloat();

        }else if(metodo == "joptionpane"){
            NUMERO = Float.parseFloat(JOptionPane.showInputDialog(null, mensagem));
        }
        System.out.printf(String.valueOf(NUMERO));
        return NUMERO;
    }
    public static double lerdoublemensagem(String metodo, String mensagem){
        double NUMERO = 0;
        if(metodo == "scanner") {
            System.out.printf(mensagem);
            Scanner ler = new Scanner(System.in);
            NUMERO = ler.nextDouble();

        }else if(metodo == "joptionpane"){
            NUMERO = Double.parseDouble(JOptionPane.showInputDialog(null, mensagem));
        }
        System.out.printf(String.valueOf(NUMERO));
        return NUMERO;
    }
    public static String lerstringmensagem(String metodo, String mensagem){
        String leitura = null;
        if(metodo == "scanner") {
            System.out.printf(mensagem);
            Scanner ler = new Scanner(System.in);
            leitura = ler.nextLine();

        }else if(metodo == "joptionpane"){
            leitura = JOptionPane.showInputDialog(null, mensagem);
        }
        System.out.printf(leitura);
        return leitura;
    }
    public static char lerchar(String metodo, String mensagem){
        char leitura = 0;
        if(metodo == "scanner") {
            System.out.printf(mensagem);
            Scanner ler = new Scanner(System.in);
            leitura = ler.next().charAt(0);

        }else if(metodo == "joptionpane"){
            leitura = JOptionPane.showInputDialog(null, mensagem).charAt(0);
        }
        System.out.printf(String.valueOf(leitura));
        return leitura;
    }
    public static String testaemail(){
        String testada = null;
        Scanner ler = new Scanner(System.in);
        System.out.println("digite o email \n");
        String email = ler.nextLine();

        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()){
            testada = email;
        }
        System.out.println(testada);
        return testada;
    }
    public static String testatelefone(){
        String testada = null;
        Scanner ler = new Scanner(System.in);
        System.out.println("digite o telefone \n");
        String telefone = ler.nextLine();

        String regex = "^[0-9]{3}\\-[9]{0,1}[6-9]{1}[0-9]{7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(telefone);
        if (matcher.matches()){
            testada = telefone;
        }
        System.out.println(testada);
        return testada;
    }
    public static String testadata(){
        String testada = null;
        Scanner ler = new Scanner(System.in);
        System.out.println("digite o a data \n");
        String data = ler.nextLine();

        String regex = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);
        if (matcher.matches()){
            testada = data;
        }
        System.out.println(testada);
        return testada;
    }
    public static boolean testanumero(String digito){
        try {
            Integer.parseInt(digito);
            return true;
        } catch (NumberFormatException e) {
          return false;
        }
    }
}
