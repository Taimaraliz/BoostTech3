public class TesteBanco {
    public static void main(String[] args) {
        Cliente taimara = new Cliente();
        taimara .setNome("Taimara Liz");
        taimara .setCpf("123.212.123.-33");
        taimara .setProfissao("programadora");

        Conta contaDaTaimara = new Conta(6646,969060);
        contaDaTaimara.deposita(100);

        contaDaTaimara.setTitular(taimara );
        System.out.println(contaDaTaimara.getTitular().getNome());
        System.out.println(contaDaTaimara.getTitular());

    }
}
