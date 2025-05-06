import javax.swing.JOptionPane;

public class ImpostoDeRendaGUI {
    public static void main(String[] args) {
        try {
            String entrada = JOptionPane.showInputDialog("Informe o salário:");

            // Cancelado ou vazio
            if (entrada == null || entrada.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Entrada inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double salario = Double.parseDouble(entrada.trim());
            double imposto = 0.0;
            String mensagem;

            if (salario <= 2000.00) {
                mensagem = "Isento de imposto.";
            } else {
                if (salario <= 3000.00) {
                    imposto = (salario - 2000.00) * 0.08;
                } else if (salario <= 4500.00) {
                    imposto = (1000.00 * 0.08) + ((salario - 3000.00) * 0.18);
                } else {
                    imposto = (1000.00 * 0.08) + (1500.00 * 0.18) + ((salario - 4500.00) * 0.28);
                }
                mensagem = String.format("Valor do imposto a pagar: R$ %.2f", imposto);
            }

            JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor numérico inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}

