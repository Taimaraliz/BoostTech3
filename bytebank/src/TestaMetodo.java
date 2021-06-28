public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDaTaimara = new Conta(6646,969060);
        contaDaTaimara.deposita(100);
        contaDaTaimara.deposita(50);
        System.out.println(contaDaTaimara.getSaldo());

        boolean conseguiuRetirar = contaDaTaimara.saca(20);
        System.out.println(contaDaTaimara.getSaldo());
        System.out.println(conseguiuRetirar);

        Conta contaDaLiz = new Conta(6644,969063);
        contaDaLiz.deposita(1000);

        boolean sucessoTransferencia = contaDaLiz.transfere(300, contaDaTaimara);

        if (sucessoTransferencia) {
            System.out.println("transferencia com sucesso");

        } else {
            System.out.println("faltou dinheiro");

        }
        System.out.println(contaDaLiz.getSaldo());
        System.out.println(contaDaTaimara.getSaldo());
    }
}
