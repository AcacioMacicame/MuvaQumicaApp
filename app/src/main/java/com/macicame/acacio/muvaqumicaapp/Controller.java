package com.macicame.acacio.muvaqumicaapp;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    // declare list of Question objects
    List<Question> list = new ArrayList<>();
    DataBaseHelper dataBaseHelper;

    // method returns number of questions in list
    public int getLength(){
        return list.size();
    }

    // method returns question from list based on list index
    public String getQuestion(int a) {
        return list.get(a).getQuestion();
    }

    public String getGrade(int a){
        return list.get(a).getGrade();
    }

    public String getLevel(int a){ return list.get(a).getLevel();}

    // method return a single multiple choice item for question based on list index,
    // based on number of multiple choice item in the list - 1, 2, 3 or 4
    // as an argument
    public String getChoice(int index, int num) {
        return list.get(index).getChoice(num-1);
    }

    //  method returns correct answer for the question based on list index
    public String getCorrectAnswer(int a) {
        return list.get(a).getAnswer();
    }


    public void grade10Questions(Context context) {
        dataBaseHelper = new DataBaseHelper(context);
        list = dataBaseHelper.getAllGrade10Level1QuestionsList();//get questions/choices/answers from database
    }

    public void grade10Level2Questions(Context context){
        dataBaseHelper = new DataBaseHelper(context);
        list = dataBaseHelper.getAllGrade10Level2QuestionsList();
    }

    public void grade10Level3Questions(Context context){
        dataBaseHelper = new DataBaseHelper(context);
        list = dataBaseHelper.getAllGrade10Level3QuestionsList();
    }

    public void grade11Questions(Context context) {
        dataBaseHelper = new DataBaseHelper(context);
        list = dataBaseHelper.getAllGrade11Level1QuestionsList();//get questions/choices/answers from database
    }

    public void grade11Level2Questions(Context context){
        dataBaseHelper = new DataBaseHelper(context);
        list = dataBaseHelper.getAllGrade11Level2QuestionsList();
    }

    public void grade11Level3Questions(Context context){
        dataBaseHelper = new DataBaseHelper(context);
        list = dataBaseHelper.getAllGrade11Level3QuestionsList();
    }

    public void grade12Questions(Context context) {
        dataBaseHelper = new DataBaseHelper(context);
        list = dataBaseHelper.getAllGrade12Level1QuestionsList();//get questions/choices/answers from database
    }

    public void grade12Level2Questions(Context context){
        dataBaseHelper = new DataBaseHelper(context);
        list = dataBaseHelper.getAllGrade12Level2QuestionsList();
    }

    public void grade12Level3Questions(Context context){
        dataBaseHelper = new DataBaseHelper(context);
        list = dataBaseHelper.getAllGrade12Level3QuestionsList();
    }

    public void initQuestions(Context context) {
        dataBaseHelper = new DataBaseHelper(context);
        list = dataBaseHelper.getAllQuestionsList();//get questions/choices/answers from database

        if (list.isEmpty()) {//if list is empty, populate database with default questions/choices/answers

            dataBaseHelper.addInitialQuestion(new Question("Os prefixos para 2, 4, e 6 átomos de carbono são respectivamente:","10","1",
                    new String[]{"Met, Ẽt, Pent", "Hex, But, Et", "Et, But, Hex", "But, Et, Hex"}, "Et, But, Hex"));
            dataBaseHelper.addInitialQuestion(new Question("O sufixo correcto da regra de nomenclatura dos alcanos é respectivamente:","10","1",
                    new String[]{"Ano", "Ino", "Cano", "Ceno"}, "Ano"));
            dataBaseHelper.addInitialQuestion(new Question("Os prefixos Pent, Hept, Oct e Dec correspondem aos seguintes números de carbono, respectivamente:","10","1",
                    new String[]{"5, 8, 7, 10", "8, 9, 10, 5", "5, 7, 8, 10", "7,5, 8, 10"}, "5, 7, 8, 10"));
            dataBaseHelper.addInitialQuestion(new Question("Os prefixos Met, Et, Prop, Non correspondem aos seguintes números de carbono, respectivamente:","10","1",
                    new String[]{"1, 2, 3, 9", "9, 1, 2, 3 ", "4, 3, 2, 5", "5, 6, 4, 1"}, "1, 2, 3, 9"));
            dataBaseHelper.addInitialQuestion(new Question("O nome do composto CH3-CH2- CH3 é o seguinte:","10","1",
                    new String[]{"Butano", "Metano", "Etano", "Propano"}, "Propano"));
            dataBaseHelper.addInitialQuestion(new Question("O nome do composto CH3-CH3 é o seguinte:","10","1",
                    new String[]{"Propano", "Etano", "Metano", "Heptano"}, "Etano"));
            dataBaseHelper.addInitialQuestion(new Question("O nome do seguinte composto CH3-CH2-CH2-CH2-CH2-CH2-CH2-CH2-CH3 é o seguinte:","10","1",
                    new String[]{"Decano", "Dodecano", "Nonano", "Octano"}, "Nonano"));
            dataBaseHelper.addInitialQuestion(new Question("Heptano é nome do seguinte composto:","10","1",
                    new String[]{"CH3-CH2-CH2-CH2-CH2-CH2-CH3", "CH3-CH2-CH2-CH2-CH3", "CH3-CH2-CH2-CH-2CH2-CH3", "CH3-CH2-CH2-CH2-CH2-CH2-CH2-CH3"}, "CH3-CH2-CH2-CH2-CH2-CH2-CH3"));
            dataBaseHelper.addInitialQuestion(new Question("Octano é nome do seguinte composto:","10","1",
                    new String[]{"CH3-CH2-CH2-CH2-CH2-CH2-CH2-CH2-CH3", "CH3-CH2-CH2-CH2-CH2-CH3", "CH3-CH2-CH2-CH2-CH2-CH2-CH2-CH3", "CH3-CH2-CH2-CH3"}, "CH3-CH2-CH2-CH2-CH2-CH2-CH2-CH2-CH3"));
            dataBaseHelper.addInitialQuestion(new Question("O nome do seguinte composto C4H10 é:","10","1",
                    new String[]{"Propano", "pentano", "Butano", "Decano"}, "Butano"));
            dataBaseHelper.addInitialQuestion(new Question("O formula molecular do propano é:","10","1",
                    new String[]{"C2H6", "C4H4", "C3H8", "C5H13"}, "C3H8"));
            dataBaseHelper.addInitialQuestion(new Question("A formula racional do pentano é a seguinte:","10","1",
                    new String[]{"CH3-CH2-CH2-CH2-CH3", "CH3-CH2-CH2-CH3", "CH3-CH2-CH3", "CH3"}, "CH3-CH2-CH2-CH2-CH3"));
            dataBaseHelper.addInitialQuestion(new Question("Esta é a questão 3 da 10ª classe nivel 2?","10","2",
                    new String[]{"2001", "2003", "2004", "2005"}, "2005"));

            dataBaseHelper.addInitialQuestion(new Question("A fórmula geral dos alcanos é:","10","2",
                    new String[]{"CnH2n+2", "CnH2n-2", "CnHn+2", "CnH2n"}, "CnH2n+2"));
            dataBaseHelper.addInitialQuestion(new Question("Em Química, IUPAC significa:","10","2",
                    new String[]{"União internacional de Química aplicada", "União internacional de Química pura e aplicada", "União internacional de Química", "União internacional de Quimica aplicada"}, "União internacional de Química pura e aplicada"));
            dataBaseHelper.addInitialQuestion(new Question("É correcto afirmar que a nomenclatura IUPAC e USUAL corresponde aos seguintes nomes respectivamente:","10","2",
                    new String[]{"Oficial e trivial dos compostos orgânicos", "Tradicional e oficial dos compostos orgânicos", "Antigo e recente dos compostos orgânicos", "Antigo e tradicional compostos orgânicos"}, "Oficial e trivial dos compostos orgânicos"));
            dataBaseHelper.addInitialQuestion(new Question("Para dar nome (IUPAC) aos alcanos de cadeia normal é necessário:","10","2",
                    new String[]{"Indentificar a cadeia mais longa e de seguida indicar a posição dos radicais", "Enumerar os átomos de carbono a partir da estremidade mais próxima da ramificação", "Aplicar a regra: prefixo + terminação ‘ano’", "Identificar a posição dos radicais e por fim enumerar os átomos de carbono"}, "Aplicar a regra: prefixo + terminação ‘ano’"));
            dataBaseHelper.addInitialQuestion(new Question("Os prefixos, oct, but, et, hept, nom e met correspondem aos seguintes números:","10","2",
                    new String[]{"1, 2, 3, 4, 5 e 6", "2, 3, 5, 7, 8 e 9", "8, 4, 2, 7, 9 e 1", "1, 4, 5, 7, 2 e 3"}, "8, 4, 2, 7, 9 e 1"));
            dataBaseHelper.addInitialQuestion(new Question("Os nomes correctos dos radicais CH3- e CH3—CH2-, são respectivamente:","10","2",
                    new String[]{"Etil e Metil", "Metil e Etil", "Propil e Etil", "Butil e Etil"}, "Metil e Etil"));
            dataBaseHelper.addInitialQuestion(new Question("A representação correcta do radical propil é:","10","2",
                    new String[]{"CH3—CH2-", "CH3—CH2—CH2-", "CH3—CH2—CH2—CH3", "CH3—CH2—CH3"}, "CH3—CH2—CH2-"));
            dataBaseHelper.addInitialQuestion(new Question("São exemplos de alguns prefixos usados para designar radicais na nomenclatura dos alcanos:","10","2",
                    new String[]{"Met, prop, e di", "Di, tri, tetra", "Met, but e pent", "But, tetra e tri"}, "Met, but e pent"));
            dataBaseHelper.addInitialQuestion(new Question("O nome do radical correspondente ao composto CH4 é:","10","2",
                    new String[]{"Metano", "Metil", "Etil", "Etano"}, "Metil"));
            dataBaseHelper.addInitialQuestion(new Question("O butano é um composto constituído por:","10","2",
                    new String[]{"Dois átomos de carbono e 5 átomos de hidrogénio", "Três átomos de carbono e 4 átomos de hidrogenio", "Quatro átomos de carbono e 10 átomos de hidrogénio", "Cinco átomos de carbono e 3 de hidrogenio"}, "Quatro átomos de carbono e 10 átomos de hidrogénio"));
            dataBaseHelper.addInitialQuestion(new Question("1A estrutura correcta do radical butil é:","10","2",
                    new String[]{"CH3—CH2—CH2—CH3", "CH3—CH2—CH2—CH2-", "CH3—CH2—CH2-", "CH3—CH2-"}, "CH3—CH2—CH2—CH2-"));
            dataBaseHelper.addInitialQuestion(new Question("Esta é a questão 3 da 10ª classe nivel 2?","10","2",
                    new String[]{"2001", "2003", "2004", "2005"}, "2005"));
            dataBaseHelper.addInitialQuestion(new Question("Esta é a questão 3 da 10ª classe nivel 2?","10","2",
                    new String[]{"2001", "2003", "2004", "2005"}, "2005"));

            dataBaseHelper.addInitialQuestion(new Question("Complete a seguinte equação: CH3 – CH3 + Cl-Cl →","10","3",
                    new String[]{"Cl-CH3-CH3-Cl", "CH3-CH2-Cl + HCl", "CH3-CH3 + Cl2", "Cl-CH2-CH2-Cl + H2"}, "CH3-CH2-Cl + HCl"));
            dataBaseHelper.addInitialQuestion(new Question("A reacção de combustão completa do metano é:","10","3",
                    new String[]{"CH4 + O2 → CO2 + H2O", "CH3-CH3 + O2 → CO2 + H2O", "CH4 + O2 → CO + H2", "CH3-CH3 + O2 → CO + H2O"}, "CH4 + O2 → CO2 + H2O"));
            dataBaseHelper.addInitialQuestion(new Question("Complete a equação da reacção de nitração do propano: CH3-CH2-CH3 + HNO3 →","10","3",
                    new String[]{"NO2-CH2-CH2-CH3", "CH3-CH(NO2)-CH3 + H2O", "CH3-CH2-CH2-NO2 + H2O", "CH3-CH(NO)-CH3 + H2O2"}, "CH3-CH(NO2)-CH3 + H2O"));
            dataBaseHelper.addInitialQuestion(new Question("Na nitração, o alcano reage com___________ e um hidrogénio é substituído pelo grupo ________.","10","3",
                    new String[]{"Oxigénio, Hidroxilo", "Ácido sulfúrico, sulfôrnico", "Ácido nítrico, nitro", "Ácido nitroso, nitronico"}, "Ácido nítrico, nitro"));
            dataBaseHelper.addInitialQuestion(new Question("Complete a seguinte equação: CH3-CH2-CH3 + H2SO4 →","10","3",
                    new String[]{"CH3-CH(SO2H)-CH3 + H2O2", "CH3-CH(SO3H)-CH3 + H2O", "SO3H-CH2-CH2-CH3 + H2O", "CH3-CH(SO3H)-CH3"}, "CH3-CH(SO3H)-CH3 + H2O"));
            dataBaseHelper.addInitialQuestion(new Question("Os alcinos sofrem reacções de:","10","3",
                    new String[]{"Adição", "Substituição", "Redox", "Dupla troca"}, "Adição"));
            dataBaseHelper.addInitialQuestion(new Question("A hidrogenação do acetileno forma o:","10","3",
                    new String[]{"Eteno", "Etino", "Etanol", "Etanal"}, "Eteno"));
            dataBaseHelper.addInitialQuestion(new Question("Complete a equação da reacção de adição do Cl ao propino:CH3 – C Ξ CH + 2Cl2 →","10","3",
                    new String[]{"CH3-CH(Cl2)-CHCl2", "CH3-CH(Cl)-CHCl", "CH3-CH2-CH3 + Cl", "CH3-CH2(Cl)-CH3"}, "CH3-CH(Cl2)-CHCl2"));
            dataBaseHelper.addInitialQuestion(new Question("O processo de adição de água nos alcinos ocorre de maneira análoga à hidratação dos alcenos, porém, o produto - um enol - tautomeriza-se na forma cetónica ou aldeídica, dependendo da estrutura da cadeia carbónica. Complete a seguinte equação da reacção do propino com a água: CH3 – C Ξ CH + H2O →","10","3",
                    new String[]{"CH3-CH(OH)=CH2 → CH3 – CO – CH3", "CH2=CH2 – CH3 → CH3-CH2 – OH", "CH2=CH2 – CH2(OH) → CH3=CH2 – CH2-OH", "CH2-CH2-CHO "}, "CH3-CH(OH)=CH2 → CH3 – CO – CH3"));
            dataBaseHelper.addInitialQuestion(new Question("Os alcinos reagem com ________ formando ________.","10","3",
                    new String[]{"Ametais, alciletos", "Metais alcalinos, acetiletos", "Metais de transição, bases", "Nenhuma das alternativas"}, "Metais alcalinos, acetiletos"));
            dataBaseHelper.addInitialQuestion(new Question("A reacção de combustão incompleta do etimo é:","10","3",
                    new String[]{"CH4 + O2 → CO2 + H2O", "C2H2 + O2 → CO + H2O", "CH4 + O2 → CO + H2O", "CH3-CH3 + O2 → CO + H2O"}, "CH3-CH3 + O2 → CO + H2O"));
            dataBaseHelper.addInitialQuestion(new Question("Complete a equação da reacção de adição do Cl ao propino: CH3 – C Ξ CH + 2Br2 →","10","3",
                    new String[]{"CH3-CH(Br2)-CHBr2", "CH3-CH(Cl)-CHCl", "CH3-CH2-CH3 + Cl", "CH3-CH2(Cl)-CH3"}, "CH3-CH(Br2)-CHBr2"));
            dataBaseHelper.addInitialQuestion(new Question("A reacção de combustão completa do propino é:","10","3",
                    new String[]{"C3H4 + O2 → CO2 + H2O", "C2H2 + O2 → CO + H2O", "CH4 + O2 → CO + H2O", "CH3-CH3 + O2 → CO + H2O"}, "C3H4 + O2 → CO2 + H2O"));

            dataBaseHelper.addInitialQuestion(new Question("Esta é a questão 1 da 11ª classe nivel 1?","11","1",
                    new String[]{"2001", "2003", "2004", "2005"}, "2005"));
            dataBaseHelper.addInitialQuestion(new Question("Esta é a questão 2 da 11ª classe nivel 1?","11","1",
                    new String[]{"2001", "2003", "2004", "2005"}, "2005"));
            dataBaseHelper.addInitialQuestion(new Question("Esta é a questão 3 da 11ª classe nivel 1?","11","1",
                    new String[]{"2001", "2003", "2004", "2005"}, "2005"));

            dataBaseHelper.addInitialQuestion(new Question("Esta é a questão 1 da 11ª classe nivel 2?","11","2",
                    new String[]{"2001", "2003", "2004", "2005"}, "2005"));
            dataBaseHelper.addInitialQuestion(new Question("Esta é a questão 2 da 11ª classe nivel 2?","11","2",
                    new String[]{"2001", "2003", "2004", "2005"}, "2005"));
            dataBaseHelper.addInitialQuestion(new Question("Esta é a questão 3 da 11ª classe nivel 2?","11","2",
                    new String[]{"2001", "2003", "2004", "2005"}, "2005"));

            dataBaseHelper.addInitialQuestion(new Question("Esta é a questão 1 da 11ª classe nivel 3?","11","3",
                    new String[]{"2001", "2003", "2004", "2005"}, "2005"));
            dataBaseHelper.addInitialQuestion(new Question("Esta é a questão 2 da 11ª classe nivel 3?","11","3",
                    new String[]{"2001", "2003", "2004", "2005"}, "2005"));
            dataBaseHelper.addInitialQuestion(new Question("Esta é a questão 3 da 11ª classe nivel 3?","11","3",
                    new String[]{"2001", "2003", "2004", "2005"}, "2005"));

            dataBaseHelper.addInitialQuestion(new Question("Esta é a questão 1 da 12ª classe nivel 1?","12","1",
                    new String[]{"2001", "2003", "2004", "2005"}, "2005"));
            dataBaseHelper.addInitialQuestion(new Question("Esta é a questão 2 da 12ª classe nivel 1?","12","1",
                    new String[]{"2001", "2003", "2004", "2005"}, "2005"));
            dataBaseHelper.addInitialQuestion(new Question("Esta é a questão 3 da 12ª classe nivel 1?","12","1",
                    new String[]{"2001", "2003", "2004", "2005"}, "2005"));

            dataBaseHelper.addInitialQuestion(new Question("Esta é a questão 1 da 12ª classe nivel 2?","12","2",
                    new String[]{"2001", "2003", "2004", "2005"}, "2005"));
            dataBaseHelper.addInitialQuestion(new Question("Esta é a questão 2 da 12ª classe nivel 2?","12","2",
                    new String[]{"2001", "2003", "2004", "2005"}, "2005"));
            dataBaseHelper.addInitialQuestion(new Question("Esta é a questão 3 da 12ª classe nivel 2?","12","2",
                    new String[]{"2001", "2003", "2004", "2005"}, "2005"));

            dataBaseHelper.addInitialQuestion(new Question("Esta é a questão 1 da 12ª classe nivel 3?","12","3",
                    new String[]{"2001", "2003", "2004", "2005"}, "2005"));
            dataBaseHelper.addInitialQuestion(new Question("Esta é a questão 2 da 12ª classe nivel 3?","12","3",
                    new String[]{"2001", "2003", "2004", "2005"}, "2005"));
            dataBaseHelper.addInitialQuestion(new Question("Esta é a questão 3 da 12ª classe nivel 3?","12","3",
                    new String[]{"2001", "2003", "2004", "2005"}, "2005"));

            list = dataBaseHelper.getAllQuestionsList();//get list from database again

        }
    }
}
