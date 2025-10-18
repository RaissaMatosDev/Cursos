import java.util.ArrayList;
import java.util.List;

public class ListLut {
    public static class GerenciadorDeLutadores {
        private List<Lutador> lutador;

        public GerenciadorDeLutadores() {
            lutador = new ArrayList<>(6);
        }

        public void adicionarLutador(Lutador l) {
            lutador.add(l);
        }

        public void apresentarTodos() {
            for (Lutador l : lutador) {
                l.apresentar();
            }
        }
    }
}
