package Application.Map;

import Map.Entities.Ordenacao.AgendaEventos;

import java.time.LocalDate;

public class MapOrdenacao {

    public static void main(String[] args) {

        AgendaEventos ae = new AgendaEventos();
        ae.adicionarEvento(LocalDate.of(2022, 7, 15), "Evento 1", "Atração 1");
        ae.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atração 2");
        ae.adicionarEvento(LocalDate.of(2000, 1, 10), "Evento 3", "Atração 3");
        ae.adicionarEvento(LocalDate.now(), "Evento 4", "Atração 1");
        ae.adicionarEvento(LocalDate.of(2099, 12, 30), "Evento 5", "Atração 1");

        ae.exibirAgenda();
        ae.obterProximoEvento();
    }
}
