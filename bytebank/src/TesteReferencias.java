public class TesteReferencias {
        public TesteReferencias() {
        }

        public static void main(String[] args) {
            Gerente g1 = new Gerente();
            g1.setNome("Marcos");
            g1.setSalario(5000.0D);
            EditorVideo ev = new EditorVideo();
            ev.setSalario(2500.0D);
            Designer d = new Designer();
            d.setSalario(2000.0D);
            ControleBonificacao controle = new ControleBonificacao();
            controle.registra(g1);
            controle.registra(ev);
            controle.registra(d);
            System.out.println(controle.getSoma());
        }
    }
