public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDaLiz = new Conta(6646,969060);
        System.out.println(contaDaLiz.getSaldo());

        contaDaLiz.setTitular(new Cliente());
        System.out.println(contaDaLiz.getTitular());

        contaDaLiz.getTitular().setNome("Liz");
        System.out.println(contaDaLiz.getTitular().getNome());

    }
}
