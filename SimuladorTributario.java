public class SimuladorTributario {
    public static double calcularImpostoAntigo(double valorFaturamento, int aliquotaBase){
        return valorFaturamento * (aliquotaBase/100.0);
    }

    public static double calcularImpostoProposto (double valorFaturamento, int aliquotaProposta){
        return valorFaturamento * (aliquotaProposta/100.0);
    }

    public static double calcularDiferenca (double impostoAntigo, double impostoProposto){
        return Math.abs(impostoProposto - impostoAntigo);
    }

    public void statusDialogo(boolean acessoAoGoverno) {
        if (acessoAoGoverno) {
            System.out.println("STATUS: Diálogo aberto. Há espaço para negociação.");
        } else {
            System.out.println("STATUS: Fintechs reclamam de falta de acesso ao governo. Risco de derrota política.");
        }
    }

    public static void main(String[] args){
        double faturamento = 50_000_000.00;
        int aliquotaBase1 = 9;
        int aliquotaProposta1 = 15;

        double impostoAntigo1 = calcularImpostoAntigo(faturamento, aliquotaBase1);
        double impostoProposto1 = calcularImpostoProposto(faturamento, aliquotaProposta1);
        double diferenca1 = calcularDiferenca(impostoAntigo1, impostoProposto1);

        System.out.println("Cenário 1 - De " + aliquotaBase1 + "% para " + aliquotaProposta1 + "%");
        System.out.println("Imposto Antigo: R$ " + impostoAntigo1);
        System.out.println("Imposto Proposto: R$ " + impostoProposto1);
        System.out.println("Diferença: R$ " + diferenca1 + "\n");

        int aliquotaBase2 = 15;
        int aliquotaProposta2 = 20;

        double impostoAntigo2 = calcularImpostoAntigo(faturamento, aliquotaBase2);
        double impostoProposto2 = calcularImpostoProposto(faturamento, aliquotaProposta2);
        double diferenca2 = calcularDiferenca(impostoAntigo2, impostoProposto2);

        System.out.println("Cenário 2 - De " + aliquotaBase2 + "% para " + aliquotaProposta2 + "%");
        System.out.println("Imposto Antigo: R$ " + impostoAntigo2);
        System.out.println("Imposto Proposto: R$ " + impostoProposto2);
        System.out.println("Diferença: R$ " + diferenca2 + "\n");

        SimuladorTributario simulador = new SimuladorTributario();
        simulador.statusDialogo(true);
        simulador.statusDialogo(false);

    }
}
