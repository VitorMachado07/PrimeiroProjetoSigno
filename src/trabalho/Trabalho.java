package trabalho;

import java.util.Calendar;
import java.util.Scanner;

public class Trabalho {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Bem-vindo ao Guru-Online.");
        System.out.println("Insira seu nome:");
        String nome = ler.nextLine();
        if (nome.length() < 8) {
            nome = "legal se seu nome fosse verdadeiro";
        }

        System.out.println("Insira seu sexo. 1 - feminino / 2 - masculino:");
        int sexo = ler.nextInt();
        if (sexo != 1 && sexo != 2) {
            sexo = 2;
        }

        int diaNasc, mesNasc, anoNasc;
        do {
            System.out.println("Insira seu mês de nascimento (1-12):");
            mesNasc = ler.nextInt();
        } while (mesNasc < 1 || mesNasc > 12);

        int maxDias = maxDiasNoMes(mesNasc);
        do {
            System.out.println("Insira seu dia de nascimento (1-" + maxDias + "):");
            diaNasc = ler.nextInt();
        } while (diaNasc < 1 || diaNasc > maxDias);

        do {
            System.out.println("Insira seu ano de nascimento:");
            anoNasc = ler.nextInt();
        } while (anoNasc > 2024);

        Calendar hoje = Calendar.getInstance();
        int diaAtual = hoje.get(Calendar.DATE);
        int mesAtual = hoje.get(Calendar.MONTH) + 1;
        int anoAtual = hoje.get(Calendar.YEAR);

        int idade = ((anoAtual * 365 + mesAtual * 30 + diaAtual) - (anoNasc * 365 + mesNasc * 30 + diaNasc)) / 365;

        int numSorte = (int) (1 + Math.random() * 99);

        String signo = usaSigno(diaNasc, mesNasc);

        if (sexo == 1) {
            System.out.println("Sra. " + nome + ", nascida no dia " + diaNasc + "-" + mesNasc + "-" + anoNasc
                    + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é "
                    + numSorte + " e sua cor: violeta.");
        } else {
            System.out.println("Sr. " + nome + ", nascido no dia " + diaNasc + "-" + mesNasc + "-" + anoNasc
                    + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é "
                    + numSorte + " e sua cor: verde.");
        }
    }

    public static int maxDiasNoMes(int mes) {
        switch (mes) {
            case 2:
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    public static String usaSigno(int diaNasc, int mesNasc) {
        String signo = "";

        if ((diaNasc >= 21 && mesNasc == 3) || (diaNasc <= 20 && mesNasc == 4)) {
            signo = "Áries";
        } else if ((diaNasc >= 21 && mesNasc == 4) || (diaNasc <= 20 && mesNasc == 5)) {
            signo = "Touro";
        } else if ((diaNasc >= 21 && mesNasc == 5) || (diaNasc <= 20 && mesNasc == 6)) {
            signo = "Gêmeos";
        } else if ((diaNasc >= 21 && mesNasc == 6) || (diaNasc <= 21 && mesNasc == 7)) {
            signo = "Câncer";
        } else if ((diaNasc >= 22 && mesNasc == 7) || (diaNasc <= 22 && mesNasc == 8)) {
            signo = "Leão";
        } else if ((diaNasc >= 23 && mesNasc == 8) || (diaNasc <= 22 && mesNasc == 9)) {
            signo = "Virgem";
        } else if ((diaNasc >= 23 && mesNasc == 9) || (diaNasc <= 22 && mesNasc == 10)) {
            signo = "Libra";
        } else if ((diaNasc >= 23 && mesNasc == 10) || (diaNasc <= 21 && mesNasc == 11)) {
            signo = "Escorpião";
        } else if ((diaNasc >= 22 && mesNasc == 11) || (diaNasc <= 21 && mesNasc == 12)) {
            signo = "Sagitário";
        } else if ((diaNasc >= 22 && mesNasc == 12) || (diaNasc <= 20 && mesNasc == 1)) {
            signo = "Capricórnio";
        } else if ((diaNasc >= 21 && mesNasc == 1) || (diaNasc <= 19 && mesNasc == 2)) {
            signo = "Aquário";
        } else if ((diaNasc >= 20 && mesNasc == 2) || (diaNasc <= 20 && mesNasc == 3)) {
            signo = "Peixes";
        }

        return signo;
    }

        

    }


