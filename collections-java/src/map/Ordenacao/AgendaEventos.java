package map.Ordenacao;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
    private final Map<LocalDate, Evento> agendaEventosMap = new HashMap<>();

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        agendaEventosMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O próxímo " + entry.getValue() + " acontecerá na data " + entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();
        agenda.adicionarEvento(LocalDate.of(2024, 7, 15), "Evento 1", "Atração 1");
        agenda.adicionarEvento(LocalDate.of(2999, 9, 19), "Evento 2", "Atração 2");
        agenda.adicionarEvento(LocalDate.of(2023, 7, 15), "Evento 3", "Atração 3");
        agenda.exibirAgenda();
        agenda.obterProximoEvento();
    }
}
